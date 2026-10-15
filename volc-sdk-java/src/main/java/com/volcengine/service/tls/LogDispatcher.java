package com.volcengine.service.tls;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnknownFieldSet;
import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.FailurePolicy;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.producer.RetryMode;
import com.volcengine.service.tls.stats.ProducerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.Instant;
import java.util.Collections;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.SEPARATOR;

public class LogDispatcher {
    public static final String TLS_THREAD_POOL_FORMAT = "dispatcher-thread-%d";
    private static final long DEFAULT_FORCE_ADMISSION_DRAIN_TIMEOUT_MS = 2000L;
    private final ProducerConfig producerConfig;
    private final ExecutorService executorService;
    private TLSLogClient client;
    private final String producerName;
    private final BlockingQueue<BatchLog> successQueue;
    private final BlockingQueue<BatchLog> failureQueue;
    private static final Log LOG = LogFactory.getLog(LogDispatcher.class);
    private final Object addLogLock = new Object();
    private int activeAdmissions;
    private volatile boolean closed;
    private final MemoryLimiter memoryLimiter;
    private final AtomicInteger batchCount;
    private final RetryManager retryManager;
    private final CircuitBreaker circuitBreaker;
    private final ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches;
    private final ProducerStatsState statsState;

    /**
     * Backward-compatible constructor for callers that predate local health stats; uses a
     * disabled stats state so behavior is unchanged.
     */
    public LogDispatcher(ProducerConfig producerConfig, String producerName, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, MemoryLimiter memoryLimiter,
                         AtomicInteger batchCount, RetryManager retryManager, CircuitBreaker circuitBreaker)
            throws LogException {
        this(producerConfig, producerName, successQueue, failureQueue, memoryLimiter, batchCount, retryManager,
                circuitBreaker, ProducerStatsState.disabled());
    }

    public LogDispatcher(ProducerConfig producerConfig, String producerName, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, MemoryLimiter memoryLimiter,
                         AtomicInteger batchCount, RetryManager retryManager, CircuitBreaker circuitBreaker,
                         ProducerStatsState statsState) throws LogException {
        this.producerConfig = producerConfig;
        this.producerName = producerName;
        this.statsState = statsState;
        final ThreadFactory delegateThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat(producerName + SEPARATOR + TLS_THREAD_POOL_FORMAT)
                .setDaemon(true)
                .build();
        this.executorService = Executors.newFixedThreadPool(
                producerConfig.getMaxThreadCount(),
                runnable -> delegateThreadFactory.newThread(() -> {
                    statsState.onSenderWorkerStarted();
                    try {
                        runnable.run();
                    } finally {
                        statsState.onSenderWorkerStopped();
                    }
                }));
        this.memoryLimiter = memoryLimiter;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.batches = new ConcurrentHashMap<>();
        this.batchCount = batchCount;
        this.retryManager = retryManager;
        this.circuitBreaker = circuitBreaker;
        ClientConfig clientSnapshot = producerManagedClientSnapshot(producerConfig.getClientConfig());
        TLSLogClientImpl producerClient = (TLSLogClientImpl) ClientBuilder.newClient(clientSnapshot);
        if (producerConfig.getRetryMode() == RetryMode.PRODUCER_MANAGED) {
            producerClient.useProducerManagedRetryOwner();
        }
        this.client = producerClient;
        this.client.setHttpClientConnectionManager(TLSUtil.createHttpClientConnectionManager(
                        clientSnapshot.isVerifySsl()),
                true);
    }

    public TLSLogClient getClient() {
        return client;
    }

    public ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> getBatches() {
        return batches;
    }

    public MemoryLimiter getMemoryLimiter() {
        return memoryLimiter;
    }

    public CircuitBreaker getCircuitBreaker() {
        return circuitBreaker;
    }

    public ProducerStatsState getStatsState() {
        return statsState;
    }

