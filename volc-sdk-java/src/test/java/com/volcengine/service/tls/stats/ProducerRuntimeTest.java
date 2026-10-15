package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.StatsOptions;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProducerRuntimeTest {
    private static final class Clock implements StatsClock {
        long time = 1000;
        public long nanoTime() { return time * 1_000_000L; }
        public long currentTimeMillis() { return time; }
    }

    @Test public void runtimeOffRejectsOldTerminalButReleasesPhysicalMemory() throws Exception {
        Clock clock = new Clock();
        MemoryLimiter limiter = new MemoryLimiter(1000, 800, true);
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.CORE, 2, limiter, "producer", clock);
        stats.markStarted();
        long old = stats.acquirePayloadAndAcceptGeneration(limiter, 10, 0, 1);
        BatchLog batch = batch(old, stats);
        stats.setMetricsLevel(MetricsLevel.OFF);
        assertFalse(stats.isMetricsEnabled());
        stats.onRejectedInvalidArgument();
        clock.time++;
        stats.setMetricsLevel(MetricsLevel.CORE);
        assertTrue(stats.settleTerminal(batch, 0));
        limiter.releasePayload(10);
        ProducerStatsSnapshot snapshot = stats.snapshot(StatsOptions.operational());
        assertEquals(1, snapshot.getOperational().get().getAcceptedLogsTotal());
        assertEquals(0, snapshot.getOperational().get().getTerminalSuccessLogsTotal());
        assertEquals(0, snapshot.getManagedMemory().get().getPayloadOwnedBytes());
        assertEquals(0, snapshot.getOperational().get().getRejectedInvalidArgumentTotal());
        assertEquals(0, limiter.getUsedBytes());
    }

    @Test public void detailOnlyChangesKeepAcceptedCohortAndCumulativeCounters() throws Exception {
        Clock clock = new Clock();
        MemoryLimiter limiter = new MemoryLimiter(1000, 800, true);
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.CORE, 2, limiter, "producer", clock);
        stats.markStarted();
        long generation = stats.acquirePayloadAndAcceptGeneration(limiter, 10, 0, 1);
        BatchLog batch = batch(generation, stats);
        stats.setMetricsLevel(MetricsLevel.DETAILED);
        assertTrue(stats.settleTerminal(batch, 0));
        assertEquals(generation, stats.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration());
        assertEquals(1, stats.snapshot(StatsOptions.operational()).getOperational().get().getTerminalSuccessLogsTotal());
    }

    @Test public void attemptsHaveTheirOwnGenerationIndependentOfOldBatch() {
        Clock clock = new Clock();
        MemoryLimiter limiter = new MemoryLimiter(1000, 800, false);
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.OFF, 2, limiter, "producer", clock);
        stats.markStarted();
        BatchLog batch = batch(0, stats);
        long offCall = stats.onSendCallStart(batch);
        stats.setMetricsLevel(MetricsLevel.CORE);
        stats.onSendCallEnd(offCall, 0, true, 1, 1, -1);
        assertEquals(0, stats.snapshot(StatsOptions.operational()).getOperational().get().getSendCallsSuccessTotal());
        long enabledCall = stats.onSendCallStart(batch);
        stats.onSendCallEnd(enabledCall, 0, true, 1, 1, -1);
        assertEquals(1, stats.snapshot(StatsOptions.operational()).getOperational().get().getSendCallsSuccessTotal());
        assertEquals(0, stats.snapshot(StatsOptions.operational()).getOperational().get().getAcceptedLogsTotal());
    }

    @Test public void batchKeySeparatesOffOnCohorts() {
        BatchLog.BatchKey a = new BatchLog.BatchKey("h", "t", "s", "f", 1);
        BatchLog.BatchKey b = new BatchLog.BatchKey("h", "t", "s", "f", 3);
        assertNotEquals(a, b);
        assertEquals(a, new BatchLog.BatchKey("h", "t", "s", "f", 1));
    }

    @Test public void deliveryStartsAtFirstAttemptBeforeTransportPreparation() throws Exception {
        Clock clock = new Clock();
        MemoryLimiter limiter = new MemoryLimiter(1000, 800, true);
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.DETAILED, 1,
                limiter, "producer", clock);
        stats.markStarted();
        assertTrue(stats.acquirePayloadAndAccept(limiter, 1, 0, 1));
        BatchLog batch = batch(1, stats);
        stats.onBatchSubmittedFromIngress(batch);
        clock.time = 1002;
        stats.onSendStart(batch);
        clock.time = 1009; // temporary-memory acquisition and request preparation precede HTTP
        long token = stats.onSendCallStart(batch);
        clock.time = 1010;
        stats.onSendCallEnd(token, stats.beginDetail(), true, 1, 1, 1_000_000);
        assertTrue(stats.settleTerminal(batch, 0));
        assertEquals(8D, stats.snapshot(StatsOptions.debug()).getLatencyHistograms().get().getBatchDeliveryDuration().getSumMs(), 0D);
        limiter.releasePayload(1);
    }

    @Test public void queueDelayOnlyCountsTheFirstAttemptNotRetryQueueing() {
        Clock clock = new Clock();
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.DETAILED, 1,
                new MemoryLimiter(1000, 800, true), "producer", clock);
        stats.markStarted();
        BatchLog batch = batch(1, stats);
        stats.onBatchSubmittedFromIngress(batch);
        clock.time = 1002;
        stats.onSendStart(batch);
        long token = stats.onSendCallStart(batch);
        stats.onSendCallEnd(token, stats.beginDetail(), false, 1, 1, 0);
        stats.onRetryScheduled();
        clock.time = 1010;
        stats.onBatchResubmittedFromRetry(batch);
        clock.time = 1015;
        stats.onSendStart(batch);
        assertEquals(1, stats.snapshot(StatsOptions.debug()).getLatencyHistograms().get().getBatchQueueDelay().getCount());
    }

    @Test public void lifecycleRejectsRuntimeChangesOutsideRunning() {
        ProducerStatsState stats = new ProducerStatsState(MetricsLevel.OFF, 2,
                new MemoryLimiter(1000, 800, false), "producer", new Clock());
        try { stats.setMetricsLevel(MetricsLevel.CORE); fail(); }
        catch (IllegalStateException expected) { }
        stats.markStarted();
        stats.setMetricsLevel(MetricsLevel.CORE);
        stats.markClosing();
        try { stats.setMetricsLevel(MetricsLevel.OFF); fail(); }
        catch (IllegalStateException expected) { }
    }

    @Test public void finalConsistencyWaitsForActualWorkerDrainEvenWhileOff() {
        for (MetricsLevel level : new MetricsLevel[]{MetricsLevel.OFF, MetricsLevel.CORE}) {
            ProducerStatsState stats = new ProducerStatsState(level, 2,
                    new MemoryLimiter(1000, 800, level != MetricsLevel.OFF), "producer", new Clock());
            stats.markStarted();
            stats.onCallbackWorkerStarted();
            stats.markClosing();
            stats.markClosedAndFreeze();
            assertEquals(com.volcengine.model.tls.stats.Consistency.WEAK,
                    stats.snapshot(StatsOptions.health()).getHeader().getConsistency());
            stats.onCallbackWorkerStopped();
            assertEquals(com.volcengine.model.tls.stats.Consistency.FINAL,
                    stats.snapshot(StatsOptions.health()).getHeader().getConsistency());
        }
    }

    private static BatchLog batch(long generation, ProducerStatsState stats) {
        BatchLog batch = new BatchLog(new BatchLog.BatchKey("h", "t", "s", "f", generation),
                new ProducerConfig("https://example.invalid", "region", "ak", "sk", ""));
        batch.setCurrentBatchCount(1);
        batch.setLogGroupList(PutLogRequest.LogGroupList.newBuilder().addLogGroups(
                PutLogRequest.LogGroup.newBuilder().addLogs(PutLogRequest.Log.newBuilder().setTime(1))).build());
        stats.onBatchCreated(batch);
        return batch;
    }
}
