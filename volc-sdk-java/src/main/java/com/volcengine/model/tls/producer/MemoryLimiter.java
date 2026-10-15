package com.volcengine.model.tls.producer;

import com.volcengine.service.tls.stats.ManagedMemoryAccountant;

/**
 * Compatibility facade over the Producer's single {@link ManagedMemoryAccountant}.
 *
 * <p>This type intentionally owns no counters or byte state. Existing Producer code keeps the same
 * blocking acquire/release behavior while observability code captures the exact same accountant,
 * preventing limiter/stats double accounting.
 */
public class MemoryLimiter {
    private final ManagedMemoryAccountant accountant;

    public MemoryLimiter(long capacityBytes, long payloadCapacityBytes) {
        this(capacityBytes, payloadCapacityBytes, false);
    }

    /** Creates a facade whose accountant allocates observation state only when requested. */
    public MemoryLimiter(long capacityBytes, long payloadCapacityBytes, boolean observationEnabled) {
        this(new ManagedMemoryAccountant(capacityBytes, payloadCapacityBytes, observationEnabled));
    }

    public MemoryLimiter(ManagedMemoryAccountant accountant) {
        if (accountant == null) {
            throw new NullPointerException("accountant");
        }
        this.accountant = accountant;
    }

    public boolean acquirePayload(long bytes, long timeoutMs) throws InterruptedException {
        return accountant.acquirePayloadBytes(bytes, timeoutMs)
                == ManagedMemoryAccountant.AcquireResult.ACQUIRED;
    }

    public boolean acquireTemporary(long bytes, long timeoutMs) throws InterruptedException {
        return accountant.acquireRuntimeBytes(bytes, timeoutMs)
                == ManagedMemoryAccountant.AcquireResult.ACQUIRED;
    }

    public void releasePayload(long bytes) {
        accountant.releasePayloadBytes(bytes);
    }

    public boolean transitionPayloadBytes(ManagedMemoryAccountant.PayloadStage expected,
                                          ManagedMemoryAccountant.PayloadStage next, long bytes) {
        return accountant.transitionPayloadBytes(expected, next, bytes);
    }

    public void releasePayloadBytes(ManagedMemoryAccountant.PayloadStage stage, long bytes) {
        accountant.releasePayloadBytes(stage, bytes);
    }

    public ManagedMemoryAccountant.AcquireResult resizePayloadBytes(
            ManagedMemoryAccountant.PayloadStage stage, long oldBytes, long newBytes, long timeoutMs)
            throws InterruptedException {
        return accountant.resizePayloadBytes(stage, oldBytes, newBytes, timeoutMs);
    }

    public void releaseTemporary(long bytes) {
        accountant.releaseRuntimeBytes(bytes);
    }

    public void closePayload() {
        accountant.closePayload();
    }

    public void close() {
        accountant.close();
    }

    public void forceReleaseAll() {
        accountant.forceReleaseAll();
    }

    public long getUsedBytes() {
        return accountant.getUsedBytes();
    }

    public long getPayloadUsedBytes() {
        return accountant.getPayloadUsedBytes();
    }

    public long getCapacityBytes() {
        return accountant.getCapacityBytes();
    }

    public long getPayloadCapacityBytes() {
        return accountant.getPayloadCapacityBytes();
    }

    /** Internal bridge used by stats state; it is the same authority used by every facade method. */
    public ManagedMemoryAccountant getAccountant() {
        return accountant;
    }
}
