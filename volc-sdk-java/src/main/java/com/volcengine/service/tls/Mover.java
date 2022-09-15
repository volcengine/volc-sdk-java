package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.ProducerConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

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
    private static final Log LOG = LogFactory.getLog(Mover.class);

    public Mover(String name, ProducerConfig producerConfig, LogDispatcher dispatcher, RetryManager retryManager,
                 BlockingQueue<BatchLog> successQueue, BlockingQueue<BatchLog> failureQueue) {
        this.name = name;
        this.producerConfig = producerConfig;
        this.retryManager = retryManager;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.executorService = dispatcher.getExecutorService();
        this.client = dispatcher.getClient();
        this.batches = dispatcher.getBatches();
        this.closed = false;
    }

    @Override
    public void run() {
        handlerTimeout();
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
            executorService.submit(
                    new SendBatchTask(log, producerConfig, successQueue, failureQueue, client, retryManager));
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
                    continue;
                }
                long curRemains = remains + batchLog.getCreateMs() - now;
                if (curRemains <= 0) {
                    batchManager.removeBatch(batchLogs);
                } else {
                    remains = Math.min(remains, curRemains);
                }
            }
        }
        for (BatchLog log : batchLogs) {
            executorService.submit(
                    new SendBatchTask(log, producerConfig, successQueue, failureQueue, client, retryManager));
        }
        return remains;
    }

    public void close() {
        this.closed = true;
        super.interrupt();
    }
}
