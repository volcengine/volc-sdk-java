package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryManager {
    private final AtomicInteger retryLock;
    private boolean closed;
    private final static Log LOG = LogFactory.getLog(RetryManager.class);

    private final DelayQueue<BatchLog> retryBatches = new DelayQueue<>();

    public RetryManager() {
        this.retryLock = new AtomicInteger(0);
        this.closed = false;
    }

    public void put(BatchLog batchLog) {
        retryLock.incrementAndGet();
        if (!closed) {
            retryBatches.put(batchLog);
        }
        retryLock.decrementAndGet();
    }

    public List<BatchLog> handleTimeoutBatch(long remains) {
        long deadline = System.currentTimeMillis() + remains;
        List<BatchLog> expiredBatches = new ArrayList<>();
        retryBatches.drainTo(expiredBatches);
        if (!expiredBatches.isEmpty()) {
            return expiredBatches;
        }
        while (true) {
            if (remains < 0) {
                break;
            }
            BatchLog batch;
            try {
                batch = retryBatches.poll(remains, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                LOG.info("Interrupted when poll batch from the retry batches");
                break;
            }
            if (batch == null) {
                break;
            }
            expiredBatches.add(batch);
            retryBatches.drainTo(expiredBatches);
            if (!expiredBatches.isEmpty()) {
                break;
            }
            remains = deadline - System.currentTimeMillis();
        }
        return expiredBatches;
    }

    public void close() {
        this.closed = true;
    }
}
