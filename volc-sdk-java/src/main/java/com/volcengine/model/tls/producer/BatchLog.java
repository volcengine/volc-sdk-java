package com.volcengine.model.tls.producer;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Iterables;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.SendBatchTask;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.stats.ManagedMemoryAccountant;
import com.volcengine.service.tls.stats.ProducerStatsState;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class BatchLog implements Delayed {
    BatchKey batchKey;
    int currentBatchSize;
    int currentBatchCount;
    long reservedBytes;
    Long earliestLogTime;
    Long latestLogTime;
    List<CallBack> callBackList = new ArrayList<>();
    PutLogRequest.LogGroupList logGroupList = PutLogRequest.LogGroupList.newBuilder().build();
    ProducerConfig producerConfig;
    EvictingQueue<Attempt> reservedAttempts;
    int attemptCount;
    long createMs;
    long nextRetryMs;
    long retryBackoffMs;
    long maxRetryBackoffMs;
    long baseRetryBackoffMs;
    long baseIncreaseBackoffMs;
    int circuitPermitCount;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    volatile ManagedMemoryAccountant.PayloadStage payloadStage;

    /** Monotonic publication time while this batch is owned by the retry queue. */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    volatile long retryQueueEnterNanos;

    /** RetryManager-owned O(1) oldest-publication ledger links; accessed only under its fixed lock. */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    BatchLog retryOldestPrevious;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    BatchLog retryOldestNext;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    boolean retryOldestLinked;

    /**
     * Monotonic nanoTime when this batch was first accepted and owned by the SDK; the start of the
     * batch_delivery latency measurement. Excluded from equals/hashCode/toString (health-only).
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    volatile long deliveryStartNanos;

    /**
     * Monotonic nanoTime when this batch was submitted to the send executor; the start of the
     * batch_queue_delay latency measurement. Reset on each (re)submission.
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    volatile long queueEnterNanos;

    /**
     * Once-settle guard so a batch is counted into exactly one terminal outcome, even across
     * callback-throw, close and retry races. Excluded from equals/hashCode/toString.
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    final AtomicBoolean terminalSettled = new AtomicBoolean(false);

    /**
     * The owning producer's health state (may be null for batches created outside a stats-enabled
     * producer, e.g. in isolated unit tests). Carried on the batch so send/terminal boundaries can
     * update stats without threading the state through every constructor. Health-only: excluded
     * from equals/hashCode/toString.
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    transient volatile ProducerStatsState statsState;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    transient volatile long collectionGeneration;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    transient volatile long queueDetailGeneration;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    transient volatile long deliveryDetailGeneration;
    /** Structural first-attempt marker; no timer/counter is collected while OFF. */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    transient volatile boolean sendAttemptStarted;

    private static final Log LOG = LogFactory.getLog(BatchLog.class);

    private BatchLog() {
    }

    public BatchLog(BatchKey batchKey, ProducerConfig producerConfig) {
        this.batchKey = batchKey;
        this.currentBatchSize = 0;
        this.currentBatchCount = 0;
        this.reservedBytes = 0;
        this.producerConfig = producerConfig;
        this.attemptCount = 0;
        this.reservedAttempts = EvictingQueue.create(producerConfig.getMaxReservedAttempts());
        this.createMs = System.currentTimeMillis();
        this.retryBackoffMs = 0;
        this.maxRetryBackoffMs = 10 * 1000;
        this.baseRetryBackoffMs = 1000;
        this.baseIncreaseBackoffMs = 1000;
    }

    public boolean tryAdd(PutLogRequest.LogGroup logGroup, int batchSize, CallBack callBack,
                          int logCount, long earliestLogTime, long latestLogTime) {
        int currentBatchCount = getCurrentBatchCount();
        int currentBatchSize = getCurrentBatchSize();
        if (logCount + currentBatchCount > ProducerConfig.MAX_BATCH_COUNT
                || batchSize + currentBatchSize > ProducerConfig.MAX_BATCH_SIZE) {
            return false;
        }

        PutLogRequest.LogGroupList.Builder builder = PutLogRequest.LogGroupList.newBuilder();
        if (this.logGroupList.getLogGroupsList().size() > 0) {
            builder.addAllLogGroups(this.logGroupList.getLogGroupsList());
        }
        builder.addLogGroups(logGroup);
        this.logGroupList = builder.build();

        if (callBack != null) {
            getCallBackList().add(callBack);
        }
        setCurrentBatchCount(currentBatchCount + logCount);
        setCurrentBatchSize(currentBatchSize + batchSize);
        setReservedBytes(getReservedBytes() + batchSize);
        if (logCount > 0) {
            if (this.earliestLogTime == null || earliestLogTime < this.earliestLogTime) {
                this.earliestLogTime = earliestLogTime;
            }
            if (this.latestLogTime == null || latestLogTime > this.latestLogTime) {
                this.latestLogTime = latestLogTime;
            }
        }
        return true;
    }

    public boolean fullAndSendBatchRequest() {
        return currentBatchCount >= producerConfig.getMaxBatchCount()
                || currentBatchSize >= producerConfig.getMaxBatchSizeBytes();
    }

    public synchronized void addAttempt(Attempt attempt) {
        reservedAttempts.add(attempt);
        attemptCount++;
    }

    public synchronized void addCircuitPermitCount(int count) {
        if (count > 0) {
            circuitPermitCount += count;
        }
    }

    /** Moves an exact payload range from ingress into this aggregate batch. */
    public synchronized void addAggregatedPayload(MemoryLimiter memoryLimiter, long bytes) {
        if (!memoryLimiter.transitionPayloadBytes(ManagedMemoryAccountant.PayloadStage.INGRESS,
                ManagedMemoryAccountant.PayloadStage.AGGREGATE, bytes)) {
            return;
        }
        payloadStage = ManagedMemoryAccountant.PayloadStage.AGGREGATE;
    }

    /** Moves the complete batch to its next ownership stage. */
    public synchronized boolean transitionPayload(MemoryLimiter memoryLimiter,
                                                  ManagedMemoryAccountant.PayloadStage expected,
                                                  ManagedMemoryAccountant.PayloadStage next) {
        if (!memoryLimiter.transitionPayloadBytes(expected, next, reservedBytes)) {
            return false;
        }
        payloadStage = next;
        return true;
    }

    /**
     * Normalizes batches submitted directly to a SendBatchTask (including tests and embedders).
     * The normal dispatcher/mover path already arrives in SEND and is therefore a no-op.
     */
    public synchronized void preparePayloadForSend(MemoryLimiter memoryLimiter) {
        if (reservedBytes <= 0 || payloadStage == ManagedMemoryAccountant.PayloadStage.SEND) {
            return;
        }
        ManagedMemoryAccountant.PayloadStage expected = payloadStage == null
                ? ManagedMemoryAccountant.PayloadStage.INGRESS : payloadStage;
        if (memoryLimiter.transitionPayloadBytes(expected, ManagedMemoryAccountant.PayloadStage.SEND,
                reservedBytes)) {
            payloadStage = ManagedMemoryAccountant.PayloadStage.SEND;
        }
    }

    /** Releases the complete batch from its current stage exactly once at terminal settlement. */
    public synchronized void releasePayload(MemoryLimiter memoryLimiter) {
        ManagedMemoryAccountant.PayloadStage stage = payloadStage;
        if (stage == null || reservedBytes <= 0) {
            return;
        }
        memoryLimiter.releasePayloadBytes(stage, reservedBytes);
        reservedBytes = 0L;
        payloadStage = null;
    }

    public synchronized int takeCircuitPermitCount() {
        int count = circuitPermitCount;
        circuitPermitCount = 0;
        return count;
    }

    public synchronized void fireCallbacks() {
        fireCallbacks(null);
    }

    /** Invokes and observes each user callback independently; no callback means no callback fact. */
    public synchronized void fireCallbacks(ProducerStatsState observer) {
        List<Attempt> attempts = new ArrayList<>(reservedAttempts);
        if (attempts.size() == 0) {
            LOG.error(String.format("batch log %s fire call back failed ", batchKey.toString()));
            return;
        }
        Attempt attempt = Iterables.getLast(attempts);
        Result result = new Result(attempt.isSuccess(), attempts, attemptCount);
        fireCallbacks(result, observer);
    }

    public void handleNextTry() {
        if (attemptCount == 1) {
            retryBackoffMs += baseRetryBackoffMs;
        } else {
            double increaseBackoffMs = Math.random() * baseIncreaseBackoffMs;
            retryBackoffMs += (long) increaseBackoffMs;
        }
        retryBackoffMs = Math.min(retryBackoffMs, maxRetryBackoffMs);
        nextRetryMs = System.currentTimeMillis() + retryBackoffMs;
    }

    private void fireCallbacks(Result result, ProducerStatsState observer) {
        for (CallBack callBack : callBackList) {
            long generation = observer == null ? 0 : observer.beginCallback();
            long detailGeneration = observer == null ? 0 : observer.beginDetail();
            long start = detailGeneration == 0 ? 0 : System.nanoTime();
            boolean normal = false;
            try {
                callBack.onComplete(result);
                normal = true;
            } catch (Throwable t) {
                // User callbacks are independent terminal notifications. One broken callback must
                // not suppress later callbacks for other groups in the same batch.
                LOG.error("producer callback failed", t);
            } finally {
                if (observer != null) {
                    observer.endCallback(generation, detailGeneration, normal,
                            detailGeneration == 0 ? -1 : System.nanoTime() - start);
                }
            }
        }
    }

    @Override
    public int compareTo(@Nonnull Delayed o) {
        return (int) (nextRetryMs - ((BatchLog) o).getNextRetryMs());
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(nextRetryMs - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Data
    public static class BatchKey {
        String shardHash;
        String topicId;
        String source;
        String fileName;
        long collectionGeneration;

        public BatchKey(String shardHash, String topicId, String source, String fileName) {
            this(shardHash, topicId, source, fileName, 0L);
        }

        public BatchKey(String shardHash, String topicId, String source, String fileName,
                        long collectionGeneration) {
            this.shardHash = shardHash;
            this.topicId = topicId;
            this.source = source;
            this.fileName = fileName;
            this.collectionGeneration = collectionGeneration;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BatchKey batchKey = (BatchKey) o;
            return collectionGeneration == batchKey.collectionGeneration
                    && Objects.equals(shardHash, batchKey.shardHash) && Objects.equals(topicId, batchKey.topicId) && Objects.equals(source, batchKey.source) && Objects.equals(fileName, batchKey.fileName);
        }

        @Override
        public int hashCode() {
            int hash = 1;
            hash = 31 * hash + Objects.hashCode(shardHash);
            hash = 31 * hash + Objects.hashCode(topicId);
            hash = 31 * hash + Objects.hashCode(source);
            hash = 31 * hash + Objects.hashCode(fileName);
            return 31 * hash + (int) (collectionGeneration ^ (collectionGeneration >>> 32));
        }
    }

    @Data
    public static class BatchManager {
        BatchLog batchLog;

        public BatchManager() {
        }


        public boolean fullAndSendBatchRequest() {
            return batchLog.fullAndSendBatchRequest();
        }

        public void addNow(ProducerConfig config, ExecutorService executorService, TLSLogClient client,
                           BlockingQueue<BatchLog> successQueue, BlockingQueue<BatchLog> failureQueue,
                           AtomicInteger batchCount, RetryManager retryManager, MemoryLimiter memoryLimiter,
                           CircuitBreaker circuitBreaker) {
            if (batchLog != null) {
                BatchLog submitted = batchLog;
                synchronized (memoryLimiter.getAccountant()) {
                    submitted.transitionPayload(memoryLimiter,
                            ManagedMemoryAccountant.PayloadStage.AGGREGATE,
                            ManagedMemoryAccountant.PayloadStage.SEND);
                    if (submitted.statsState != null) {
                        submitted.statsState.onBatchSubmittedFromIngress(submitted);
                    }
                }
                try {
                    executorService.submit(
                            new SendBatchTask(submitted, config, successQueue, failureQueue, client,
                                    retryManager, memoryLimiter, circuitBreaker));
                    if (submitted.statsState != null) submitted.statsState.onQueueDepthChanged();
                } catch (RejectedExecutionException e) {
                    ProducerStatsState stats = submitted.statsState;
                    if (stats != null) {
                        stats.onSubmitRejected();
                    }
                    submitted.addAttempt(new Attempt(false, null, "ExecutorRejected",
                            "send executor rejected batch", 0));
                    if (stats == null) {
                        submitted.releasePayload(memoryLimiter);
                        failureQueue.add(submitted);
                    } else {
                        if (stats.settleTerminalAndRelease(submitted, 2, memoryLimiter)) {
                            stats.publishTerminal(failureQueue, submitted);
                        }
                    }
                } finally {
                    batchLog = null;
                }
            }
        }

        public void removeBatch(List<BatchLog> batchLogs) {
            if (batchLog != null) {
                batchLogs.add(batchLog);
                batchLog = null;
            }
        }
    }

    @Override
    public String toString() {
        return "BatchLog{" +
                "batchKey=" + batchKey +
                ", currentBatchSize=" + currentBatchSize +
                ", currentBatchCount=" + currentBatchCount +
                ", reservedAttempts=" + reservedAttempts +
                ", attemptCount=" + attemptCount +
                ", createMs=" + createMs +
                ", nextRetryMs=" + nextRetryMs +
                ", retryBackoffMs=" + retryBackoffMs +
                ", maxRetryBackoffMs=" + maxRetryBackoffMs +
                ", baseRetryBackoffMs=" + baseRetryBackoffMs +
                ", baseIncreaseBackoffMs=" + baseIncreaseBackoffMs +
                '}';
    }
}
