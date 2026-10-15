package com.volcengine.model.tls.stats;

/** Stable reasons for replacing a counter-delta baseline. */
public enum DeltaResetReason {
    INITIAL_BASELINE("initial_baseline"),
    METRICS_UNAVAILABLE("metrics_unavailable"),
    INSTANCE_CHANGED("instance_changed"),
    COLLECTION_CHANGED("collection_changed"),
    SEQUENCE_NOT_INCREASING("sequence_not_increasing"),
    UPTIME_REGRESSED("uptime_regressed"),
    CAPTURE_TIME_NOT_INCREASING("capture_time_not_increasing"),
    COUNTER_REGRESSED("counter_regressed"),
    COUNTER_SET_CHANGED("counter_set_changed");

    private final String wireName;

    DeltaResetReason(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }

    @Override
    public String toString() {
        return wireName;
    }
}