    public void start() {
        synchronized (addLogLock) {
            this.closed = false;
        }
        LOG.info(String.format("log dispatcher %s started and client init success", producerName));
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public void close() {
        closeAdmissionsUninterruptibly();
    }

    /**
     * Starts graceful close and waits at most {@code timeoutMs} for already-admitted sends.
     * A timeout keeps payload admission open for those winners while the closed gate rejects every
     * later send; the caller may retry close after the admitted operations finish.
     */
    public boolean close(long timeoutMs) throws InterruptedException {
        synchronized (addLogLock) {
            closed = true;
            long timeoutNanos = TimeUnit.MILLISECONDS.toNanos(Math.max(0L, timeoutMs));
            long started = System.nanoTime();
            while (activeAdmissions != 0) {
                long elapsed = System.nanoTime() - started;
                long remains = timeoutNanos - elapsed;
                if (remains <= 0L) return false;
                TimeUnit.NANOSECONDS.timedWait(addLogLock, remains);
            }
        }
        memoryLimiter.closePayload();
        return true;
    }

    public void closeNow() {
        if (!closeNow(DEFAULT_FORCE_ADMISSION_DRAIN_TIMEOUT_MS)) {
            throw new IllegalStateException("timed out cancelling admitted producer sends");
        }
    }

    /**
     * Force close has a different winner contract from graceful close: already-admitted operations
     * that have not acquired payload ownership are cancelled. Close the admission gate first, then
     * close the limiter outside {@code addLogLock} so a real capacity waiter is woken before the
     * bounded admission barrier. Executor interruption is issued even if a non-cooperative admission
     * fails to drain, and the caller receives that failure explicitly.
     */
    boolean closeNow(long timeoutMs) {
        long startedNanos = System.nanoTime();
        synchronized (addLogLock) {
            closed = true;
        }
        memoryLimiter.close();

        boolean interrupted = false;
        boolean drained;
        synchronized (addLogLock) {
            long timeoutNanos = TimeUnit.MILLISECONDS.toNanos(Math.max(0L, timeoutMs));
            while (activeAdmissions != 0) {
                long remains = timeoutNanos - (System.nanoTime() - startedNanos);
                if (remains <= 0L) break;
                try {
                    TimeUnit.NANOSECONDS.timedWait(addLogLock, remains);
                } catch (InterruptedException e) {
                    interrupted = true;
                }
            }
            drained = activeAdmissions == 0;
        }
        executorService.shutdownNow();
        if (interrupted) Thread.currentThread().interrupt();
        return drained;
    }

    private void closeAdmissionsUninterruptibly() {
        boolean interrupted = false;
        synchronized (addLogLock) {
            closed = true;
            while (activeAdmissions != 0) {
                try {
                    addLogLock.wait();
                } catch (InterruptedException e) {
                    interrupted = true;
                }
            }
        }
        // beginAdmission winners complete against the original payload budget. Closing memory only
        // after they leave prevents close from turning an admitted operation into CLOSED halfway.
        memoryLimiter.closePayload();
        if (interrupted) Thread.currentThread().interrupt();
    }

    private BatchLog.BatchManager getOrCreateBatchManager(BatchLog.BatchKey batchKey) {
        BatchLog.BatchManager batchManager = batches.get(batchKey);
        if (batchManager != null) {
            return batchManager;
        }
        batchManager = new BatchLog.BatchManager();
        BatchLog.BatchManager original = batches.putIfAbsent(batchKey, batchManager);
        return original != null ? original : batchManager;
    }

    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) {
        ClientConfig clientConfig = producerConfig.getClientConfig();
        clientConfig.resetAccessKeyToken(accessKey, secretKey, securityToken);
        client.resetAccessKeyToken(accessKey, secretKey, securityToken);
        LOG.info(String.format("log dispatcher %s credentials updated successfully", producerName));
    }

    public void setApiKey(String apiKey) {
        ClientConfig clientConfig = producerConfig.getClientConfig();
        clientConfig.setApiKey(apiKey);
        client.setApiKey(apiKey);
        LOG.info(String.format("log dispatcher %s api key updated successfully", producerName));
    }

    public void addBatch(String hashKey, String topicId, String source, String filename,
                         PutLogRequest.LogGroup logGroup, CallBack callBack) throws InterruptedException, LogException {
        beginAdmission();
        try {
            doAdd(hashKey, topicId, source, filename, logGroup, callBack);
        } finally {
            endAdmission();
        }
    }

    private void beginAdmission() throws LogException {
        synchronized (addLogLock) {
            if (closed) {
                statsState.onRejectedClosed();
                throw new LogException("Producer Error", "closed LogDispatcher cannot receive logs anymore", null);
            }
            activeAdmissions++;
        }
    }

    private void endAdmission() {
        synchronized (addLogLock) {
            activeAdmissions--;
            if (activeAdmissions < 0) throw new IllegalStateException("negative active admission count");
            if (activeAdmissions == 0) addLogLock.notifyAll();
        }
    }

