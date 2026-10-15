package com.volcengine.model.tls.stats;

/** Queue projection; optional capacity preserves unbounded-queue absence semantics. */
public final class QueueSummary {
    private final long currentItems;
    private final Long capacityItems;
    private final long highWatermarkItems;
    private final boolean bounded;

    public QueueSummary(long currentItems, Long capacityItems, long highWatermarkItems,
                        boolean bounded) {
        StatsValidation.nonNegative(currentItems, "currentItems");
        StatsValidation.optionalNonNegative(capacityItems, "capacityItems");
        StatsValidation.nonNegative(highWatermarkItems, "highWatermarkItems");
        if (highWatermarkItems < currentItems) {
            throw new IllegalArgumentException("highWatermarkItems must cover currentItems");
        }
        if (capacityItems != null && currentItems > capacityItems) {
            throw new IllegalArgumentException("currentItems exceeds capacityItems");
        }
        if (bounded != (capacityItems != null)) {
            throw new IllegalArgumentException("bounded must match capacity presence");
        }
        this.currentItems = currentItems;
        this.capacityItems = capacityItems;
        this.highWatermarkItems = highWatermarkItems;
        this.bounded = bounded;
    }

    public long getCurrentItems() { return currentItems; }
    public Long getCapacityItems() { return capacityItems; }
    public long getHighWatermarkItems() { return highWatermarkItems; }
    public boolean isBounded() { return bounded; }

    String toJson() {
        return new JsonWriter().num("current_items", currentItems)
                .numOpt("capacity_items", capacityItems)
                .num("high_watermark_items", highWatermarkItems)
                .bool("bounded", bounded).end();
    }
}
