package com.volcengine.model.tls.stats;

public final class ManagedMemorySummary {
    private final long limitBytes;
    private final long payloadAdmissionLimitBytes;
    private final long usedBytes;
    private final long payloadOwnedBytes;
    private final long boundedRuntimeBufferBytes;
    private final long highWatermarkBytes;
    private final long rejectedTotal;
    private final long payloadAdmissionRejectedTotal;
    private final long runtimeBufferRejectedTotal;

    /** Constructs a managed-memory summary. */
    public ManagedMemorySummary(long limitBytes, long payloadAdmissionLimitBytes, long usedBytes,
                                long payloadOwnedBytes, long boundedRuntimeBufferBytes,
                                long highWatermarkBytes, long rejectedTotal,
                                long payloadAdmissionRejectedTotal,
                                long runtimeBufferRejectedTotal) {
        StatsValidation.nonNegative(limitBytes, "limitBytes");
        StatsValidation.nonNegative(payloadAdmissionLimitBytes, "payloadAdmissionLimitBytes");
        StatsValidation.nonNegative(usedBytes, "usedBytes");
        StatsValidation.nonNegative(payloadOwnedBytes, "payloadOwnedBytes");
        StatsValidation.nonNegative(boundedRuntimeBufferBytes, "boundedRuntimeBufferBytes");
        StatsValidation.nonNegative(highWatermarkBytes, "highWatermarkBytes");
        StatsValidation.nonNegative(rejectedTotal, "rejectedTotal");
        StatsValidation.nonNegative(payloadAdmissionRejectedTotal, "payloadAdmissionRejectedTotal");
        StatsValidation.nonNegative(runtimeBufferRejectedTotal, "runtimeBufferRejectedTotal");
        if (limitBytes <= 0L || usedBytes > limitBytes || highWatermarkBytes < usedBytes
                || highWatermarkBytes > limitBytes
                || payloadAdmissionLimitBytes > 0L && payloadAdmissionLimitBytes > limitBytes) {
            throw new IllegalArgumentException("managed memory summary violates its budget invariants");
        }
        if (payloadOwnedBytes > Long.MAX_VALUE - boundedRuntimeBufferBytes
                || usedBytes != payloadOwnedBytes + boundedRuntimeBufferBytes) {
            throw new IllegalArgumentException("managed memory ownership does not conserve used bytes");
        }
        if (payloadAdmissionRejectedTotal > Long.MAX_VALUE - runtimeBufferRejectedTotal
                || rejectedTotal != payloadAdmissionRejectedTotal + runtimeBufferRejectedTotal) {
            throw new IllegalArgumentException("managed memory rejection counters do not conserve totals");
        }
        this.limitBytes = limitBytes;
        this.payloadAdmissionLimitBytes = payloadAdmissionLimitBytes;
        this.usedBytes = usedBytes;
        this.payloadOwnedBytes = payloadOwnedBytes;
        this.boundedRuntimeBufferBytes = boundedRuntimeBufferBytes;
        this.highWatermarkBytes = highWatermarkBytes;
        this.rejectedTotal = rejectedTotal;
        this.payloadAdmissionRejectedTotal = payloadAdmissionRejectedTotal;
        this.runtimeBufferRejectedTotal = runtimeBufferRejectedTotal;
    }

    public long getLimitBytes() { return limitBytes; }
    public long getPayloadAdmissionLimitBytes() { return payloadAdmissionLimitBytes; }
    public long getUsedBytes() { return usedBytes; }
    public long getPayloadOwnedBytes() { return payloadOwnedBytes; }
    public long getBoundedRuntimeBufferBytes() { return boundedRuntimeBufferBytes; }
    public long getHighWatermarkBytes() { return highWatermarkBytes; }
    public long getRejectedTotal() { return rejectedTotal; }
    public long getPayloadAdmissionRejectedTotal() { return payloadAdmissionRejectedTotal; }
    public long getRuntimeBufferRejectedTotal() { return runtimeBufferRejectedTotal; }

    public boolean isValid() {
        return usedBytes == payloadOwnedBytes + boundedRuntimeBufferBytes
                && usedBytes <= limitBytes
                && (payloadAdmissionLimitBytes == 0L || payloadAdmissionLimitBytes <= limitBytes)
                && rejectedTotal == payloadAdmissionRejectedTotal + runtimeBufferRejectedTotal;
    }

    public Double getPressure() {
        return !isValid() || limitBytes == 0L ? null : (double) usedBytes / (double) limitBytes;
    }

    public Double getPayloadAdmissionPressure() {
        return !isValid() || payloadAdmissionLimitBytes == 0L ? null
                : (double) usedBytes / (double) payloadAdmissionLimitBytes;
    }

    String toJson() {
        return new JsonWriter().num("limit_bytes", limitBytes)
                .num("payload_admission_limit_bytes", payloadAdmissionLimitBytes)
                .num("used_bytes", usedBytes).num("payload_owned_bytes", payloadOwnedBytes)
                .num("bounded_runtime_buffer_bytes", boundedRuntimeBufferBytes)
                .num("high_watermark_bytes", highWatermarkBytes)
                .num("rejected_total", rejectedTotal)
                .num("payload_admission_rejected_total", payloadAdmissionRejectedTotal)
                .num("runtime_buffer_rejected_total", runtimeBufferRejectedTotal).end();
    }
}
