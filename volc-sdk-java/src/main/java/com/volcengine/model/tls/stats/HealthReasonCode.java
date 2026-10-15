package com.volcengine.model.tls.stats;

/** Stable health reason vocabulary. */
public enum HealthReasonCode {
    INSUFFICIENT_DATA("insufficient_data"),
    METRICS_DISABLED("metrics_disabled"),
    INSTANCE_CHANGED("instance_changed"),
    COLLECTION_CHANGED("collection_changed"),
    LIFECYCLE_NOT_RUNNING("lifecycle_not_running"),
    LIFECYCLE_FAILED("lifecycle_failed"),
    CRITICAL_FLAG("critical_flag"),
    WORKER_MISSING("worker_missing"),
    QUEUE_PRESSURE("queue_pressure"),
    MEMORY_PRESSURE("memory_pressure");

    private final String wireName;
    HealthReasonCode(String wireName) { this.wireName = wireName; }
    public String getWireName() { return wireName; }
}
