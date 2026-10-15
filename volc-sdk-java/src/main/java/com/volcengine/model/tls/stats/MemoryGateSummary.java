package com.volcengine.model.tls.stats;

/** Immutable batch-inflight memory gate projection. */
public final class MemoryGateSummary {
    private final long limitBytes;
    private final long usedBytes;
    private final long highWatermarkBytes;
    private final long rejectedTotal;

    public MemoryGateSummary(long limitBytes, long usedBytes, long highWatermarkBytes,
                             long rejectedTotal) {
        StatsValidation.nonNegative(limitBytes, "limitBytes");
        StatsValidation.nonNegative(usedBytes, "usedBytes");
        StatsValidation.nonNegative(highWatermarkBytes, "highWatermarkBytes");
        StatsValidation.nonNegative(rejectedTotal, "rejectedTotal");
        if (highWatermarkBytes < usedBytes) {
            throw new IllegalArgumentException("highWatermarkBytes must cover usedBytes");
        }
        this.limitBytes = limitBytes;
        this.usedBytes = usedBytes;
        this.highWatermarkBytes = highWatermarkBytes;
        this.rejectedTotal = rejectedTotal;
    }

    public long getLimitBytes() { return limitBytes; }
    public long getUsedBytes() { return usedBytes; }
    public long getHighWatermarkBytes() { return highWatermarkBytes; }
    public long getRejectedTotal() { return rejectedTotal; }

    public Double getPressure() {
        return limitBytes == 0L ? null : (double) usedBytes / (double) limitBytes;
    }

    String toJson() {
        return new JsonWriter().num("limit_bytes", limitBytes).num("used_bytes", usedBytes)
                .num("high_watermark_bytes", highWatermarkBytes)
                .num("rejected_total", rejectedTotal).end();
    }
}
