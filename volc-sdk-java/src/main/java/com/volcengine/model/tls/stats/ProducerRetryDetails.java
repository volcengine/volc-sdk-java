package com.volcengine.model.tls.stats;

/** Producer debug retry facts; the lifetime counter is sourced from operational state. */
public final class ProducerRetryDetails {
    private final QueueSummary queue;
    private final long retriesScheduledTotal;

    public ProducerRetryDetails(QueueSummary queue, long retriesScheduledTotal) {
        if (queue == null) throw new IllegalArgumentException("retry queue is required");
        StatsValidation.nonNegative(retriesScheduledTotal, "retriesScheduledTotal");
        this.queue = queue;
        this.retriesScheduledTotal = retriesScheduledTotal;
    }

    public QueueSummary getQueue() { return queue; }
    public long getRetriesScheduledTotal() { return retriesScheduledTotal; }

    String toJson() {
        return new JsonWriter().raw("queue", queue.toJson())
                .num("retries_scheduled_total", retriesScheduledTotal).end();
    }
}
