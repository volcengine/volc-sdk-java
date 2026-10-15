package com.volcengine.model.tls.stats;

import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.service.tls.stats.ProducerStatsState;
import com.volcengine.service.tls.stats.StatsClock;
import java.util.Collections;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;

public class HealthEvaluatorTest {
    private static final StatsClock CLOCK = new StatsClock() {
        public long nanoTime() { return 1_000_000_000L; }
        public long currentTimeMillis() { return 1000; }
    };

    @Test public void offPrecedesFailureAndFirstSampleHasNoInventedHealth() {
        ProducerStatsState disabled = state(MetricsLevel.OFF, new MemoryLimiter(100, 80));
        disabled.markFailed();
        HealthResult result = HealthEvaluator.evaluate(Optional.<StatsSnapshot>empty(),
                disabled.snapshot(StatsOptions.health()), HealthPolicy.defaults());
        assertEquals(HealthStatus.UNKNOWN, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.METRICS_DISABLED), result.getReasonCodes());
        ProducerStatsState enabled = state(MetricsLevel.CORE, new MemoryLimiter(100, 80));
        enabled.markStarted();
        assertEquals(Collections.singletonList(HealthReasonCode.INSUFFICIENT_DATA),
                HealthEvaluator.evaluate(Optional.<StatsSnapshot>empty(), enabled.snapshot(StatsOptions.health()),
                        HealthPolicy.defaults()).getReasonCodes());
    }

    @Test public void previousDisabledSamplePrecedesCurrentHealth() {
        ProducerStatsState disabled = state(MetricsLevel.OFF, new MemoryLimiter(100, 80));
        disabled.markStarted();
        ProducerStatsState enabled = running(new MemoryLimiter(100, 80));

        HealthResult result = HealthEvaluator.evaluate(
                Optional.<StatsSnapshot>of(disabled.snapshot(StatsOptions.health())),
                enabled.snapshot(StatsOptions.health()), HealthPolicy.defaults());
        assertEquals(HealthStatus.UNKNOWN, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.METRICS_DISABLED),
                result.getReasonCodes());
        assertTrue(result.isInsufficientData());
    }

    @Test public void offBoundaryResetsHealthButDetailOnlyDoesNot() {
        ProducerStatsState state = running(new MemoryLimiter(100, 80));
        ProducerStatsSnapshot before = state.snapshot(StatsOptions.health());
        state.setMetricsLevel(MetricsLevel.DETAILED);
        assertEquals(HealthStatus.HEALTHY, evaluate(before, state).getStatus());
        state.setMetricsLevel(MetricsLevel.OFF);
        state.setMetricsLevel(MetricsLevel.CORE);
        assertEquals(Collections.singletonList(HealthReasonCode.COLLECTION_CHANGED),
                evaluate(before, state).getReasonCodes());
    }

    @Test public void idleSenderIsNotAMissingCriticalWorker() {
        ProducerStatsState state = running(new MemoryLimiter(100, 80));
        ProducerStatsSnapshot before = state.snapshot(StatsOptions.health());
        assertEquals(HealthStatus.HEALTHY, evaluate(before, state).getStatus());
        state.onMoverWorkerStopped();
        assertEquals(Collections.singletonList(HealthReasonCode.WORKER_MISSING),
                evaluate(before, state).getReasonCodes());
    }

    @Test public void memoryUsesActualPayloadAdmissionPressureNotOnlyTotalBudget() throws Exception {
        MemoryLimiter memory = new MemoryLimiter(100, 80);
        ProducerStatsState state = running(memory);
        ProducerStatsSnapshot before = state.snapshot(StatsOptions.health());
        assertTrue(memory.acquirePayload(70, 0)); // total=70%, payload gate=87.5%
        HealthResult result = evaluate(before, state);
        assertEquals(HealthStatus.DEGRADED, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.MEMORY_PRESSURE), result.getReasonCodes());
        assertFalse(result.isInsufficientData());
    }

    @Test public void changedInstanceIsUnknown() {
        ProducerStatsState one = running(new MemoryLimiter(100, 80));
        ProducerStatsState two = new ProducerStatsState(MetricsLevel.CORE, 2,
                new MemoryLimiter(100, 80), "other", CLOCK);
        two.markStarted();
        assertEquals(Collections.singletonList(HealthReasonCode.INSTANCE_CHANGED),
                evaluate(one.snapshot(StatsOptions.health()), two).getReasonCodes());
    }

    @Test public void failedLifecycleIsUnhealthy() {
        ProducerStatsState state = state(MetricsLevel.CORE, new MemoryLimiter(100, 80));
        state.markStarted();
        ProducerStatsSnapshot before = state.snapshot(StatsOptions.health());
        state.markFailed();

        HealthResult result = evaluate(before, state);
        assertEquals(HealthStatus.UNHEALTHY, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.LIFECYCLE_FAILED),
                result.getReasonCodes());
        assertFalse(result.isInsufficientData());
    }

    @Test public void criticalFlagPrecedesMissingWorkerSignal() {
        ProducerStatsState state = running(new MemoryLimiter(100, 80));
        ProducerStatsSnapshot before = state.snapshot(StatsOptions.health());
        state.markFinalizationIncomplete();
        state.onMoverWorkerStopped();

        HealthResult result = evaluate(before, state);
        assertEquals(HealthStatus.UNHEALTHY, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.CRITICAL_FLAG),
                result.getReasonCodes());
        assertFalse(result.isInsufficientData());
    }

    @Test public void queuePressureDegradesRunningProducer() {
        ProducerHealthSignals beforeHealth = health(0.0D, Collections.<CriticalFlag>emptyList());
        ProducerHealthSignals currentHealth = health(0.80D, Collections.<CriticalFlag>emptyList());
        ProducerStatsSnapshot before = snapshot(LifecycleState.RUNNING, beforeHealth);
        ProducerStatsSnapshot current = snapshot(LifecycleState.RUNNING, currentHealth);

        HealthResult result = HealthEvaluator.evaluate(Optional.<StatsSnapshot>of(before), current,
                HealthPolicy.defaults());
        assertEquals(HealthStatus.DEGRADED, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.QUEUE_PRESSURE),
                result.getReasonCodes());
        assertFalse(result.isInsufficientData());
    }

    @Test public void nonRunningLifecycleStatesAreUnknown() {
        ProducerStatsState newlyCreated = state(MetricsLevel.CORE, new MemoryLimiter(100, 80));
        assertNonRunning(newlyCreated, LifecycleState.NEW);

        ProducerStatsState closing = state(MetricsLevel.CORE, new MemoryLimiter(100, 80));
        closing.markStarted();
        closing.markClosing();
        assertNonRunning(closing, LifecycleState.CLOSING);

        ProducerStatsState closed = state(MetricsLevel.CORE, new MemoryLimiter(100, 80));
        closed.markClosedAndFreeze();
        assertNonRunning(closed, LifecycleState.CLOSED);
    }

    private static ProducerStatsState state(MetricsLevel level, MemoryLimiter memory) {
        return new ProducerStatsState(level, 2, memory, "producer", CLOCK);
    }
    private static ProducerStatsState running(MemoryLimiter memory) {
        ProducerStatsState state = state(MetricsLevel.CORE, memory);
        state.markStarted();
        state.onMoverWorkerStarted();
        state.onCallbackWorkerStarted();
        state.onCallbackWorkerStarted();
        return state;
    }
    private static HealthResult evaluate(ProducerStatsSnapshot before, ProducerStatsState state) {
        return HealthEvaluator.evaluate(Optional.<StatsSnapshot>of(before),
                state.snapshot(StatsOptions.health()), HealthPolicy.defaults());
    }

    private static void assertNonRunning(ProducerStatsState state, LifecycleState expected) {
        ProducerStatsSnapshot current = state.snapshot(StatsOptions.health());
        assertEquals(expected, current.getHeader().getLifecycleState());
        HealthResult result = HealthEvaluator.evaluate(Optional.<StatsSnapshot>of(current), current,
                HealthPolicy.defaults());
        assertEquals(HealthStatus.UNKNOWN, result.getStatus());
        assertEquals(Collections.singletonList(HealthReasonCode.LIFECYCLE_NOT_RUNNING),
                result.getReasonCodes());
        assertTrue(result.isInsufficientData());
    }

    private static ProducerHealthSignals health(Double queuePressure,
                                                java.util.List<CriticalFlag> flags) {
        return new ProducerHealthSignals(null, null, queuePressure, null, null, null,
                new WorkerSummary(4, 4, 0, 0), flags);
    }

    private static ProducerStatsSnapshot snapshot(LifecycleState lifecycle,
                                                   ProducerHealthSignals health) {
        long capabilities = Capability.HEALTH;
        StatsView view = StatsView.HEALTH;
        java.util.List<MissingSection> missing = StatsSections.missing(ComponentType.PRODUCER,
                capabilities, MetricsLevel.CORE, view);
        SnapshotHeader header = new SnapshotHeader("producer", ComponentType.PRODUCER, 1000L, 0L,
                1L, lifecycle, Consistency.WEAK, MetricsLevel.CORE, view, !missing.isEmpty(),
                capabilities, missing, 1L, 1000L);
        return new ProducerStatsSnapshot(header, health, null, null, null, null, null, null);
    }
}
