package com.volcengine.model.tls.producer;

import lombok.Data;

@Data
public class CircuitBreakerConfig {
    private boolean enabled = false;
    private int minimumRequests = 100;
    private double failureRatioThreshold = 0.8;
    private int consecutiveFailuresThreshold = 20;
    private long openDurationMs = 30 * 1000L;
    private int halfOpenMaxRequests = 5;
}
