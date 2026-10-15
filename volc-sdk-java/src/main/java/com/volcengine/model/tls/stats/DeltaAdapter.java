package com.volcengine.model.tls.stats;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Bounded, synchronous adapter for cumulative counter samples.
 *
 * <p>The adapter retains one immutable baseline only. It starts no worker and
 * performs no I/O.</p>
 */
public final class DeltaAdapter {
    private CounterSample previous;

    /** Computes against the previous baseline and always replaces it. */
    public synchronized DeltaResult observe(CounterSample current) {
        requireSample(current, "current");
        if (metricsUnavailable(current)) {
            previous = current;
            return DeltaResult.invalid(DeltaResetReason.METRICS_UNAVAILABLE);
        }
        if (previous == null) {
            previous = current;
            return DeltaResult.invalid(DeltaResetReason.INITIAL_BASELINE);
        }

        DeltaResult result = computeDelta(previous, current);
        previous = current;
        return result;
    }

    /** Discards the single retained baseline. */
    public synchronized void reset() {
        previous = null;
    }

    /** Stateless form of the Go-contract validation and rate calculation. */
    public static DeltaResult computeDelta(CounterSample previous, CounterSample current) {
        requireSample(previous, "previous");
        requireSample(current, "current");

        if (metricsUnavailable(previous) || metricsUnavailable(current)) {
            return DeltaResult.invalid(DeltaResetReason.METRICS_UNAVAILABLE);
        }

        SnapshotHeader before = previous.getHeader();
        SnapshotHeader now = current.getHeader();
        if (before.getInstanceId().isEmpty()
                || !before.getInstanceId().equals(now.getInstanceId())) {
            return DeltaResult.invalid(DeltaResetReason.INSTANCE_CHANGED);
        }
        if (before.getCollectionGeneration() != now.getCollectionGeneration()) {
            return DeltaResult.invalid(DeltaResetReason.COLLECTION_CHANGED);
        }
        if (now.getSnapshotSequence() <= before.getSnapshotSequence()) {
            return DeltaResult.invalid(DeltaResetReason.SEQUENCE_NOT_INCREASING);
        }
        // Equal uptime is permitted; only a backwards uptime is a reset.
        if (now.getUptimeMs() < before.getUptimeMs()) {
            return DeltaResult.invalid(DeltaResetReason.UPTIME_REGRESSED);
        }
        long intervalMs = now.getCapturedAtUnixMs() - before.getCapturedAtUnixMs();
        if (intervalMs <= 0L) {
            return DeltaResult.invalid(DeltaResetReason.CAPTURE_TIME_NOT_INCREASING);
        }

        Map<String, Long> priorCounters = previous.getCounters();
        Map<String, Long> currentCounters = current.getCounters();
        if (currentCounters.size() != priorCounters.size()) {
            return DeltaResult.invalid(DeltaResetReason.COUNTER_SET_CHANGED);
        }

        Map<String, Long> deltas = new LinkedHashMap<>(currentCounters.size());
        Map<String, Double> rates = new LinkedHashMap<>(currentCounters.size());
        for (Map.Entry<String, Long> entry : currentCounters.entrySet()) {
            Long previousValue = priorCounters.get(entry.getKey());
            if (previousValue == null) {
                return DeltaResult.invalid(DeltaResetReason.COUNTER_SET_CHANGED);
            }
            long currentValue = entry.getValue();
            if (currentValue < previousValue) {
                return DeltaResult.invalid(DeltaResetReason.COUNTER_REGRESSED);
            }
            long delta = currentValue - previousValue;
            deltas.put(entry.getKey(), delta);
            rates.put(entry.getKey(), ((double) delta) * 1000D / (double) intervalMs);
        }
        return DeltaResult.valid(intervalMs, deltas, rates);
    }

    private static boolean metricsUnavailable(CounterSample sample) {
        return sample.getHeader().isMetricsDisabled() || sample.getCounters() == null;
    }

    private static void requireSample(CounterSample sample, String name) {
        if (sample == null) {
            throw new IllegalArgumentException(name + " sample must not be null");
        }
    }
}
