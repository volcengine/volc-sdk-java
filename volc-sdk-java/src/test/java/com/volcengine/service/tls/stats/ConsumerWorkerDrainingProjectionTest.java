package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.WorkerRole;
import com.volcengine.model.tls.stats.WorkerDetail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConsumerWorkerDrainingProjectionTest {
    @Test
    public void assignmentCanDropBeforeShardAndCheckpointWorkersExit() {
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.DETAILED, 1, "consumer-draining", StatsClock.SYSTEM);
        state.markStarted();
        state.onAssignment(1, false);
        state.onShardWorkerStarted();
        state.onCheckpointWorkerStarted();

        state.onAssignment(0, true);

        ConsumerStatsSnapshot health = state.snapshot(StatsOptions.health());
        assertEquals(0, state.snapshot(StatsOptions.operational()).getOperational().get().getAssignedShards());
        assertEquals(4, health.getHealth().get().getWorkerSummary().getExpectedTotal());
        assertEquals(2, health.getHealth().get().getWorkerSummary().getRunningTotal());
        assertDraining(state.snapshot(StatsOptions.operational()));
        assertDraining(state.snapshot(StatsOptions.debug()));

        state.onShardWorkerStopped();
        state.onCheckpointWorkerStopped();

        ConsumerStatsSnapshot drained = state.snapshot(StatsOptions.debug());
        assertRole(drained, WorkerRole.SHARD_WORKER, 0, 0);
        assertRole(drained, WorkerRole.CHECKPOINT, 0, 0);
    }

    @Test
    public void executorTerminationClearsWrappersAndLateFinallyDoesNotUnderflow() {
        ConsumerStatsState state = new ConsumerStatsState(
                MetricsLevel.DETAILED, 1, "consumer-terminated", StatsClock.SYSTEM);
        state.markStarted();
        for (int i = 0; i < 45; i++) {
            state.onShardWorkerStarted();
        }

        state.onShardExecutorTerminated();
        for (int i = 0; i < 45; i++) {
            state.onShardWorkerStopped();
        }

        ConsumerStatsSnapshot snapshot = state.snapshot(StatsOptions.operational());
        assertEquals(0L, snapshot.getHealth().get().getWorkerSummary().getRunningTotal());
        assertFalse(snapshot.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    private static void assertDraining(ConsumerStatsSnapshot snapshot) {
        assertEquals(0, snapshot.getOperational().get().getAssignedShards());
        assertEquals(4, snapshot.getOperational().get().getWorkers().getExpectedTotal());
        assertEquals(2, snapshot.getOperational().get().getWorkers().getRunningTotal());
        if (snapshot.getWorkerDetails().isPresent()) {
            assertRole(snapshot, WorkerRole.SHARD_WORKER, 1, 1);
            assertRole(snapshot, WorkerRole.CHECKPOINT, 1, 1);
        }
    }

    private static void assertRole(ConsumerStatsSnapshot snapshot, WorkerRole expectedRole,
                                   long expected, long running) {
        for (WorkerDetail role : snapshot.getWorkerDetails().get().getItems()) {
            if (role.getRole() == expectedRole) {
                assertEquals(expected, role.getExpected());
                assertEquals(running, role.getRunning());
                return;
            }
        }
        throw new AssertionError("missing worker role " + expectedRole);
    }
}
