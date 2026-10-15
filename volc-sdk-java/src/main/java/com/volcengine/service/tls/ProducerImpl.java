package com.volcengine.service.tls;

import com.google.protobuf.CodedOutputStream;
import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.util.AdaptorUtil;
import com.volcengine.service.tls.stats.ProducerStatsState;
import com.volcengine.service.tls.stats.StatsClock;
import com.volcengine.service.tls.stats.StatsInstanceId;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.TLS;

public class ProducerImpl implements Producer {
    private static final Log LOG = LogFactory.getLog(ProducerImpl.class);
    private ProducerConfig producerConfig;
    private final LogDispatcher dispatcher;
    private static final AtomicInteger INSTANCE_ID = new AtomicInteger(0);
    private final String name;
    private final MemoryLimiter memoryLimiter;
    private final CircuitBreaker circuitBreaker;
    private final BatchHandler successHandler;
    private final BatchHandler failHandler;
    private final RetryManager retryManager;
    private final AtomicInteger batchCount = new AtomicInteger(0);
    private final Mover mover;
    private final ProducerStatsState statsState;

    public ProducerImpl(ProducerConfig producerConfig) throws LogException {
        producerConfig.validConfig();
        this.producerConfig = producerConfig;
        this.name = TLS + Const.SEPARATOR + INSTANCE_ID.incrementAndGet();
        BlockingQueue<BatchLog> successQueue = new LinkedBlockingQueue<BatchLog>();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<BatchLog>();
        this.memoryLimiter = new MemoryLimiter(producerConfig.getMaxProducerMemoryBytes(),
                producerConfig.getTotalSizeInBytes(), producerConfig.getMetricsLevel() != com.volcengine.model.tls.stats.MetricsLevel.OFF);
        this.circuitBreaker = new CircuitBreaker(producerConfig.getCircuitBreakerConfig());
        this.retryManager = new RetryManager();
        // Local health state (default OFF). Stripe count follows the send thread count, capped inside
        // FixedHistogram. Explicit-view snapshots read only pre-aggregated fixed-size state.
        this.statsState = new ProducerStatsState(
                producerConfig.getMetricsLevel(),
                producerConfig.getMaxThreadCount(),
                memoryLimiter,
                StatsInstanceId.forProducer(),
                StatsClock.SYSTEM);
        this.dispatcher = new LogDispatcher(producerConfig, name, successQueue, failureQueue, memoryLimiter, batchCount, retryManager, circuitBreaker, statsState);
        this.successHandler = new BatchHandler("success batch handler-" + name, memoryLimiter, successQueue, batchCount, statsState, true);
        this.failHandler = new BatchHandler("fail batch handler-" + name, memoryLimiter, failureQueue, batchCount, statsState, false);
        this.mover = new Mover(name + "-mover", producerConfig, dispatcher, retryManager, successQueue, failureQueue, memoryLimiter, circuitBreaker, statsState);
        statsState.bindQueueDepths(
                () -> ((ThreadPoolExecutor) dispatcher.getExecutorService()).getQueue().size(),
                retryManager::size,
                () -> (long) successQueue.size() + failureQueue.size());
    }

    public static Producer defaultProducer(String endpoint, String region, String accessKey, String accessSecret, String token) throws LogException {
        return new ProducerImpl(new ProducerConfig(endpoint, region, accessKey, accessSecret, token));
    }

    public static Producer defaultProducerWithApiKey(String endpoint, String region, String apiKey) throws LogException {
        return new ProducerImpl(new ProducerConfig(endpoint, region, apiKey));
    }

    public static Producer defaultProducerWithApiKey(String endpoint, String region, String apiKey,
                                                     String accessKey, String accessSecret,
                                                     String token) throws LogException {
        return new ProducerImpl(new ProducerConfig(endpoint, region, apiKey, accessKey, accessSecret, token));
    }

    @Deprecated
    /*
     * Please use sendLogV2 instead.
     */
    @Override
    public void sendLog(String hashKey, String topicId, String source, String filename, PutLogRequest.Log log, CallBack callBack)
            throws InterruptedException, LogException {
        if (topicId == null || log == null) {
            statsState.onRejectedInvalidArgument();
            throw new LogException("InvalidArgument", String.format("topic id: %s, log: %s", topicId, log), null);
        }
        PutLogRequest.LogGroup logGroup = PutLogRequest.LogGroup.newBuilder().setFileName(filename).setSource(source).addLogs(log).build();
        sendLogGroup(hashKey, topicId, source, filename, logGroup, callBack);
    }