    private void doAdd(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws LogException, InterruptedException {
        // addBatch established the admission/close linearization point before entering this method.
        int logCount = 0;
        long earliestLogTime = Long.MAX_VALUE;
        long latestLogTime = Long.MIN_VALUE;
        PutLogRequest.LogGroup.Builder groupBuilder = logGroup.toBuilder();
        for (int i = 0; i < groupBuilder.getLogsCount(); i++) {
            PutLogRequest.Log log = groupBuilder.getLogs(i);
            long time = log.getTime();
            if (time <= 0) {
                Instant now = Instant.now();
                time = now.toEpochMilli();
                PutLogRequest.Log.Builder logBuilder = log.toBuilder().setTime(time);
                if (producerConfig.isEnableNanosecond()) {
                    int timeNs = now.getNano() % 1_000_000;
                    UnknownFieldSet.Field field = UnknownFieldSet.Field.newBuilder().addFixed32(timeNs).build();
                    UnknownFieldSet unknownFieldSet = UnknownFieldSet.newBuilder().addField(3, field).build();
                    logBuilder.mergeUnknownFields(unknownFieldSet);
                }
                PutLogRequest.Log newLog = logBuilder.build();
                groupBuilder.setLogs(i, newLog);
            }
            logCount++;
            long normalizedTime;
            if (time < 1e10) { // s
                normalizedTime = time * 1000;
            } else if (time < 1e15) { // ms
                normalizedTime = time;
            } else { // ns
                normalizedTime = time / 1_000_000;
            }
            earliestLogTime = Math.min(earliestLogTime, normalizedTime);
            latestLogTime = Math.max(latestLogTime, normalizedTime);
        }
        if (logCount == 0) {
            earliestLogTime = 0;
            latestLogTime = 0;
        }
        logGroup = groupBuilder.build();
        int batchSize = calculateSize(logGroup);
        try {
            producerConfig.checkBatchSize(batchSize);
        } catch (LogException e) {
            statsState.onRejectedInvalidArgument();
            throw e;
        }
        int circuitPermitCount = 0;
        if (producerConfig.getFailurePolicy() != FailurePolicy.RETRY_THEN_CALLBACK) {
            circuitPermitCount = circuitBreaker.acquirePermit();
            if (circuitPermitCount < 0) {
                statsState.onRejectedCircuitOpen();
                handleOpenCircuit(callBack);
                return;
            }
        }
        // wait add lock
        long maxBlockMs = producerConfig.getMaxBlockMs();
        LOG.debug(String.format("dispatcher %s try acquire memory lock ", producerName));

        long acceptanceGeneration = statsState.acquirePayloadAndAcceptGeneration(memoryLimiter, batchSize, maxBlockMs,
                logCount);
        if (acceptanceGeneration < 0) {
            if (closed) statsState.onRejectedClosed();
            else statsState.onRejectedMemoryFull();
            circuitBreaker.releasePermits(circuitPermitCount);
            LOG.warn(String.format("Failed to acquire memory within the configured max blocking time %d ms, requiredSizeInBytes=%d, usedSizeInBytes=%d",
                    producerConfig.getMaxBlockMs(), batchSize, memoryLimiter.getUsedBytes()));
            throw new LogException("Producer Error", String.format("dispatcher %s try acquire memory lock failed", producerName), null);
        }
        // add batch
        // Count acceptance BEFORE buffering the group into a batch. addToBatchManager may fill and
        // synchronously submit the batch (addNow), after which a sender/handler thread can settle it
        // into a terminal bucket. If the accept were recorded only afterwards, a concurrent snapshot
        // could observe that terminal settlement while accepted still lagged, momentarily breaking the
        // conservation invariant (Sterminal <= accepted). Recording accept first closes that window.
        // The group is not yet in any batch here, so if buffering throws the accept is rolled back
        // (compensating undo) — accepted is never counted without a batch that will settle.
        BatchLog.BatchKey batchKey = new BatchLog.BatchKey(hashKey, topicId, source, filename,
                acceptanceGeneration);
        BatchLog.BatchManager batchManager = null;
        try {
            while (true) {
                batchManager = getOrCreateBatchManager(batchKey);
                synchronized (batchManager) {
                    if (batches.get(batchKey) != batchManager) {
                        continue;
                    }
                    addToBatchManager(batchKey, logGroup, callBack, batchSize, batchManager,
                            logCount, earliestLogTime, latestLogTime, circuitPermitCount);
                    if (batchManager.getBatchLog() == null) {
                        batches.remove(batchKey, batchManager);
                    }
                    break;
                }
            }
        } catch (Exception e) {
            if (batchManager != null) {
                synchronized (batchManager) {
                    if (batchManager.getBatchLog() == null) {
                        batches.remove(batchKey, batchManager);
                    }
                }
            }
            statsState.rollbackAcceptedAndRelease(memoryLimiter, batchSize, logCount, acceptanceGeneration);
            circuitBreaker.releasePermits(circuitPermitCount);
            throw new LogException("Producer Error", "dispatcher add batch concurrent error", null);
        }
    }

    private static ClientConfig producerManagedClientSnapshot(ClientConfig source) {
        if (source == null) throw new NullPointerException("clientConfig");
        ClientConfig copy = new ClientConfig(source.getEndpoint(), source.getRegion(),
                source.getAccessKeyId(), source.getAccessKeySecret(), source.getSecurityToken(),
                source.getApiVersion());
        copy.setApiKey(source.getApiKey());
        RetryPolicy retry = source.getRetryPolicy() == null
                ? RetryPolicy.defaultPolicy() : source.getRetryPolicy();
        retry = retry.normalize();
        retry.setMaxAttempts(1);
        copy.setRetryPolicy(retry);
        copy.setRetryDecider(source.getRetryDecider());
        copy.setLocalValidationOnly(source.isLocalValidationOnly());
        copy.setVerifySsl(source.isVerifySsl());
        return copy;
    }

    private void handleOpenCircuit(CallBack callBack) throws LogException {
        if (producerConfig.getFailurePolicy() == FailurePolicy.DROP_WITH_CALLBACK) {
            if (callBack != null) {
                Attempt attempt = new Attempt(false, null, "CircuitOpenException", "producer circuit breaker is open", 0);
                callBack.onComplete(new Result(false, Collections.singletonList(attempt), 1));
            }
            return;
        }
        throw new LogException("Producer Error", "producer circuit breaker is open", null);
    }

    private int calculateSize(PutLogRequest.LogGroup logGroup) {
        if (logGroup == null) {
            return 0;
        }
        int groupSize = logGroup.getSerializedSize();
        int tagSize = CodedOutputStream.computeTagSize(PutLogRequest.LogGroupList.LOGGROUPS_FIELD_NUMBER);
        return tagSize + CodedOutputStream.computeUInt32SizeNoTag(groupSize) + groupSize;
    }

    private void addToBatchManager(BatchLog.BatchKey batchKey, PutLogRequest.LogGroup logGroup, CallBack callBack,
                                   int batchSize, BatchLog.BatchManager batchManager,
                                   int logCount, long earliestLogTime, long latestLogTime,
                                   int circuitPermitCount) throws LogException {
        // add to exist batch
        BatchLog batchLog = batchManager.getBatchLog();
        if (batchLog != null) {
            boolean success = batchLog.tryAdd(logGroup, batchSize, callBack, logCount, earliestLogTime, latestLogTime);
            if (success) {
                batchLog.addAggregatedPayload(memoryLimiter, batchSize);
                statsState.onGroupAggregated(batchLog);
                batchLog.addCircuitPermitCount(circuitPermitCount);
                if (batchManager.fullAndSendBatchRequest()) {
                    batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue, batchCount, retryManager, memoryLimiter, circuitBreaker);
                }
                return;
            } else {
                batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue, batchCount, retryManager, memoryLimiter, circuitBreaker);
            }
        }
        // no batch create new and try send
        batchLog = new BatchLog(batchKey, producerConfig);
        statsState.onBatchCreated(batchLog);
        batchManager.setBatchLog(batchLog);
        boolean success = batchLog.tryAdd(logGroup, batchSize, callBack, logCount, earliestLogTime, latestLogTime);
        if (!success) {
            LOG.error(String.format("tryAdd batchLog failed, batchKey = %s, batchSize = %d, batchCount = %d",
                    batchKey.toString(), batchSize, logGroup.getLogsCount()));
            throw new LogException("Producer Error", "tryAdd batchLog failed", null);
        }
        batchLog.addAggregatedPayload(memoryLimiter, batchSize);
        statsState.onGroupAggregated(batchLog);
        batchLog.addCircuitPermitCount(circuitPermitCount);
        if (batchManager.fullAndSendBatchRequest()) {
            batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue, batchCount, retryManager, memoryLimiter, circuitBreaker);
        }
    }
}
