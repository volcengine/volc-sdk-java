package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** Component-wide health age facts for the reusable Java consumer state. */
public class ConsumerHealthAgeTest {
    private static final class Clock implements StatsClock {
        long nowMs = 1000L;

        public long nanoTime() { return nowMs * 1_000_000L; }
        public long currentTimeMillis() { return nowMs; }
    }

    @Test
    public void healthAgeUsesTheMostRecentSuccessAndErrorAcrossOperations() {
        Clock clock = new Clock();
        clock.nowMs = 0L;
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-health-age", clock);
        state.markStarted();

        long heartbeatToken = state.beginHeartbeat();
        state.onHeartbeatCall(heartbeatToken, true);
        ConsumerStatsSnapshot heartbeatSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(0L), heartbeatSnapshot.getHealth().get()
                .getLastSuccessAgeMs());
        assertNull(heartbeatSnapshot.getHealth().get().getLastErrorAgeMs());

        clock.nowMs = 100L;
        long fetchToken = state.beginFetch();
        state.onFetchCall(fetchToken, 0L, false, 0L, 0L, 0L);
        state.onFetchEnd(fetchToken);
        ConsumerStatsSnapshot fetchFailureSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(100L), fetchFailureSnapshot.getHealth().get()
                .getLastSuccessAgeMs());
        assertEquals(Long.valueOf(0L), fetchFailureSnapshot.getHealth().get()
                .getLastErrorAgeMs());

        clock.nowMs = 150L;
        fetchToken = state.beginFetch();
        state.onFetchCall(fetchToken, 0L, true, 1L, 2L, 0L);
        state.onFetchEnd(fetchToken);
        ConsumerStatsSnapshot fetchSuccessSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(0L), fetchSuccessSnapshot.getHealth().get()
                .getLastSuccessAgeMs());
        assertEquals(Long.valueOf(50L), fetchSuccessSnapshot.getHealth().get()
                .getLastErrorAgeMs());

        clock.nowMs = 200L;
        ConsumerStatsState.BatchSlot slot = state.newBatchSlot(0);
        long processToken = state.beginProcessCollection();
        long processDetailToken = state.beginProcessDetail();
        assertTrue(state.onProcessStart(slot, processToken, processDetailToken, 0L, 0L));
        assertTrue(state.onProcessEnd(slot, false, processDetailToken, 0L));
        ConsumerStatsSnapshot processFailureSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(50L), processFailureSnapshot.getHealth().get()
                .getLastSuccessAgeMs());
        assertEquals(Long.valueOf(0L), processFailureSnapshot.getHealth().get()
                .getLastErrorAgeMs());

        clock.nowMs = 300L;
        long checkpointToken = state.beginCheckpointCall();
        long checkpointDetailToken = state.beginCheckpointDetail();
        state.onCheckpointFlush(checkpointToken, checkpointDetailToken,
                true, false, null, 0L);
        ConsumerStatsSnapshot checkpointSuccessSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(0L), checkpointSuccessSnapshot.getHealth().get()
                .getLastSuccessAgeMs());
        assertEquals(Long.valueOf(100L), checkpointSuccessSnapshot.getHealth().get()
                .getLastErrorAgeMs());

        clock.nowMs = 400L;
        checkpointToken = state.beginCheckpointCall();
        checkpointDetailToken = state.beginCheckpointDetail();
        state.onCheckpointFlush(checkpointToken, checkpointDetailToken,
                false, false, null, 0L);

        clock.nowMs = 500L;
        ConsumerStatsSnapshot snapshot = state.snapshot(StatsOptions.health());
        assertNotNull(snapshot.getHealth().get().getLastSuccessAgeMs());
        assertNotNull(snapshot.getHealth().get().getLastErrorAgeMs());
        assertEquals(Long.valueOf(200L), snapshot.getHealth().get().getLastSuccessAgeMs());
        assertEquals(Long.valueOf(100L), snapshot.getHealth().get().getLastErrorAgeMs());
        assertTrue(snapshot.toJson().contains("\"last_success_age_ms\":200"));
        assertTrue(snapshot.toJson().contains("\"last_error_age_ms\":100"));
    }

    @Test
    public void offAndCleanRestartClearAgesWhileFinalSnapshotFreezesThem() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-health-age-reset", clock);
        state.markStarted();

        long heartbeatToken = state.beginHeartbeat();
        state.onHeartbeatCall(heartbeatToken, true);
        clock.nowMs = 1100L;
        assertEquals(Long.valueOf(100L), state.snapshot(StatsOptions.health())
                .getHealth().get().getLastSuccessAgeMs());

        state.setMetricsLevel(MetricsLevel.OFF);
        state.setMetricsLevel(MetricsLevel.CORE);
        assertNull(state.snapshot(StatsOptions.health()).getHealth().get()
                .getLastSuccessAgeMs());
        assertNull(state.snapshot(StatsOptions.health()).getHealth().get()
                .getLastErrorAgeMs());

        clock.nowMs = 1200L;
        long failureToken = state.beginHeartbeat();
        state.onHeartbeatCall(failureToken, false);
        clock.nowMs = 1300L;
        state.markClosing();
        state.markClosedAndFreeze();
        ConsumerStatsSnapshot finalSnapshot = state.snapshot(StatsOptions.health());
        assertEquals(Long.valueOf(100L), finalSnapshot.getHealth().get().getLastErrorAgeMs());

        clock.nowMs = 5000L;
        state.onHeartbeatCall(failureToken, true);
        assertEquals(Long.valueOf(100L), state.snapshot(StatsOptions.health())
                .getHealth().get().getLastErrorAgeMs());

        state.restart();
        state.markStarted();
        ConsumerStatsSnapshot restarted = state.snapshot(StatsOptions.health());
        assertNull(restarted.getHealth().get().getLastSuccessAgeMs());
        assertNull(restarted.getHealth().get().getLastErrorAgeMs());
    }
}