    @Deprecated
    /*
     * Please use sendLogsV2 instead.
     */
    @Override
    public void sendLogGroup(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws InterruptedException, LogException {
        if (topicId == null || logGroup == null || logGroup.getLogsList() == null || logGroup.getLogsList().size() == 0) {
            statsState.onRejectedInvalidArgument();
            throw new LogException("InvalidArgument", String.format("topic id: %s, log group is empty", topicId), null);
        }
        dispatchLogGroup(hashKey, topicId, source, filename, logGroup, callBack);
    }

    @Override
    public void sendLogV2(String hashKey, String topicId, String source, String filename, LogItem log, CallBack callBack)
            throws InterruptedException, LogException {
        if (log == null) {
            statsState.onRejectedInvalidArgument();
            return;
        }
        List<LogItem> items = new ArrayList<>();
        items.add(log);
        this.sendLogsV2(hashKey, topicId, source, filename, items, callBack);
    }

    @Override
    public void sendLogsV2(String hashKey, String topicId, String source, String filename, List<LogItem> logs, CallBack callBack)
            throws InterruptedException, LogException {
        if (topicId == null || logs == null || logs.size() == 0) {
            statsState.onRejectedInvalidArgument();
            throw new LogException("InvalidArgument", String.format("topic id: %s, log group: %s", topicId, logs), null);
        }
        dispatchLogItems(hashKey, topicId, source, filename, logs, callBack);
    }

    private void dispatchLogGroup(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws InterruptedException, LogException {
        PutLogRequest.LogGroup.Builder builder = PutLogRequest.LogGroup.newBuilder(logGroup);
        builder.clearLogs();
        int baseSizeNoLogs = builder.build().getSerializedSize();
        int size = baseSizeNoLogs;
        int count = 0;
        for (PutLogRequest.Log log : logGroup.getLogsList()) {
            int logSize = log.getSerializedSize();
            int entrySize = logEntrySize(logSize);
            builder.addLogs(log);
            count++;
            size += entrySize;
            if (size > ProducerConfig.MAX_BATCH_SIZE) {
                if (count == 1) {
                    int actual = builder.build().getSerializedSize();
                    statsState.onRejectedInvalidArgument();
                    throw new LogException("InvalidArgument", String.format("log size %d is larger than MAX_LOG_SIZE %d",
                            actual, ProducerConfig.MAX_BATCH_SIZE), null);
                }
                builder.removeLogs(count - 1);
                count--;
                size -= entrySize;
                dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
                builder.clearLogs();
                builder.addLogs(log);
                count = 1;
                size = baseSizeNoLogs + entrySize;
                if (size > ProducerConfig.MAX_BATCH_SIZE) {
                    int actual = builder.build().getSerializedSize();
                    statsState.onRejectedInvalidArgument();
                    throw new LogException("InvalidArgument", String.format("log size %d is larger than MAX_LOG_SIZE %d",
                            actual, ProducerConfig.MAX_BATCH_SIZE), null);
                }
            }
            if (count >= ProducerConfig.MAX_LOG_GROUP_COUNT) {
                dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
                builder.clearLogs();
                count = 0;
                size = baseSizeNoLogs;
            }
        }
        if (count > 0) {
            dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
        }
    }

    private void dispatchLogItems(String hashKey, String topicId, String source, String filename, List<LogItem> logs, CallBack callBack)
            throws InterruptedException, LogException {
        PutLogRequest.LogGroup.Builder builder = PutLogRequest.LogGroup.newBuilder();
        if (filename != null) {
            builder.setFileName(filename);
        }
        if (source != null) {
            builder.setSource(source);
        }
        int baseSizeNoLogs = builder.build().getSerializedSize();
        int size = baseSizeNoLogs;
        int count = 0;
        for (LogItem item : logs) {
            PutLogRequest.Log log = AdaptorUtil.logItem2PbLog(item);
            int logSize = log.getSerializedSize();
            int entrySize = logEntrySize(logSize);
            builder.addLogs(log);
            count++;
            size += entrySize;
            if (size > ProducerConfig.MAX_BATCH_SIZE) {
                if (count == 1) {
                    int actual = builder.build().getSerializedSize();
                    statsState.onRejectedInvalidArgument();
                    throw new LogException("InvalidArgument", String.format("log size %d is larger than MAX_LOG_SIZE %d",
                            actual, ProducerConfig.MAX_BATCH_SIZE), null);
                }
                builder.removeLogs(count - 1);
                count--;
                size -= entrySize;
                dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
                builder.clearLogs();
                if (filename != null) {
                    builder.setFileName(filename);
                }
                if (source != null) {
                    builder.setSource(source);
                }
                baseSizeNoLogs = builder.build().getSerializedSize();
                size = baseSizeNoLogs + entrySize;
                builder.addLogs(log);
                count = 1;
                if (size > ProducerConfig.MAX_BATCH_SIZE) {
                    int actual = builder.build().getSerializedSize();
                    statsState.onRejectedInvalidArgument();
                    throw new LogException("InvalidArgument", String.format("log size %d is larger than MAX_LOG_SIZE %d",
                            actual, ProducerConfig.MAX_BATCH_SIZE), null);
                }
            }
            if (count >= ProducerConfig.MAX_LOG_GROUP_COUNT) {
                dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
                builder.clearLogs();
                if (filename != null) {
                    builder.setFileName(filename);
                }
                if (source != null) {
                    builder.setSource(source);
                }
                count = 0;
                baseSizeNoLogs = builder.build().getSerializedSize();
                size = baseSizeNoLogs;
            }
        }
        if (count > 0) {
            dispatcher.addBatch(hashKey, topicId, source, filename, builder.build(), callBack);
        }
    }

    private int logEntrySize(int logSize) {
        int tagSize = CodedOutputStream.computeTagSize(PutLogRequest.LogGroup.LOGS_FIELD_NUMBER);
        return tagSize + CodedOutputStream.computeUInt32SizeNoTag(logSize) + logSize;
    }

    @Override
    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException {
        if (StringUtils.isEmpty(accessKey) || StringUtils.isEmpty(secretKey)) {
            statsState.onRejectedInvalidArgument();
            throw new LogException("InvalidArgument",
                    String.format("reset producer %s access key failed: access key and secret key must be non-empty",
                            name), null);
        }
        dispatcher.resetAccessKeyToken(accessKey, secretKey, securityToken);
    }

    @Override
    public void setApiKey(String apiKey) throws LogException {
        dispatcher.setApiKey(apiKey);
    }

    @Override
    public void start() throws LogException {
        dispatcher.start();
        retryManager.start();
        successHandler.start();
        failHandler.start();
        mover.start();
        statsState.markStarted();
        LOG.info(String.format("producer %s started", name));
    }

    @Override
    public ProducerStatsSnapshot getStats(StatsOptions options) {
        return statsState.snapshot(options);
    }

    @Override
    public void setMetricsLevel(com.volcengine.model.tls.stats.MetricsLevel level) {
        statsState.setMetricsLevel(level);
    }

    @Override
    public void close() throws InterruptedException, LogException {
        close(30000);
    }

    @Override
    public void close(long timeoutMs) throws InterruptedException, LogException {
        statsState.markClosing();
        boolean fromCallback = isCallbackHandlerThread();
        LogException feedbackException = null;
        if (fromCallback) {
            statsState.markFinalizationIncomplete();
            feedbackException = callbackCloseException();
        }
        try {
            timeoutMs = closeMover(timeoutMs);
        } catch (AdmissionCloseTimeoutException e) {
            // Do not proceed into executor/client/memory teardown: an admission that won before
            // close still owns the right to complete. The closed admission gate remains in place and
            // the caller can retry close after that operation finishes.
            throw e;
        } catch (LogException e) {
            feedbackException = e;
        }
        try {
            timeoutMs = closeExecutorService(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }
        try {
            timeoutMs = closeSuccessHandler(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }
        try {
            timeoutMs = closeFailureHandler(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }

        try {
            memoryLimiter.close();
            dispatcher.getClient().close();
        } finally {
            // Freeze the final snapshot after all workers/handlers have stopped so any still-owned
            // data is swept into dropped{force_close} exactly once and later reads are identical.
            statsState.markClosedAndFreeze();
            if (feedbackException != null) {
                throw feedbackException;
            }
        }
        LOG.info(String.format("producer %s closed", name));
    }

    private long closeMover(long timeoutMs) throws InterruptedException, LogException {
        long startNanos = System.nanoTime();

        if (!dispatcher.close(timeoutMs)) {
            throw new AdmissionCloseTimeoutException();
        }
        retryManager.close();
        mover.close();
        long remains = remainingTimeoutMs(timeoutMs, startNanos);
        if (mover.isAlive() && remains > 0L) mover.join(remains);
        if (mover.isAlive()) {
            LOG.warn("producer mover thread is still alive");
            throw new LogException("Producer Error", "producer mover thread is still alive", null);
        }
        LOG.info("producer mover is closed");

        return remainingTimeoutMs(timeoutMs, startNanos);
    }

    private long closeExecutorService(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        ExecutorService executorService = dispatcher.getExecutorService();
        executorService.shutdown();
        if (!executorService.awaitTermination(timeoutMs, TimeUnit.MILLISECONDS)) {
            LOG.warn("producer executor is not terminated normally");
            executorService.shutdownNow();
            throw new LogException("Producer Error", "producer executor is not terminated normally", null);
        }
        LOG.info("producer executor service is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    private long closeSuccessHandler(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        successHandler.close();
        boolean invokedFromCallback = Thread.currentThread() == this.successHandler;
        if (invokedFromCallback) {
            LOG.warn("Skip join success batch handler since you have incorrectly invoked close from the producer callback");
            return timeoutMs;
        }
        if (successHandler.isAlive() && timeoutMs > 0L) successHandler.join(timeoutMs);
        if (successHandler.isAlive()) {
            LOG.warn("producer success handler thread is still alive");
            throw new LogException("Producer Error", "producer success handler thread is still alive", null);
        }
        LOG.info("producer success handler is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    private long closeFailureHandler(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        failHandler.close();
        boolean invokedFromCallback = isCallbackHandlerThread();
        if (invokedFromCallback) {
            LOG.warn("Skip join failure batch handler since you have incorrectly invoked close from the producer callback");
            return timeoutMs;
        }
        if (failHandler.isAlive() && timeoutMs > 0L) failHandler.join(timeoutMs);
        if (failHandler.isAlive()) {
            LOG.warn("producer failure handler thread is still alive");
            throw new LogException("Producer Error", "producer failure handler thread is still alive", null);
        }
        LOG.info("producer failure handler is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    @Override
    public void closeNow() throws InterruptedException, LogException {
        CloseInterruptState interruptState = new CloseInterruptState();
        // A pre-existing interrupt must not make the first interruptible wait skip the rest of the
        // force-close protocol. Remember and clear it while bounded teardown is in progress.
        interruptState.captureCurrentThread();
        statsState.markClosing();
        boolean fromCallback = isCallbackHandlerThread();
        LogException feedbackException = null;
        if (fromCallback) {
            statsState.markFinalizationIncomplete();
            feedbackException = callbackCloseException();
        }
        if (!dispatcher.closeNow(2000L)) {
            statsState.markFinalizationIncomplete();
            feedbackException = new LogException("Producer Error",
                    "timed out cancelling admitted producer sends", null);
        }
        // LogDispatcher preserves interruptions observed while draining admissions. Transfer that
        // signal into this close operation before entering the remaining interruptible waits.
        interruptState.captureCurrentThread();
        memoryLimiter.close();
        retryManager.close();
        mover.close();
        // Closing the transport first aborts in-flight HTTP work. Then wait for sender workers before
        // freezing FINAL; a successful closeNow must never return with live connection-pool work.
        try {
            dispatcher.getClient().close();
        } catch (RuntimeException e) {
            feedbackException = first(feedbackException, new LogException("Producer Error",
                    "producer client failed to close", null));
        }
        if (!awaitTerminationUninterruptibly(dispatcher.getExecutorService(), 2000L, interruptState)) {
            feedbackException = first(feedbackException,
                    new LogException("Producer Error", "producer executor is still alive after closeNow", null));
        }
        // The mover may still convert an executor rejection into a terminal callback item. Join it
        // before stopping callback handlers, otherwise a late publication can be stranded forever.
        joinUninterruptibly(mover, 2000L, interruptState);
        successHandler.close();
        failHandler.close();
        // Wait for the handler threads to actually exit before freezing so the force-close sweep is
        // not racing an in-flight terminal settlement. Never join the currently executing callback.
        if (!fromCallback) {
            joinUninterruptibly(successHandler, 2000L, interruptState);
            joinUninterruptibly(failHandler, 2000L, interruptState);
        }
        if (mover.isAlive() || (!fromCallback && (successHandler.isAlive() || failHandler.isAlive()))) {
            feedbackException = first(feedbackException,
                    new LogException("Producer Error", "producer workers are still alive after closeNow", null));
        }
        interruptState.captureCurrentThread();
        if (interruptState.wasInterrupted()) statsState.markFinalizationIncomplete();
        statsState.markClosedAndFreeze();
        if (interruptState.wasInterrupted()) {
            InterruptedException interrupted = new InterruptedException(
                    "producer closeNow was interrupted; bounded cleanup completed");
            if (feedbackException != null) interrupted.addSuppressed(feedbackException);
            Thread.currentThread().interrupt();
            throw interrupted;
        }
        if (feedbackException != null) throw feedbackException;
        LOG.info(String.format("producer %s closed now", name));
    }

    private static boolean awaitTerminationUninterruptibly(ExecutorService executorService,
                                                            long timeoutMs,
                                                            CloseInterruptState interruptState) {
        long startedNanos = System.nanoTime();
        long timeoutNanos = TimeUnit.MILLISECONDS.toNanos(Math.max(0L, timeoutMs));
        while (!executorService.isTerminated()) {
            long remains = timeoutNanos - (System.nanoTime() - startedNanos);
            if (remains <= 0L) return executorService.isTerminated();
            try {
                if (executorService.awaitTermination(remains, TimeUnit.NANOSECONDS)) return true;
            } catch (InterruptedException e) {
                interruptState.recordInterrupted();
            }
        }
        return true;
    }

    private static void joinUninterruptibly(Thread thread,
                                            long timeoutMs,
                                            CloseInterruptState interruptState) {
        long startedNanos = System.nanoTime();
        long timeoutNanos = TimeUnit.MILLISECONDS.toNanos(Math.max(0L, timeoutMs));
        while (thread.isAlive()) {
            long remains = timeoutNanos - (System.nanoTime() - startedNanos);
            if (remains <= 0L) return;
            try {
                TimeUnit.NANOSECONDS.timedJoin(thread, remains);
            } catch (InterruptedException e) {
                interruptState.recordInterrupted();
            }
        }
    }

    private static final class CloseInterruptState {
        private boolean interrupted;

        private void captureCurrentThread() {
            if (Thread.interrupted()) interrupted = true;
        }

        private void recordInterrupted() {
            interrupted = true;
        }

        private boolean wasInterrupted() {
            return interrupted;
        }
    }

    private static LogException first(LogException first, LogException next) {
        return first == null ? next : first;
    }

    private boolean isCallbackHandlerThread() {
        return Thread.currentThread() == this.successHandler || Thread.currentThread() == this.failHandler;
    }

    private static LogException callbackCloseException() {
        return new LogException("Producer Error",
                "producer close invoked from callback cannot await its callback handler", null);
    }

    private static long remainingTimeoutMs(long timeoutMs, long startedNanos) {
        long elapsedMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startedNanos);
        return Math.max(0L, timeoutMs - elapsedMs);
    }

    private static final class AdmissionCloseTimeoutException extends LogException {
        private AdmissionCloseTimeoutException() {
            super("Producer Error", "timed out waiting for admitted producer sends", null);
        }
    }

    @Override
    public void config(ProducerConfig producerConfig) throws LogException {
        if (producerConfig != null) {
            this.producerConfig = producerConfig;
            producerConfig.validConfig();
            LOG.info(String.format("producer %s configured", name));
        }
    }
}
