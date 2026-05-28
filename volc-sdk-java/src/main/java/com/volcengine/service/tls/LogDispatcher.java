package com.volcengine.service.tls;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnknownFieldSet;
import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.Instant;
import java.util.Collections;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.SEPARATOR;

public class LogDispatcher {
    public static final String TLS_THREAD_POOL_FORMAT = "dispatcher-thread-%d";
    private final ProducerConfig producerConfig;
    private final ExecutorService executorService;
    private TLSLogClient client;
    private final String producerName;
    private final BlockingQueue<BatchLog> successQueue;
    private final BlockingQueue<BatchLog> failureQueue;
    private static final Log LOG = LogFactory.getLog(LogDispatcher.class);
    private final AtomicInteger addLogLock = new AtomicInteger(0);
    private volatile boolean closed;
    private final MemoryLimiter memoryLimiter;
    private final AtomicInteger batchCount;
    private final RetryManager retryManager;
    private final CircuitBreaker circuitBreaker;
    private final ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches;

    public LogDispatcher(ProducerConfig producerConfig, String producerName, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, MemoryLimiter memoryLimiter,
                         AtomicInteger batchCount, RetryManager retryManager, CircuitBreaker circuitBreaker) throws LogException {
        this.producerConfig = producerConfig;
        this.producerName = producerName;
        this.executorService = Executors.newFixedThreadPool(
                producerConfig.getMaxThreadCount(),
                new ThreadFactoryBuilder()
                        .setNameFormat(producerName + SEPARATOR + TLS_THREAD_POOL_FORMAT)
                        .setDaemon(true)
                        .build());
        this.memoryLimiter = memoryLimiter;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.batches = new ConcurrentHashMap<>();
        this.batchCount = batchCount;
        this.retryManager = retryManager;
        this.circuitBreaker = circuitBreaker;
        this.client = ClientBuilder.newClient(producerConfig.getClientConfig());
        this.client.setHttpClientConnectionManager(TLSUtil.createHttpClientConnectionManager(
                        producerConfig.getClientConfig().isVerifySsl()),
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

    public void start() {
        this.closed = false;
        LOG.info(String.format("log dispatcher %s started and client init success", producerName));
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public void close() {
        this.closed = true;
        memoryLimiter.closePayload();
    }

    public void closeNow() {
        this.closed = true;
        memoryLimiter.close();
        executorService.shutdownNow();
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
        LOG.info(String.format("log dispatcher %s update client config %s success", producerName, clientConfig));
    }

    public void setApiKey(String apiKey) {
        ClientConfig clientConfig = producerConfig.getClientConfig();
        clientConfig.setApiKey(apiKey);
        client.setApiKey(apiKey);
        LOG.info(String.format("log dispatcher %s update client config %s success", producerName, clientConfig));
    }

    public void addBatch(String hashKey, String topicId, String source, String filename,
                         PutLogRequest.LogGroup logGroup, CallBack callBack) throws InterruptedException, LogException {
        doAdd(hashKey, topicId, source, filename, logGroup, callBack);
    }

    private void doAdd(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws LogException, InterruptedException {
        // check status and batch size
        if (closed) {
            throw new LogException("Producer Error", "closed LogDispatcher cannot receive logs anymore", null);
        }
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
        producerConfig.checkBatchSize(batchSize);
        int circuitPermitCount = 0;
        if (producerConfig.getFailurePolicy() != FailurePolicy.RETRY_THEN_CALLBACK) {
            circuitPermitCount = circuitBreaker.acquirePermit();
            if (circuitPermitCount < 0) {
                handleOpenCircuit(callBack);
                return;
            }
        }
        // wait add lock
        long maxBlockMs = producerConfig.getMaxBlockMs();
        LOG.debug(String.format("dispatcher %s try acquire memory lock ", producerName));

        boolean acquired = memoryLimiter.acquirePayload(batchSize, maxBlockMs);
        if (!acquired) {
            circuitBreaker.releasePermits(circuitPermitCount);
            LOG.warn(String.format("Failed to acquire memory within the configured max blocking time %d ms, requiredSizeInBytes=%d, usedSizeInBytes=%d",
                    producerConfig.getMaxBlockMs(), batchSize, memoryLimiter.getUsedBytes()));
            throw new LogException("Producer Error", String.format("dispatcher %s try acquire memory lock failed", producerName), null);
        }
        // add batch
        try {
            BatchLog.BatchKey batchKey = new BatchLog.BatchKey(hashKey, topicId, source, filename);
            BatchLog.BatchManager batchManager = getOrCreateBatchManager(batchKey);
            synchronized (batchManager) {
                addToBatchManager(batchKey, logGroup, callBack, batchSize, batchManager,
                        logCount, earliestLogTime, latestLogTime, circuitPermitCount);
            }
        } catch (Exception e) {
            memoryLimiter.releasePayload(batchSize);
            circuitBreaker.releasePermits(circuitPermitCount);
            throw new LogException("Producer Error", "dispatcher add batch concurrent error", null);
        }
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
        batchManager.setBatchLog(batchLog);
        boolean success = batchLog.tryAdd(logGroup, batchSize, callBack, logCount, earliestLogTime, latestLogTime);
        if (!success) {
            LOG.error(String.format("tryAdd batchLog failed, batchKey = %s, batchSize = %d, batchCount = %d",
                    batchKey.toString(), batchSize, logGroup.getLogsCount()));
            throw new LogException("Producer Error", "tryAdd batchLog failed", null);
        }
        batchLog.addCircuitPermitCount(circuitPermitCount);
        if (batchManager.fullAndSendBatchRequest()) {
            batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue, batchCount, retryManager, memoryLimiter, circuitBreaker);
        }
    }
}
