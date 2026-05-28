package com.volcengine.model.tls.producer;

public class CircuitBreaker {
    private enum State {
        CLOSED,
        OPEN,
        HALF_OPEN
    }

    private final CircuitBreakerConfig config;
    private State state = State.CLOSED;
    private int totalRequests;
    private int totalFailures;
    private int consecutiveFailures;
    private int halfOpenInFlight;
    private int halfOpenSuccesses;
    private long openedAtMs;

    public CircuitBreaker(CircuitBreakerConfig config) {
        this.config = config == null ? new CircuitBreakerConfig() : config;
    }

    public synchronized boolean allowRequest() {
        return acquirePermit() >= 0;
    }

    public synchronized int acquirePermit() {
        if (!config.isEnabled()) {
            return 0;
        }
        if (state == State.CLOSED) {
            return 0;
        }
        long now = monotonicMs();
        if (state == State.OPEN) {
            if (now - openedAtMs < config.getOpenDurationMs()) {
                return -1;
            }
            toHalfOpen();
        }
        if (halfOpenInFlight >= Math.max(1, config.getHalfOpenMaxRequests())) {
            return -1;
        }
        halfOpenInFlight++;
        return 1;
    }

    public synchronized void recordSuccess() {
        recordSuccess(1);
    }

    public synchronized void recordSuccess(int permitCount) {
        if (!config.isEnabled()) {
            return;
        }
        if (state == State.HALF_OPEN) {
            if (permitCount <= 0) {
                return;
            }
            releasePermitsLocked(permitCount);
            halfOpenSuccesses += permitCount;
            if (halfOpenSuccesses >= Math.max(1, config.getHalfOpenMaxRequests())) {
                reset();
            }
            return;
        }
        totalRequests++;
        consecutiveFailures = 0;
    }

    public synchronized void recordFailure(FailureType type) {
        recordFailure(type, 1);
    }

    public synchronized void recordFailure(FailureType type, int permitCount) {
        if (!config.isEnabled()) {
            return;
        }
        if (state == State.HALF_OPEN) {
            if (permitCount > 0) {
                releasePermitsLocked(permitCount);
            }
            if (FailureClassifier.shouldRecordCircuitFailure(type)) {
                open();
            }
            return;
        }
        if (!FailureClassifier.shouldRecordCircuitFailure(type)) {
            return;
        }
        totalRequests++;
        totalFailures++;
        consecutiveFailures++;
        if (consecutiveFailures >= Math.max(1, config.getConsecutiveFailuresThreshold())) {
            open();
            return;
        }
        if (totalRequests >= Math.max(1, config.getMinimumRequests())) {
            double ratio = (double) totalFailures / (double) totalRequests;
            if (ratio >= config.getFailureRatioThreshold()) {
                open();
            }
        }
    }

    private void open() {
        state = State.OPEN;
        openedAtMs = monotonicMs();
        halfOpenInFlight = 0;
        halfOpenSuccesses = 0;
    }

    private static long monotonicMs() {
        return System.nanoTime() / 1_000_000L;
    }

    public synchronized void releasePermit() {
        releasePermits(1);
    }

    public synchronized void releasePermits(int count) {
        if (!config.isEnabled()) {
            return;
        }
        releasePermitsLocked(count);
    }

    private void releasePermitsLocked(int count) {
        if (state != State.HALF_OPEN || count <= 0) {
            return;
        }
        halfOpenInFlight = Math.max(0, halfOpenInFlight - count);
    }

    private void toHalfOpen() {
        state = State.HALF_OPEN;
        halfOpenInFlight = 0;
        halfOpenSuccesses = 0;
    }

    private void reset() {
        state = State.CLOSED;
        totalRequests = 0;
        totalFailures = 0;
        consecutiveFailures = 0;
        halfOpenInFlight = 0;
        halfOpenSuccesses = 0;
        openedAtMs = 0;
    }
}
