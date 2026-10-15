package com.volcengine.model.tls.stats;

/** Stable, ordered vocabulary for required sections omitted from a requested projection. */
public enum MissingSection {
    HEALTH("health"),
    OPERATIONAL("operational"),
    BATCH_INFLIGHT_MEMORY_GATE("batch_inflight_memory_gate"),
    MANAGED_MEMORY("managed_memory"),
    WORKER_DETAILS("worker_details"),
    RETRY_DETAILS("retry_details"),
    LATENCY_HISTOGRAMS("latency_histograms"),
    MEMORY_BREAKDOWN("memory_breakdown");

    private final String wireName;

    MissingSection(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
