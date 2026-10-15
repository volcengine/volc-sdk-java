package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;

/**
 * Per-instance collection epochs. One immutable state is allocated per transition, never per log.
 *
 * <p>Owners synchronize on this object when publishing a transition, capturing a snapshot, or
 * checking a token and applying its observation. Optional state and live gauge baselines must be
 * prepared under the same monitor before {@link #changeLevel} publishes the new level. Physical
 * ownership/cleanup must never depend on whether an observation token is still accepted.
 */
public final class RuntimeCollection {
    private volatile State state;

    public RuntimeCollection(MetricsLevel level, long nowUnixMs) {
        level = MetricsLevel.normalize(level);
        state = new State(level, 1, 1, level == MetricsLevel.OFF ? 0 : nonNegative(nowUnixMs));
    }

    public MetricsLevel getLevel() { return state.level; }
    public boolean isEnabled() { return state.level != MetricsLevel.OFF; }
    public boolean isDetailed() { return state.level == MetricsLevel.DETAILED; }
    public long getGeneration() { return state.generation; }
    public long getStartedAtUnixMs() { return state.startedAtUnixMs; }

    /** Zero is the permanently invalid token for work begun while OFF. */
    public long beginCollection() {
        State current = state;
        return current.level == MetricsLevel.OFF ? 0 : current.generation;
    }

    public long beginDetail() {
        State current = state;
        return current.level == MetricsLevel.DETAILED ? current.detailGeneration : 0;
    }

    public boolean acceptsCollection(long token) {
        State current = state;
        return token != 0 && current.level != MetricsLevel.OFF && token == current.generation;
    }

    public boolean acceptsDetail(long token) {
        State current = state;
        return token != 0 && current.level == MetricsLevel.DETAILED && token == current.detailGeneration;
    }

    public static void validateChange(MetricsLevel next, LifecycleState lifecycle) {
        if (next == null) throw new IllegalArgumentException("metrics level must not be null");
        if (lifecycle != LifecycleState.RUNNING) {
            throw new IllegalStateException("metrics level change requires a running component");
        }
    }

    /** Returns whether any transition occurred; even a no-op requires a running component. */
    public synchronized boolean changeLevel(MetricsLevel next, LifecycleState lifecycle, long nowUnixMs) {
        validateChange(next, lifecycle);
        State old = state;
        if (old.level == next) return false;
        boolean crossesOff = old.level == MetricsLevel.OFF || next == MetricsLevel.OFF;
        boolean crossesDetail = (old.level == MetricsLevel.DETAILED) != (next == MetricsLevel.DETAILED);
        state = new State(next, crossesOff ? increment(old.generation) : old.generation,
                crossesDetail ? increment(old.detailGeneration) : old.detailGeneration,
                next == MetricsLevel.OFF ? 0 : crossesOff ? nonNegative(nowUnixMs) : old.startedAtUnixMs);
        return true;
    }

    /** Only called after all prior-run workers have terminated and live gauges have been reset. */
    public synchronized void restart(long nowUnixMs) {
        State old = state;
        state = new State(old.level, increment(old.generation), increment(old.detailGeneration),
                old.level == MetricsLevel.OFF ? 0 : nonNegative(nowUnixMs));
    }

    private static long nonNegative(long value) {
        if (value < 0) throw new IllegalArgumentException("time must not be negative");
        return value;
    }

    private static long increment(long value) {
        if (value == Long.MAX_VALUE) throw new IllegalStateException("collection generation exhausted");
        return value + 1;
    }

    private static final class State {
        final MetricsLevel level;
        final long generation, detailGeneration, startedAtUnixMs;
        State(MetricsLevel level, long generation, long detailGeneration, long startedAtUnixMs) {
            this.level = level;
            this.generation = generation;
            this.detailGeneration = detailGeneration;
            this.startedAtUnixMs = startedAtUnixMs;
        }
    }
}
