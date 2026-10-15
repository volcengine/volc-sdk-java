package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.StatsView;
import com.volcengine.model.tls.stats.WorkerDetails;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class ConsumerWorkerDetailsCacheTest {
    @Test
    public void snapshotReusesBoundedWorkerDetailsUntilAWorkerFactChanges() {
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.DETAILED, 2, "consumer-cache", StatsClock.SYSTEM);
        state.markStarted();
        state.onAssignment(256, false);

        WorkerDetails first = details(state);
        WorkerDetails second = details(state);
        assertSame("getStats must not rebuild a list proportional to assignment", first, second);
        assertEquals(4L, first.getTotalCount());
        assertEquals(4, first.getItems().size());
        assertEquals(256, first.getItems().get(2).getExpected());
        assertEquals(256, first.getItems().get(3).getExpected());

        state.onShardWorkerStarted();
        WorkerDetails afterStart = details(state);
        assertNotSame(first, afterStart);
        assertSame(afterStart, details(state));

        state.onShardTaskStarted();
        WorkerDetails whileBusy = details(state);
        assertNotSame(afterStart, whileBusy);
        assertSame(whileBusy, details(state));
        state.onShardTaskStopped();
        assertSame(afterStart, details(state));

        state.onShardWorkerStopped();
        state.onAssignment(1, true);
        WorkerDetails afterRebalance = details(state);
        assertNotSame(afterStart, afterRebalance);
        assertEquals(4L, afterRebalance.getTotalCount());
        assertEquals(4, afterRebalance.getItems().size());
        assertSame(afterRebalance, details(state));
    }

    private static WorkerDetails details(ConsumerStatsState state) {
        ConsumerStatsSnapshot snapshot = state.snapshot(new StatsOptions(StatsView.DEBUG));
        return snapshot.getWorkerDetails().get();
    }
}
