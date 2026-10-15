package com.volcengine.model.tls.stats;

/** Consumer debug backoff facts. */
public final class ConsumerRetryDetails {
    private final long backoffEventsTotal;

    public ConsumerRetryDetails(long backoffEventsTotal) {
        StatsValidation.nonNegative(backoffEventsTotal, "backoffEventsTotal");
        this.backoffEventsTotal = backoffEventsTotal;
    }

    public long getBackoffEventsTotal() { return backoffEventsTotal; }

    String toJson() {
        return new JsonWriter().num("backoff_events_total", backoffEventsTotal).end();
    }
}
