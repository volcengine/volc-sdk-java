package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Runtime generation and cohort checks for the reusable Java consumer state. */
public class ConsumerRuntimeTest {
    private static final class Clock implements StatsClock {
        long nowMs = 1000L;

        public long nanoTime() { return nowMs * 1_000_000L; }
        public long currentTimeMillis() { return nowMs; }
    }

    @Test
    public void offDropsOldCohortButKeepsCumulativeCounters() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-runtime", clock);
        state.markStarted();
        ConsumerStatsState.BatchSlot slot = state.newBatchSlot(0);

        long generation = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        long fetchToken = state.beginFetch();
        state.onFetchCall(fetchToken, 0L, true, 1L, 2L, 1L);
        state.onFetchEnd(fetchToken);
        assertTrue(state.onBatchHeld(slot, 1L, 2L, fetchToken));
        long processToken = state.beginProcessCollection();
        long processDetailToken = state.beginProcessDetail();
        assertTrue(state.onProcessStart(slot, processToken, processDetailToken, 1L, 2L));

        state.setMetricsLevel(MetricsLevel.OFF);
        ConsumerStatsSnapshot off = state.snapshot(StatsOptions.operational());
        assertEquals(MetricsLevel.OFF, off.getHeader().getCollectedLevel());
        assertEquals(0L, off.getHeader().getCollectionStartedAtUnixMs());
        assertFalse(off.getHealth().isPresent());
        assertFalse(off.getOperational().isPresent());

        // The in-flight physical batch still gets released, but its old terminal outcome is
        // rejected after the OFF boundary and cannot be added to the new window.
        assertFalse(state.onProcessEnd(slot, true, state.processDetailToken(slot), 1L));
        assertFalse(state.onBatchReleased(slot));

        clock.nowMs = 1100L;
        state.setMetricsLevel(MetricsLevel.CORE);
        ConsumerStatsSnapshot reopened = state.snapshot(StatsOptions.operational());
        assertTrue(reopened.getHeader().getCollectionGeneration() > generation);
        assertEquals(0L, reopened.getOperational().get().getHeldBatchReferences());
        assertEquals(1L, reopened.getOperational().get().getFetchedLogGroupsTotal());
        assertEquals(0L, reopened.getOperational().get().getHandlerNormalReturnsTotal());

        // The same reusable slot can establish a fresh cohort in the new generation.
        fetchToken = state.beginFetch();
        state.onFetchCall(fetchToken, 0L, true, 1L, 2L, 1L);
        state.onFetchEnd(fetchToken);
        assertTrue(state.onBatchHeld(slot, 1L, 2L, fetchToken));
        processToken = state.beginProcessCollection();
        processDetailToken = state.beginProcessDetail();
        assertTrue(state.onProcessStart(slot, processToken, processDetailToken, 1L, 2L));
        assertTrue(state.onProcessEnd(slot, true, processDetailToken, 1L));
        assertTrue(state.onBatchReleased(slot));
        ConsumerStatsSnapshot finalSnapshot = state.snapshot(StatsOptions.operational());
        assertEquals(1L, finalSnapshot.getOperational().get().getHandlerNormalReturnsTotal());
        assertEquals(2L, finalSnapshot.getOperational().get().getFetchedLogGroupsTotal());
    }

    @Test
    public void detailOnlyTransitionsKeepCollectionGeneration() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-detail", clock);
        state.markStarted();
        long generation = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        state.setMetricsLevel(MetricsLevel.DETAILED);
        assertEquals(generation,
                state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration());
        state.setMetricsLevel(MetricsLevel.CORE);
        assertEquals(generation,
                state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration());
    }

    @Test
    public void staleProcessStartTokenCannotAdoptTheReopenedCollection() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-process-token", clock);
        state.markStarted();
        ConsumerStatsState.BatchSlot slot = state.newBatchSlot(0);
        long processToken = state.beginProcessCollection();
        long detailToken = state.beginProcessDetail();

        state.setMetricsLevel(MetricsLevel.OFF);
        state.setMetricsLevel(MetricsLevel.CORE);

        assertFalse(state.onProcessStart(slot, processToken, detailToken, 1L, 1L));
        ConsumerStatsSnapshot snapshot = state.snapshot(StatsOptions.operational());
        assertEquals(0L, snapshot.getOperational().get().getHandlerNormalReturnsTotal());
        assertEquals(0, snapshot.getOperational().get().getProcessInFlight());
        assertFalse(snapshot.getHealth().get().getCriticalFlags()
                .contains(com.volcengine.model.tls.stats.CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    @Test
    public void staleProcessEndAfterPhysicalReleaseDoesNotSetInvariantFlag() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-process-release", clock);
        state.markStarted();
        ConsumerStatsState.BatchSlot slot = state.newBatchSlot(0);
        long fetchToken = state.beginFetch();
        assertTrue(state.onBatchHeld(slot, 1L, 1L, fetchToken));
        state.onFetchEnd(fetchToken);
        long processToken = state.beginProcessCollection();
        long processDetailToken = state.beginProcessDetail();
        assertTrue(state.onProcessStart(slot, processToken, processDetailToken, 1L, 1L));

        state.setMetricsLevel(MetricsLevel.OFF);
        assertFalse(state.onBatchReleased(slot));
        state.setMetricsLevel(MetricsLevel.CORE);
        assertFalse(state.onProcessEnd(slot, true, state.processDetailToken(slot), 0L));

        ConsumerStatsSnapshot snapshot = state.snapshot(StatsOptions.operational());
        assertFalse(snapshot.getHealth().get().getCriticalFlags()
                .contains(com.volcengine.model.tls.stats.CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    @Test
    public void levelChangeRequiresRunningLifecycle() {
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.OFF, 1, "consumer-lifecycle", StatsClock.SYSTEM);
        try {
            state.setMetricsLevel(MetricsLevel.CORE);
        } catch (IllegalStateException expected) {
            return;
        }
        throw new AssertionError("level change before start must be rejected");
    }
}
