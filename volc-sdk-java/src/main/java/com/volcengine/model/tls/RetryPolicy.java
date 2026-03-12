package com.volcengine.model.tls;

import lombok.Data;

import java.util.Random;

@Data
public class RetryPolicy {
    public static final long TOTAL_TIMEOUT_MIN_MS = 30_000L;
    public static final long TOTAL_TIMEOUT_MAX_MS = 15 * 60_000L;
    public static final long INITIAL_INTERVAL_MIN_MS = 100L;
    public static final long INITIAL_INTERVAL_MAX_MS = 30_000L;
    public static final long MAX_INTERVAL_MIN_MS = 1_000L;
    public static final long MAX_INTERVAL_MAX_MS = 60_000L;
    public static final double MULTIPLIER_MIN = 1.0;
    public static final double MULTIPLIER_MAX = 3.0;
    public static final double RANDOMIZATION_MIN = 0.1;
    public static final double RANDOMIZATION_MAX = 1.0;
    public static final int MAX_ATTEMPTS_MIN = 0;
    public static final int MAX_ATTEMPTS_MAX = 50;

    public static final long DEFAULT_TOTAL_TIMEOUT_MS = 90_000L;
    public static final long DEFAULT_INITIAL_INTERVAL_MS = 500L;
    public static final long DEFAULT_MAX_INTERVAL_MS = 10_000L;
    public static final double DEFAULT_MULTIPLIER = 2.0;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.25;

    private long totalTimeoutMs = DEFAULT_TOTAL_TIMEOUT_MS;
    private long initialIntervalMs = DEFAULT_INITIAL_INTERVAL_MS;
    private long maxIntervalMs = DEFAULT_MAX_INTERVAL_MS;
    private double multiplier = DEFAULT_MULTIPLIER;
    private double randomizationFactor = DEFAULT_RANDOMIZATION_FACTOR;
    private int maxAttempts = 0;

    public static RetryPolicy defaultPolicy() {
        return new RetryPolicy();
    }

    public RetryPolicy normalize() {
        RetryPolicy out = new RetryPolicy();
        out.totalTimeoutMs = clampLong(this.totalTimeoutMs > 0 ? this.totalTimeoutMs : DEFAULT_TOTAL_TIMEOUT_MS, TOTAL_TIMEOUT_MIN_MS, TOTAL_TIMEOUT_MAX_MS);
        out.initialIntervalMs = clampLong(this.initialIntervalMs > 0 ? this.initialIntervalMs : DEFAULT_INITIAL_INTERVAL_MS, INITIAL_INTERVAL_MIN_MS, INITIAL_INTERVAL_MAX_MS);
        out.maxIntervalMs = clampLong(this.maxIntervalMs > 0 ? this.maxIntervalMs : DEFAULT_MAX_INTERVAL_MS, MAX_INTERVAL_MIN_MS, MAX_INTERVAL_MAX_MS);
        if (out.maxIntervalMs < out.initialIntervalMs) {
            out.maxIntervalMs = out.initialIntervalMs;
        }

        double m = this.multiplier;
        if (Double.isNaN(m) || m <= 0) {
            m = DEFAULT_MULTIPLIER;
        }
        out.multiplier = clampDouble(m, MULTIPLIER_MIN, MULTIPLIER_MAX);

        double r = this.randomizationFactor;
        if (Double.isNaN(r) || r < 0) {
            r = DEFAULT_RANDOMIZATION_FACTOR;
        }
        out.randomizationFactor = clampDouble(r, RANDOMIZATION_MIN, RANDOMIZATION_MAX);

        out.maxAttempts = clampInt(this.maxAttempts, MAX_ATTEMPTS_MIN, MAX_ATTEMPTS_MAX);
        return out;
    }

    public Backoff newBackoff() {
        RetryPolicy p = this.normalize();
        return new Backoff(p.initialIntervalMs, p.maxIntervalMs, p.multiplier, p.randomizationFactor);
    }

    private static long clampLong(long v, long min, long max) {
        return Math.max(min, Math.min(max, v));
    }

    private static int clampInt(int v, int min, int max) {
        return Math.max(min, Math.min(max, v));
    }

    private static double clampDouble(double v, double min, double max) {
        return Math.max(min, Math.min(max, v));
    }

    public static final class Backoff {
        private final long initialIntervalMs;
        private final long maxIntervalMs;
        private final double multiplier;
        private final double randomizationFactor;
        private final Random random;
        private long currentIntervalMs;

        private Backoff(long initialIntervalMs, long maxIntervalMs, double multiplier, double randomizationFactor) {
            this.initialIntervalMs = initialIntervalMs;
            this.maxIntervalMs = maxIntervalMs;
            this.multiplier = multiplier;
            this.randomizationFactor = randomizationFactor;
            this.random = new Random();
            this.currentIntervalMs = initialIntervalMs;
        }

        public long nextDelayMs() {
            long intervalMs = currentIntervalMs;
            currentIntervalMs = nextIntervalMs(intervalMs);
            return randomizedIntervalMs(intervalMs);
        }

        private long nextIntervalMs(long current) {
            double next = current * multiplier;
            if (next > maxIntervalMs) {
                return maxIntervalMs;
            }
            if (next < 0) {
                return maxIntervalMs;
            }
            return (long) next;
        }

        private long randomizedIntervalMs(long intervalMs) {
            double delta = randomizationFactor * intervalMs;
            double min = intervalMs - delta;
            double max = intervalMs + delta;
            double v = min + (random.nextDouble() * (max - min));
            if (v < 0) {
                return 0;
            }
            return (long) v;
        }
    }
}
