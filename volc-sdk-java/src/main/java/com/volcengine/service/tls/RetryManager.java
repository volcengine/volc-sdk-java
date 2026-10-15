package com.volcengine.service.tls;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.producer.BatchLog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class RetryManager {
    /** Serializes physical DelayQueue publication/removal with the O(1) oldest ledger. */
    private final Object retryLock = new Object();
    private volatile boolean closed;
    private final static Log LOG = LogFactory.getLog(RetryManager.class);

    private final DelayQueue<BatchLog> retryBatches = new DelayQueue<>();
    private BatchLog oldestHead;
    private BatchLog oldestTail;

    public RetryManager() {
    }

    public int size() { return retryBatches.size(); }

    public void put(BatchLog batchLog) throws LogException {
        if (batchLog == null) throw new NullPointerException("batchLog");
        synchronized (retryLock) {
            if (closed) {
                throw new LogException("Producer Error", "closed RetryManager cannot receive logs anymore", null);
            }
            if (batchLog.isRetryOldestLinked()) {
                throw new IllegalStateException("batch is already published in the retry queue");
            }
            retryBatches.add(batchLog);
            linkOldest(batchLog);
            retryLock.notifyAll();
        }
    }

    /** O(1) retry-head epoch used to project the oldest retry queue age. */
    public long getHeadEnqueueNanos() {
        synchronized (retryLock) {
            return oldestHead == null ? 0L : Math.max(0L, oldestHead.getRetryQueueEnterNanos());
        }
    }

    public List<BatchLog> handleTimeoutBatch(long remains) {
        long waitNanos = TimeUnit.MILLISECONDS.toNanos(Math.max(0L, remains));
        long deadline = System.nanoTime() + waitNanos;
        synchronized (retryLock) {
            List<BatchLog> expiredBatches = new ArrayList<>();
            while (true) {
                BatchLog expired;
                while ((expired = retryBatches.poll()) != null) {
                    unlinkOldest(expired);
                    expiredBatches.add(expired);
                }
                if (!expiredBatches.isEmpty() || waitNanos <= 0L) {
                    return expiredBatches;
                }
                BatchLog next = retryBatches.peek();
                long nextDelay = next == null ? waitNanos
                        : Math.max(1L, next.getDelay(TimeUnit.NANOSECONDS));
                long sleepNanos = Math.min(waitNanos, nextDelay);
                try {
                    TimeUnit.NANOSECONDS.timedWait(retryLock, sleepNanos);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    LOG.info("Interrupted when poll batch from the retry batches");
                    return expiredBatches;
                }
                waitNanos = deadline - System.nanoTime();
            }
        }
    }

    public List<BatchLog> handleRemainingBatches() {
        synchronized (retryLock) {
            if (!closed) {
                throw new IllegalStateException("cannot get the remaining batches before the retry queue closed");
            }
            List<BatchLog> remainingBatches = new ArrayList<>(retryBatches);
            retryBatches.clear();
            for (BatchLog batch : remainingBatches) unlinkOldest(batch);
            if (oldestHead != null || oldestTail != null) {
                throw new IllegalStateException("retry oldest ledger diverged from physical queue");
            }
            return remainingBatches;
        }
    }

    private void linkOldest(BatchLog batch) {
        batch.setRetryOldestPrevious(oldestTail);
        batch.setRetryOldestNext(null);
        if (oldestTail == null) oldestHead = batch;
        else oldestTail.setRetryOldestNext(batch);
        oldestTail = batch;
        batch.setRetryOldestLinked(true);
    }

    private void unlinkOldest(BatchLog batch) {
        if (!batch.isRetryOldestLinked()) {
            throw new IllegalStateException("physical retry removal missing oldest-ledger entry");
        }
        BatchLog previous = batch.getRetryOldestPrevious();
        BatchLog next = batch.getRetryOldestNext();
        if (previous == null) oldestHead = next;
        else previous.setRetryOldestNext(next);
        if (next == null) oldestTail = previous;
        else next.setRetryOldestPrevious(previous);
        batch.setRetryOldestPrevious(null);
        batch.setRetryOldestNext(null);
        batch.setRetryOldestLinked(false);
        batch.setRetryQueueEnterNanos(0L);
    }

    public void start() {
        synchronized (retryLock) {
            this.closed = false;
        }
    }

    public void close() {
        synchronized (retryLock) {
            this.closed = true;
            retryLock.notifyAll();
        }
    }

    public boolean isClosed() {
        return closed;
    }
}
