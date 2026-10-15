package com.volcengine.model.tls.stats;

public enum HealthStatus {
    UNKNOWN("unknown"), HEALTHY("healthy"), DEGRADED("degraded"), UNHEALTHY("unhealthy");
    private final String wireName;
    HealthStatus(String wireName) { this.wireName = wireName; }
    public String getWireName() { return wireName; }
}
