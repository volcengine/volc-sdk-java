package com.volcengine.model.tls.producer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MemoryLimiter {
    private static final Log LOG = LogFactory.getLog(MemoryLimiter.class);

    private final long capacityBytes;
    private final long payloadCapacityBytes;
    private long usedBytes;
    private long payloadUsedBytes;
    private boolean payloadClosed;
    private boolean closed;

    public MemoryLimiter(long capacityBytes, long payloadCapacityBytes) {
        if (capacityBytes <= 0 || payloadCapacityBytes <= 0 || payloadCapacityBytes > capacityBytes) {
            throw new IllegalArgumentException("invalid memory limiter capacity");
        }
        this.capacityBytes = capacityBytes;
        this.payloadCapacityBytes = payloadCapacityBytes;
    }

    public synchronized boolean acquirePayload(long bytes, long timeoutMs) throws InterruptedException {
        return acquire(bytes, timeoutMs, true);
    }

    public synchronized boolean acquireTemporary(long bytes, long timeoutMs) throws InterruptedException {
        return acquire(bytes, timeoutMs, false);
    }

    private boolean acquire(long bytes, long timeoutMs, boolean payload) throws InterruptedException {
        if (bytes <= 0) {
            return true;
        }
        if (bytes > capacityBytes || (payload && bytes > payloadCapacityBytes)) {
            LOG.warn(String.format("producer memory request exceeds capacity, bytes=%d, capacityBytes=%d, payloadCapacityBytes=%d, payload=%s",
                    bytes, capacityBytes, payloadCapacityBytes, payload));
            return false;
        }
        long deadline = timeoutMs > 0 ? monotonicMs() + timeoutMs : 0;
        while (!isClosedFor(payload) && !hasCapacity(bytes, payload)) {
            if (timeoutMs == 0) {
                return false;
            }
            if (timeoutMs < 0) {
                wait();
                continue;
            }
            long remains = deadline - monotonicMs();
            if (remains <= 0) {
                return false;
            }
            wait(remains);
        }
        if (isClosedFor(payload)) {
            return false;
        }
        usedBytes += bytes;
        if (payload) {
            payloadUsedBytes += bytes;
        }
        return true;
    }

    private boolean hasCapacity(long bytes, boolean payload) {
        return usedBytes + bytes <= capacityBytes
                && (!payload || payloadUsedBytes + bytes <= payloadCapacityBytes);
    }

    public synchronized void releasePayload(long bytes) {
        release(bytes, true);
    }

    public synchronized void releaseTemporary(long bytes) {
        release(bytes, false);
    }

    private void release(long bytes, boolean payload) {
        if (bytes <= 0) {
            return;
        }
        if (bytes > usedBytes || (payload && bytes > payloadUsedBytes)) {
            throw new IllegalStateException("release exceeds acquired bytes");
        }
        usedBytes -= bytes;
        if (payload) {
            payloadUsedBytes -= bytes;
        }
        notifyAll();
    }

    public synchronized void closePayload() {
        payloadClosed = true;
        notifyAll();
    }

    public synchronized void close() {
        closed = true;
        payloadClosed = true;
        notifyAll();
    }

    private boolean isClosedFor(boolean payload) {
        return closed || (payload && payloadClosed);
    }

    public synchronized long getUsedBytes() {
        return usedBytes;
    }

    public long getCapacityBytes() {
        return capacityBytes;
    }

    public long getPayloadCapacityBytes() {
        return payloadCapacityBytes;
    }

    private static long monotonicMs() {
        return System.nanoTime() / 1_000_000L;
    }
}
