package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.service.tls.stats.ManagedMemoryAccountant;
import com.volcengine.service.tls.stats.ProducerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public class Mover extends Thread {
    private volatile boolean closed;
    private final String name;
    private final ProducerConfig producerConfig;
    private final RetryManager retryManager;
    private final BlockingQueue<BatchLog> successQueue;
    private final BlockingQueue<BatchLog> failureQueue;
    private final ExecutorService executorService;
    private final TLSLogClient client;
    private final ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches;
    private final MemoryLimiter memoryLimiter;
    private final CircuitBreaker circuitBreaker;
    private final ProducerStatsState statsState;
    private static final Log LOG = LogFactory.getLog(Mover.class);

    public Mover(String name, ProducerConfig producerConfig, LogDispatcher dispatcher, RetryManager retryManager,
                 BlockingQueue<BatchLog> successQueue, BlockingQueue<BatchLog> failureQueue,
                 MemoryLimiter memoryLimiter, CircuitBreaker circuitBreaker, ProducerStatsState statsState) {
        setDaemon(true);
        this.name = name;
        this.producerConfig = producerConfig;
        this.retryManager = retryManager;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.executorService = dispatcher.getExecutorService();
        this.client = dispatcher.getClient();
        this.batches = dispatcher.getBatches();
        this.memoryLimiter = memoryLimiter;
        this.circuitBreaker = circuitBreaker;
        this.statsState = statsState;
        this.closed = false;
    }

    @Override
    public void run() {
        statsState.onMoverWorkerStarted();
        try {
            handlerTimeout();

            handleRemainingBatch();
            List<BatchLog> remainingRetryBatches = retryManager.handleRemainingBatches();
            for (BatchLog log : remainingRetryBatches) {
                submit(log, ManagedMemoryAccountant.PayloadStage.RETRY);
            }
        } finally {
            statsState.onMoverWorkerStopped();
        }
    }

    /**
     * Submits a send task, tolerating a concurrently shut-down executor. On {@code closeNow()} the
     * dispatcher shuts the pool down while the Mover may still be draining; in that case the batch
     * cannot be sent regardless, so we swallow the rejection here (the batch is accounted as
     * force-close dropped when the final snapshot is frozen) instead of letting an uncaught
     * {@link RejectedExecutionException} kill the Mover thread.
     */
    private void submit(BatchLog log, ManagedMemoryAccountant.PayloadStage expectedStage) {
        synchronized (memoryLimiter.getAccountant()) {
            log.transitionPayload(memoryLimiter, expectedStage, ManagedMemoryAccountant.PayloadStage.SEND);
            if (expectedStage == ManagedMemoryAccountant.PayloadStage.RETRY) {
                statsState.onBatchResubmittedFromRetry(log, retryManager.getHeadEnqueueNanos());
                log.setRetryQueueEnterNanos(0L);
            } else {
                statsState.onBatchSubmittedFromIngress(log);
            }
        }
        try {
            executorService.submit(
                    new SendBatchTask(log, producerConfig, successQueue, failureQueue, client, retryManager, memoryLimiter, circuitBreaker));
            statsState.onQueueDepthChanged();
        } catch (RejectedExecutionException e) {
            statsState.onSubmitRejected();
            log.addAttempt(new Attempt(false, null, "ExecutorRejected",
                    "send executor rejected batch", 0));
            if (statsState.settleTerminalAndRelease(log, 2, memoryLimiter)) {
                statsState.publishTerminal(failureQueue, log);
            }
            LOG.warn("send task rejected because executor is shutting down");
        }
    }

    private void handlerTimeout() {
        while (!closed) {
            long remains = handleTimeoutBatch();
            handleRetryBatch(remains);
        }
    }

    private void handleRetryBatch(long remains) {
        List<BatchLog> batchLogs = retryManager.handleTimeoutBatch(remains);
        for (BatchLog log : batchLogs) {
            submit(log, ManagedMemoryAccountant.PayloadStage.RETRY);
        }
    }

    private long handleTimeoutBatch() {
        LOG.debug("mover" + name + "handler timeout batch");
        long now = System.currentTimeMillis();
        List<BatchLog> batchLogs = new ArrayList<>();
        long remains = producerConfig.getLingerMs();
        for (Map.Entry<BatchLog.BatchKey, BatchLog.BatchManager> entry : batches.entrySet()) {
            BatchLog.BatchManager batchManager = entry.getValue();
            synchronized (batchManager) {
                BatchLog batchLog = batchManager.getBatchLog();
                if (batchLog == null) {
                    batches.remove(entry.getKey(), batchManager);
                    continue;
                }
                long curRemains = remains + batchLog.getCreateMs() - now;
                if (curRemains <= 0) {
                    batchManager.removeBatch(batchLogs);
                    if (batchManager.getBatchLog() == null) {
                        batches.remove(entry.getKey(), batchManager);
                    }
                } else {
                    remains = Math.min(remains, curRemains);
                }
            }
        }
        for (BatchLog log : batchLogs) {
            submit(log, ManagedMemoryAccountant.PayloadStage.AGGREGATE);
        }
        return remains;
    }

    private void handleRemainingBatch() {
        LOG.debug("mover" + name + "handler remaining batch");
        List<BatchLog> batchLogs = new ArrayList<>();
        for (Map.Entry<BatchLog.BatchKey, BatchLog.BatchManager> entry : batches.entrySet()) {
            BatchLog.BatchManager batchManager = entry.getValue();
            synchronized (batchManager) {
                BatchLog batchLog = batchManager.getBatchLog();
                if (batchLog == null) {
                    batches.remove(entry.getKey(), batchManager);
                    continue;
                }
                batchManager.removeBatch(batchLogs);
                if (batchManager.getBatchLog() == null) {
                    batches.remove(entry.getKey(), batchManager);
                }
            }
        }
        for (BatchLog log : batchLogs) {
            submit(log, ManagedMemoryAccountant.PayloadStage.AGGREGATE);
        }
    }

    public void close() {
        this.closed = true;
        interrupt();
    }
}
