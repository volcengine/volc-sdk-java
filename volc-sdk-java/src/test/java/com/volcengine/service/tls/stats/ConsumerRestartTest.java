package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Restart must reopen one instance without replacing cumulative observation state. */
public class ConsumerRestartTest {
    private static final class Clock implements StatsClock {
        long nowMs = 1000L;

        public long nanoTime() { return nowMs * 1_000_000L; }
        public long currentTimeMillis() { return nowMs; }
    }

    @Test
    public void restartPreservesCountersAndUptimeButAdvancesGeneration() {
        Clock clock = new Clock();
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.CORE, 1, "consumer-restart", clock);
        state.markStarted();
        long fetchToken = state.beginFetch();
        state.onFetchCall(fetchToken, 0L, true, 2L, 3L, 1L);
        state.onFetchEnd(fetchToken);
        clock.nowMs = 1200L;
        state.markClosing();
        state.markClosedAndFreeze();

        ConsumerStatsSnapshot first = state.snapshot(StatsOptions.operational());
        long firstGeneration = first.getHeader().getCollectionGeneration();
        long firstUptime = first.getHeader().getUptimeMs();
        assertEquals(LifecycleState.CLOSED, first.getHeader().getLifecycleState());

        clock.nowMs = 2000L;
        state.restart();
        state.markStarted();
        ConsumerStatsSnapshot second = state.snapshot(StatsOptions.operational());
        assertEquals(LifecycleState.RUNNING, second.getHeader().getLifecycleState());
        assertTrue(second.getHeader().getCollectionGeneration() > firstGeneration);
        assertTrue(second.getHeader().getUptimeMs() >= firstUptime);
        assertEquals(2L, second.getOperational().get().getFetchedLogGroupsTotal());
    }
}
