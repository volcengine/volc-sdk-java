package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.RetryMode;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.ManagedMemoryBreakdown;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.ProducerHealthSignals;
import com.volcengine.model.tls.stats.ProducerOperationalStats;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.QueueSummary;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.StatsView;
import com.volcengine.model.tls.response.PutLogsResponse;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.SendBatchTask;
import com.volcengine.service.tls.TLSLogClient;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.model.tls.Const.X_TLS_REQUESTID;

import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.AGGREGATE;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.INGRESS;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.RETRY;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.SEND;

public class ProducerStatsIntegrationTest {

    @Test
    public void disabledProducesAValidOffSnapshot() {
        ProducerStatsState state = ProducerStatsState.disabled();
        for (StatsView view : StatsView.values()) {
            ProducerStatsSnapshot snapshot = state.snapshot(new StatsOptions(view));
            Assert.assertFalse(snapshot.getHeader().getInstanceId().isEmpty());
            Assert.assertEquals(MetricsLevel.OFF, snapshot.getHeader().getCollectedLevel());
            Assert.assertEquals(view, snapshot.getHeader().getRequestedView());
            Assert.assertTrue(snapshot.getHeader().isMetricsDisabled());
            Assert.assertFalse(snapshot.getHeader().isPartial());
            Assert.assertTrue(snapshot.getHeader().getCollectionGeneration() > 0);
            Assert.assertEquals(0L, snapshot.getHeader().getCollectionStartedAtUnixMs());
            Assert.assertFalse(snapshot.getHealth().isPresent());
            Assert.assertFalse(snapshot.getOperational().isPresent());
            Assert.assertFalse(snapshot.getLatencyHistograms().isPresent());
        }
    }

    @Test
    public void acceptedTerminalAndManagedMemoryUseConservingCaptures() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(256, 192, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state);

        acceptGroup(state, limiter, batch, 30);
        acceptGroup(state, limiter, batch, 40);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        assertConserving(state.snapshot(StatsOptions.debug()));

        Assert.assertTrue(batch.transitionPayload(limiter, SEND, RETRY));
        state.onRetryScheduled();
        assertConserving(state.snapshot(StatsOptions.debug()));

        Assert.assertTrue(batch.transitionPayload(limiter, RETRY, SEND));
        state.onBatchResubmittedFromRetry(batch);
        Assert.assertTrue(state.settleTerminalAndRelease(batch, 1, limiter));

        ProducerStatsSnapshot terminal = state.snapshot(StatsOptions.debug());
        assertConserving(terminal);
        ProducerOperationalStats health = terminal.getOperational().get();
        Assert.assertEquals(2, health.getAcceptedLogsTotal());
        Assert.assertEquals(2, health.getTerminalFailureLogsTotal());
        Assert.assertEquals(2, health.getTerminalFailureGroupsTotal());
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    @Test
    public void callbackThrowableDoesNotSkipLaterCallbacksAndEveryInvocationIsCounted() throws Exception {
        final AtomicInteger invoked = new AtomicInteger();
        ProducerStatsState state = state(MetricsLevel.DETAILED);
        BatchLog batch = batch(state);
        PutLogRequest.LogGroup group = group();
        Assert.assertTrue(batch.tryAdd(group, 10, new CallBack() {
            @Override
            public void onComplete(Result result) {
                invoked.incrementAndGet();
                throw new AssertionError("user callback failure");
            }
        }, 1, 1, 1));
        Assert.assertTrue(batch.tryAdd(group, 10, new CallBack() {
            @Override
            public void onComplete(Result result) {
                invoked.incrementAndGet();
            }
        }, 1, 1, 1));
        batch.addAttempt(new Attempt(true, "request", null, null, 200));

        batch.fireCallbacks(state);

        ProducerOperationalStats operational = state.snapshot(StatsOptions.operational())
                .getOperational().get();
        Assert.assertEquals(2, invoked.get());
        Assert.assertEquals(Integer.valueOf(0), operational.getCallbacksInFlight());
        Assert.assertEquals(2, state.snapshot(StatsOptions.debug()).getLatencyHistograms().get()
                .getCallbackDuration().getCount());
        Assert.assertNotNull(state.snapshot(StatsOptions.health()).getHealth().get().getLastErrorAgeMs());
    }

    @Test
    public void finalCanonicalCaptureIsStableButEachViewReturnsAFreshProjection() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state);
        acceptGroup(state, limiter, batch, 32);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        state.onSendStart(batch);
        state.onMoverWorkerStarted();
        state.onSenderWorkerStarted();
        state.onCallbackWorkerStarted();
        state.onTerminalEnqueued();

        state.markClosing();
        state.markClosedAndFreeze();
        Assert.assertEquals("live workers prevent a final snapshot", Consistency.WEAK,
                state.snapshot(StatsOptions.health()).getHeader().getConsistency());
        state.onMoverWorkerStopped();
        state.onSenderWorkerStopped();
        state.onCallbackWorkerStopped();
        ProducerStatsSnapshot health = state.snapshot(StatsOptions.health());
        ProducerStatsSnapshot firstDebug = state.snapshot(StatsOptions.debug());
        ProducerStatsSnapshot secondDebug = state.snapshot(StatsOptions.debug());

        Assert.assertNotSame(firstDebug, secondDebug);
        Assert.assertEquals(Consistency.FINAL, health.getHeader().getConsistency());
        Assert.assertEquals(health.getHeader().getSnapshotSequence(),
                firstDebug.getHeader().getSnapshotSequence());
        Assert.assertEquals(firstDebug.toJson(), secondDebug.toJson());
        Assert.assertEquals(1, firstDebug.getOperational().get().getTerminalDroppedLogsTotal());
        Assert.assertEquals(1, firstDebug.getOperational().get().getTerminalDroppedGroupsTotal());
        Assert.assertEquals(0, firstDebug.getManagedMemory().get().getUsedBytes());
        Assert.assertTrue(firstDebug.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
        Assert.assertFalse("late terminal must lose the finalization gate",
                state.settleTerminalAndRelease(batch, 0, limiter));
        BlockingQueue<BatchLog> lateSuccess = new LinkedBlockingQueue<>();
        BlockingQueue<BatchLog> lateFailure = new LinkedBlockingQueue<>();
        ProducerConfig lateConfig = config();
        new SendBatchTask(batch, lateConfig, lateSuccess, lateFailure,
                new RecordingClient(null).proxy(), new RetryManager(), limiter,
                new CircuitBreaker(lateConfig.getCircuitBreakerConfig())).run();
        Assert.assertTrue("late terminal must not publish a callback", lateSuccess.isEmpty());
        Assert.assertTrue("late terminal must not publish a callback", lateFailure.isEmpty());
        state.onRetryScheduled();
        Assert.assertEquals("final debug projection must not read live ledgers",
                firstDebug.toJson(), state.snapshot(StatsOptions.debug()).toJson());
    }

    @Test
    public void cleanFinalizationDoesNotReportIncomplete() {
        ProducerStatsState state = state(MetricsLevel.DETAILED);
        state.markClosing();
        state.markClosedAndFreeze();

        Assert.assertFalse(state.snapshot(StatsOptions.health()).getHealth().get()
                .getCriticalFlags().contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void retryScheduleExecuteAndExhaustPreserveAttemptsAndSettlement() throws Exception {
        ProducerConfig config = config();
        config.setTotalSizeInBytes(4096);
        config.setMaxProducerMemoryBytes(8192);
        config.setRetryCount(1);
        config.validConfig();
        MemoryLimiter limiter = new MemoryLimiter(8192, 4096, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state, config);
        acceptGroup(state, limiter, batch, 64);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        RetryManager retryManager = new RetryManager();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();
        RecordingClient client = new RecordingClient(
                new LogException(429, "TooManyRequests", "slow down", "request"));

        new SendBatchTask(batch, config, new LinkedBlockingQueue<BatchLog>(), failureQueue,
                client.proxy(), retryManager, limiter,
                new CircuitBreaker(config.getCircuitBreakerConfig())).run();
        retryManager.close();
        List<BatchLog> retries = retryManager.handleRemainingBatches();
        Assert.assertEquals(1, retries.size());
        Assert.assertTrue(batch.transitionPayload(limiter, RETRY, SEND));
        state.onBatchResubmittedFromRetry(batch);

        new SendBatchTask(batch, config, new LinkedBlockingQueue<BatchLog>(), failureQueue,
                client.proxy(), retryManager, limiter,
                new CircuitBreaker(config.getCircuitBreakerConfig())).run();

        ProducerStatsSnapshot snapshot = state.snapshot(StatsOptions.debug());
        assertConserving(snapshot);
        Assert.assertEquals(2, client.calls.get());
        Assert.assertEquals(1, failureQueue.size());
        Assert.assertEquals(1, snapshot.getRetryDetails().get().getRetriesScheduledTotal());
        Assert.assertEquals(0, snapshot.getOperational().get().getRetryQueue().getCurrentItems());
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalFailureGroupsTotal());
        Assert.assertEquals(2, snapshot.getOperational().get().getSendCallsFailureTotal());
        Assert.assertEquals(2, snapshot.getOperational().get().getSendCallPayloadLogsTotal());
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    @Test
    public void retryPublicationFailureRollsStageBackBeforeTerminalSettlement() throws Exception {
        ProducerConfig config = config();
        config.setRetryCount(1);
        config.validConfig();
        MemoryLimiter limiter = new MemoryLimiter(8192, 4096, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state, config);
        acceptGroup(state, limiter, batch, 64);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        BlockingQueue<BatchLog> failures = new LinkedBlockingQueue<>();
        FailingRetryManager retryManager = new FailingRetryManager();

        new SendBatchTask(batch, config, new LinkedBlockingQueue<BatchLog>(), failures,
                new RecordingClient(new LogException(429, "TooManyRequests", "slow", "request")).proxy(),
                retryManager, limiter, new CircuitBreaker(config.getCircuitBreakerConfig())).run();

        ProducerStatsSnapshot snapshot = state.snapshot(StatsOptions.debug());
        assertConserving(snapshot);
        Assert.assertEquals(1, failures.size());
        Assert.assertEquals(0, snapshot.getOperational().get().getRetriesScheduledTotal());
        Assert.assertEquals(0, snapshot.getRetryDetails().get().getRetriesScheduledTotal());
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalFailureGroupsTotal());
        Assert.assertNull(batch.getPayloadStage());
        Assert.assertEquals(0, limiter.getUsedBytes());
        Assert.assertEquals(0, retryManager.getHeadEnqueueNanos());
    }

    @Test
    public void retryQueueVisibilityCannotRaceAheadOfStageAndStatsCapture() throws Exception {
        ProducerConfig config = config();
        config.setRetryCount(1);
        config.validConfig();
        final MemoryLimiter limiter = new MemoryLimiter(8192, 4096, true);
        final ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state, config);
        acceptGroup(state, limiter, batch, 64);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        final BlockingRetryManager retryManager = new BlockingRetryManager();
        final AtomicReference<ProducerStatsSnapshot> captured = new AtomicReference<>();

        Thread sender = new Thread(new SendBatchTask(batch, config,
                new LinkedBlockingQueue<BatchLog>(), new LinkedBlockingQueue<BatchLog>(),
                new RecordingClient(new LogException(429, "TooManyRequests", "slow", "request")).proxy(),
                retryManager, limiter, new CircuitBreaker(config.getCircuitBreakerConfig())));
        sender.start();
        Assert.assertTrue(retryManager.published.await(2, TimeUnit.SECONDS));
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                captured.set(state.snapshot(StatsOptions.debug()));
            }
        });
        reader.start();
        reader.join(100);
        Assert.assertTrue("capture must wait for retry publication ledger commit", reader.isAlive());

        retryManager.release.countDown();
        sender.join(2000);
        reader.join(2000);
        Assert.assertFalse(sender.isAlive());
        Assert.assertFalse(reader.isAlive());
        ProducerStatsSnapshot snapshot = captured.get();
        assertConserving(snapshot);
        Assert.assertEquals(1, snapshot.getOperational().get().getRetriesScheduledTotal());
        QueueSummary retry = snapshot.getOperational().get().getRetryQueue();
        Assert.assertEquals(1, retry.getCurrentItems());
        Assert.assertNotNull(snapshot.getHealth().get().getOldestPendingAgeMs());
        Assert.assertEquals(snapshot.getMemoryBreakdown().get().getRetryOwnedBytes(),
                limiter.getPayloadUsedBytes());
    }

    @Test
    public void retryOldestEpochDoesNotDependOnDelayQueueDeadlineOrder() throws Exception {
        RetryManager retryManager = new RetryManager();
        BatchLog older = new BatchLog(new BatchLog.BatchKey(null, "topic", "old", "file"), config());
        older.setRetryQueueEnterNanos(100L);
        older.setNextRetryMs(System.currentTimeMillis() + 60_000L);
        BatchLog newerButDueFirst = new BatchLog(
                new BatchLog.BatchKey(null, "topic", "new", "file"), config());
        newerButDueFirst.setRetryQueueEnterNanos(200L);
        newerButDueFirst.setNextRetryMs(System.currentTimeMillis() - 1L);

        retryManager.put(older);
        retryManager.put(newerButDueFirst);

        Assert.assertEquals(100L, retryManager.getHeadEnqueueNanos());
        Assert.assertEquals(1, retryManager.handleTimeoutBatch(0).size());
        Assert.assertEquals(100L, retryManager.getHeadEnqueueNanos());
        retryManager.close();
        Assert.assertEquals(1, retryManager.handleRemainingBatches().size());
        Assert.assertEquals(0L, retryManager.getHeadEnqueueNanos());
    }

    @Test
    public void terminalAndCallbackBoundariesDriveAges() throws Exception {
        FakeClock clock = new FakeClock();
        MemoryLimiter limiter = new MemoryLimiter(1024, 768, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 2, limiter,
                "producer-age", clock);
        BatchLog batch = batch(state);
        acceptGroup(state, limiter, batch, 32);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        state.onSendStart(batch);
        clock.advanceMillis(10);
        state.onSendCallEnd(state.onSendCallStart(batch), state.beginDetail(), true, 1, 1, 1_000_000L);
        Assert.assertNull("HTTP success is not terminal delivery success",
                state.snapshot(StatsOptions.health()).getHealth().get().getLastSuccessAgeMs());
        state.onSendCallEnd(state.onSendCallStart(batch), state.beginDetail(), false, 1, 1, 1_000_000L);
        Assert.assertNull("a retryable HTTP failure is not a terminal delivery error",
                state.snapshot(StatsOptions.health()).getHealth().get().getLastErrorAgeMs());

        Assert.assertTrue(batch.transitionPayload(limiter, SEND, RETRY));
        state.onRetryScheduled(clock.nanoTime());
        Assert.assertEquals(Long.valueOf(0), state.snapshot(StatsOptions.health()).getHealth().get()
                .getOldestPendingAgeMs());
        clock.advanceMillis(5);
        Assert.assertTrue(batch.transitionPayload(limiter, RETRY, SEND));
        state.onBatchResubmittedFromRetry(batch, 0L);
        state.onSendStart(batch);
        Assert.assertTrue(state.settleTerminalAndRelease(batch, 0, limiter));
        state.onTerminalEnqueued();

        ProducerHealthSignals callbackPending = state.snapshot(StatsOptions.health()).getHealth().get();
        Assert.assertEquals(Long.valueOf(1), state.snapshot(StatsOptions.operational())
                .getOperational().get().getCallbacksPending());
        Assert.assertEquals(Long.valueOf(0), callbackPending.getLastSuccessAgeMs());
        state.onTerminalDequeued();
        Assert.assertEquals(Long.valueOf(0), state.snapshot(StatsOptions.operational())
                .getOperational().get().getCallbacksPending());
        clock.advanceMillis(3);
        state.endCallback(state.beginCallback(), state.beginDetail(), false, 1_000_000L);
        Assert.assertEquals(Long.valueOf(0), state.snapshot(StatsOptions.health()).getHealth().get()
                .getLastErrorAgeMs());
    }

    @Test
    public void rollbackReleasesMemoryBeforeANewAcceptance() throws Exception {
        FakeClock clock = new FakeClock();
        MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 1, limiter,
                "producer-rollback-age", clock);

        Assert.assertTrue(state.acquirePayloadAndAccept(limiter, 16, 0, 1));
        clock.advanceMillis(23);
        state.rollbackAcceptedAndRelease(limiter, 16, 1);
        Assert.assertEquals(0, limiter.getUsedBytes());
        Assert.assertEquals(1, state.snapshot(StatsOptions.operational()).getOperational().get()
                .getTerminalDroppedLogsTotal());

        clock.advanceMillis(11);
        Assert.assertTrue(state.acquirePayloadAndAccept(limiter, 16, 0, 1));
        Assert.assertEquals(16, limiter.getUsedBytes());
        clock.advanceMillis(7);
        Assert.assertEquals(2, state.snapshot(StatsOptions.operational()).getOperational().get()
                .getAcceptedLogsTotal());
        state.rollbackAcceptedAndRelease(limiter, 16, 1);
    }

    @Test
    public void retryOldestAgeParticipatesInQueuePressureFacts() throws Exception {
        FakeClock clock = new FakeClock();
        MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 1, limiter,
                "producer-retry-pressure", clock);
        BatchLog batch = batch(state);
        acceptGroup(state, limiter, batch, 16);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        state.onSendStart(batch);
        clock.advanceMillis(5);
        Assert.assertTrue(batch.transitionPayload(limiter, SEND, RETRY));
        state.onRetryScheduled(clock.nanoTime());
        clock.advanceMillis(13);

        ProducerHealthSignals health = state.snapshot(StatsOptions.health()).getHealth().get();
        Assert.assertEquals(Long.valueOf(13), health.getOldestPendingAgeMs());
        Assert.assertEquals(1, state.snapshot(StatsOptions.operational()).getOperational().get()
                .getRetryQueue().getCurrentItems());

        Assert.assertTrue(batch.transitionPayload(limiter, RETRY, SEND));
        state.onBatchResubmittedFromRetry(batch, 0L);
        Assert.assertTrue(state.settleTerminalAndRelease(batch, 0, limiter));
    }

    @Test
    public void snapshotDoesNotRereadRetryQueueAfterCaptureGate() throws Exception {
        final HookClock clock = new HookClock();
        MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        final ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 1, limiter,
                "producer-retry-capture", clock);
        final BatchLog batch = batch(state);
        state.onRetryScheduled(clock.nanoTime());
        clock.arm(new Runnable() {
            @Override
            public void run() {
                state.onBatchResubmittedFromRetry(batch, 0L);
            }
        });

        ProducerStatsSnapshot snapshot = state.snapshot(StatsOptions.debug());

        Assert.assertEquals("queue projection must use the values captured under the accountant gate",
                1, snapshot.getOperational().get().getRetryQueue().getCurrentItems());
        Assert.assertNotNull(snapshot.getHealth().get().getOldestPendingAgeMs());
        Assert.assertEquals(Long.valueOf(1), snapshot.getOperational().get().getAggregateBatches());
    }

    @Test
    public void callbackQueuePublicationAndLedgerRemovalShareOneGate() throws Exception {
        final MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        final ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        final BatchLog batch = batch(state);
        acceptGroup(state, limiter, batch, 16);
        Assert.assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        state.onBatchSubmittedFromIngress(batch);
        state.onSendStart(batch);
        Assert.assertTrue(state.settleTerminalAndRelease(batch, 0, limiter));
        final BlockingPublicationQueue queue = new BlockingPublicationQueue();

        Thread publisher = new Thread(new Runnable() {
            @Override
            public void run() {
                state.publishTerminal(queue, batch);
            }
        });
        publisher.start();
        Assert.assertTrue(queue.published.await(2, TimeUnit.SECONDS));
        Thread remover = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    queue.take();
                    queue.taken.countDown();
                    state.onTerminalDequeued();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        remover.start();
        Assert.assertTrue(queue.taken.await(2, TimeUnit.SECONDS));
        remover.join(100);
        Assert.assertTrue("ledger removal must wait for publication commit", remover.isAlive());

        queue.releasePublisher.countDown();
        publisher.join(2000);
        remover.join(2000);
        Assert.assertFalse(publisher.isAlive());
        Assert.assertFalse(remover.isAlive());
        Assert.assertEquals(Long.valueOf(0), state.snapshot(StatsOptions.operational())
                .getOperational().get().getCallbacksPending());
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    @Test
    public void legacyRetryModeIsRejectedAndNullDefaultsToProducerManaged() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        com.volcengine.model.tls.RetryPolicy policy = com.volcengine.model.tls.RetryPolicy.defaultPolicy();
        policy.setMaxAttempts(4);
        config.getClientConfig().setRetryPolicy(policy);

        try {
            config.setRetryMode(RetryMode.LEGACY_DOUBLE_RETRY);
            Assert.fail("legacy double retry must be rejected explicitly");
        } catch (IllegalArgumentException expected) {
            Assert.assertTrue(expected.getMessage().contains("PRODUCER_MANAGED"));
        }

        config.setRetryMode(null);
        Assert.assertEquals(RetryMode.PRODUCER_MANAGED, config.getRetryMode());
        config.validConfig();

        Assert.assertEquals(RetryMode.PRODUCER_MANAGED, config.getRetryMode());
        Assert.assertEquals(1, config.getClientConfig().getRetryPolicy().getMaxAttempts());
    }

    @Test
    public void validConfigRejectsNonManagedRetryModeInsteadOfOverwriting() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        Field retryMode = ProducerConfig.class.getDeclaredField("retryMode");
        retryMode.setAccessible(true);
        retryMode.set(config, RetryMode.LEGACY_DOUBLE_RETRY);

        try {
            config.validConfig();
            Assert.fail("validConfig must reject a non-managed retry mode");
        } catch (LogException expected) {
            Assert.assertTrue(expected.getErrorMessage().contains("PRODUCER_MANAGED"));
            Assert.assertEquals(RetryMode.LEGACY_DOUBLE_RETRY, config.getRetryMode());
        }
    }

    @Test
    public void rejectedExecutorSubmissionSettlesOnceAndReleasesPayload() throws Exception {
        ProducerConfig config = config();
        MemoryLimiter limiter = new MemoryLimiter(256, 192, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        BatchLog batch = batch(state, config);
        acceptGroup(state, limiter, batch, 32);
        BatchLog.BatchManager manager = new BatchLog.BatchManager();
        manager.setBatchLog(batch);
        ExecutorService rejected = Executors.newSingleThreadExecutor();
        rejected.shutdown();
        BlockingQueue<BatchLog> failures = new LinkedBlockingQueue<>();

        manager.addNow(config, rejected, new RecordingClient(null).proxy(),
                new LinkedBlockingQueue<BatchLog>(), failures, new AtomicInteger(),
                new RetryManager(), limiter, new CircuitBreaker(config.getCircuitBreakerConfig()));

        ProducerStatsSnapshot snapshot = state.snapshot(StatsOptions.debug());
        assertConserving(snapshot);
        Assert.assertEquals(1, failures.size());
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalFailureLogsTotal());
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalFailureGroupsTotal());
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    @Test
    public void concurrentReaderNeverObservesCounterOrMemoryInvariantBreak() throws Exception {
        final MemoryLimiter limiter = new MemoryLimiter(4096, 3072, true);
        final ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        final AtomicReference<Throwable> failure = new AtomicReference<>();
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 500; i++) {
                        BatchLog batch = batch(state);
                        acceptGroup(state, limiter, batch, 4);
                        batch.transitionPayload(limiter, AGGREGATE, SEND);
                        state.onBatchSubmittedFromIngress(batch);
                        state.onSendStart(batch);
                        state.settleTerminalAndRelease(batch, 0, limiter);
                    }
                } catch (Throwable t) {
                    failure.compareAndSet(null, t);
                }
            }
        });
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (writer.isAlive()) {
                        assertConserving(state.snapshot(StatsOptions.debug()));
                    }
                } catch (Throwable t) {
                    failure.compareAndSet(null, t);
                }
            }
        });

        writer.start();
        reader.start();
        writer.join(5000);
        reader.join(5000);

        Assert.assertFalse(writer.isAlive());
        Assert.assertFalse(reader.isAlive());
        if (failure.get() != null) throw new AssertionError("concurrent invariant", failure.get());
        assertConserving(state.snapshot(StatsOptions.debug()));
    }

    @Test
    public void postAcceptRollbackSettlesDropAndReleasesMemoryWithoutClosing() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(128, 96, true);
        ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        Assert.assertTrue(state.acquirePayloadAndAccept(limiter, 16, 0, 1));

        state.rollbackAcceptedAndRelease(limiter, 16, 1);

        ProducerStatsSnapshot snapshot = state.snapshot(StatsOptions.debug());
        assertConserving(snapshot);
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalDroppedLogsTotal());
        Assert.assertEquals(1, snapshot.getOperational().get().getTerminalDroppedGroupsTotal());
        Assert.assertEquals(0, limiter.getUsedBytes());
        Assert.assertEquals(Consistency.WEAK, snapshot.getHeader().getConsistency());
    }

    @Test
    public void blockingAcquireDoesNotDeadlockTerminalReleaseOnTheAccountingGate() throws Exception {
        final MemoryLimiter limiter = new MemoryLimiter(10, 10, true);
        final ProducerStatsState state = state(MetricsLevel.DETAILED, limiter);
        final BatchLog first = batch(state);
        acceptGroup(state, limiter, first, 10);
        final AtomicBoolean acquired = new AtomicBoolean();
        Thread waiter = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    acquired.set(state.acquirePayloadAndAccept(limiter, 1, -1, 1));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        waiter.start();
        waitForBlocked(waiter);

        Assert.assertTrue(state.settleTerminalAndRelease(first, 0, limiter));
        waiter.join(2000);

        Assert.assertFalse("waiting acquire must be released by terminal settlement", waiter.isAlive());
        Assert.assertTrue(acquired.get());
        state.rollbackAcceptedAndRelease(limiter, 1, 1);
        assertConserving(state.snapshot(StatsOptions.debug()));
    }

    private static ProducerStatsState state(MetricsLevel level) {
        MemoryLimiter limiter = level == MetricsLevel.OFF ? null : new MemoryLimiter(256, 192, true);
        return state(level, limiter);
    }

    private static ProducerStatsState state(MetricsLevel level, MemoryLimiter limiter) {
        return new ProducerStatsState(level, 2, limiter, "producer-test", StatsClock.SYSTEM);
    }

    private static BatchLog batch(ProducerStatsState state) throws Exception {
        return batch(state, config());
    }

    private static BatchLog batch(ProducerStatsState state, ProducerConfig config) {
        long generation = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        BatchLog batch = new BatchLog(new BatchLog.BatchKey(null, "topic", "source", "file",
                generation), config);
        state.onBatchCreated(batch);
        return batch;
    }

    private static void acceptGroup(ProducerStatsState state, MemoryLimiter limiter, BatchLog batch,
                                    int bytes) throws Exception {
        Assert.assertTrue(state.acquirePayloadAndAccept(limiter, bytes, 0, 1));
        Assert.assertTrue(batch.tryAdd(group(), bytes, null, 1, 1, 1));
        batch.addAggregatedPayload(limiter, bytes);
        state.onGroupAggregated(batch);
    }

    private static PutLogRequest.LogGroup group() {
        return PutLogRequest.LogGroup.newBuilder().addLogs(PutLogRequest.Log.newBuilder()
                .setTime(1).addContents(PutLogRequest.LogContent.newBuilder()
                        .setKey("k").setValue("v").build()).build()).build();
    }

    private static ProducerConfig config() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        config.setMaxBlockMs(0);
        config.validConfig();
        return config;
    }

    private static void assertConserving(ProducerStatsSnapshot snapshot) {
        ProducerOperationalStats operational = snapshot.getOperational().get();
        long outstandingLogs = operational.getAcceptedLogsTotal() - operational.getTerminalSuccessLogsTotal()
                - operational.getTerminalFailureLogsTotal() - operational.getTerminalDroppedLogsTotal();
        long outstandingGroups = operational.getAcceptedGroupsTotal() - operational.getTerminalSuccessGroupsTotal()
                - operational.getTerminalFailureGroupsTotal() - operational.getTerminalDroppedGroupsTotal();
        Assert.assertTrue("terminal logs cannot exceed accepted logs", outstandingLogs >= 0);
        Assert.assertTrue("terminal groups cannot exceed accepted groups", outstandingGroups >= 0);
        Assert.assertEquals("these test batches contain one log per group", outstandingLogs, outstandingGroups);
        ManagedMemoryBreakdown memory = snapshot.getMemoryBreakdown().get();
        Assert.assertEquals(memory.getPayloadOwnedBytes(), memory.getIngressOwnedBytes()
                + memory.getAggregateOwnedBytes() + memory.getSendOwnedBytes()
                + memory.getRetryOwnedBytes());
        Assert.assertEquals(snapshot.getManagedMemory().get().getUsedBytes(),
                memory.getPayloadOwnedBytes() + memory.getBoundedRuntimeBufferBytes());
        Assert.assertEquals("log ownership and payload ownership must close in the same capture",
                outstandingLogs == 0, memory.getPayloadOwnedBytes() == 0);
    }

    private static void waitForBlocked(Thread thread) throws InterruptedException {
        long deadline = System.nanoTime() + 1_000_000_000L;
        while (System.nanoTime() < deadline) {
            if (thread.getState() == Thread.State.WAITING
                    || thread.getState() == Thread.State.TIMED_WAITING) return;
            Thread.yield();
        }
        Assert.fail("acquire thread did not block");
    }

    private static final class RecordingClient {
        final AtomicInteger calls = new AtomicInteger();
        final Throwable failure;

        RecordingClient(Throwable failure) {
            this.failure = failure;
        }

        TLSLogClient proxy() {
            return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                    new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                        if ("putLogs".equals(method.getName())) {
                            calls.incrementAndGet();
                            if (failure != null) throw failure;
                            return new PutLogsResponse(new BasicHeader[]{
                                    new BasicHeader(X_TLS_REQUESTID, "request")});
                        }
                        if ("toString".equals(method.getName())) return "RecordingClient";
                        return null;
                    });
        }
    }

    private static final class FailingRetryManager extends RetryManager {
        @Override
        public void put(BatchLog batchLog) throws LogException {
            throw new LogException("Producer Error", "injected retry publication rejection", null);
        }
    }

    private static final class BlockingRetryManager extends RetryManager {
        final CountDownLatch published = new CountDownLatch(1);
        final CountDownLatch release = new CountDownLatch(1);

        @Override
        public void put(BatchLog batchLog) throws LogException {
            super.put(batchLog);
            published.countDown();
            try {
                if (!release.await(2, TimeUnit.SECONDS)) {
                    throw new LogException("Producer Error", "timed out waiting to publish retry", null);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new LogException("Producer Error", "retry publication interrupted", null);
            }
        }
    }

    private static final class BlockingPublicationQueue extends LinkedBlockingQueue<BatchLog> {
        final CountDownLatch published = new CountDownLatch(1);
        final CountDownLatch taken = new CountDownLatch(1);
        final CountDownLatch releasePublisher = new CountDownLatch(1);

        @Override
        public boolean add(BatchLog batch) {
            boolean added = super.add(batch);
            published.countDown();
            try {
                if (!releasePublisher.await(2, TimeUnit.SECONDS)) {
                    throw new AssertionError("timed out waiting to finish callback publication");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new AssertionError("callback publication interrupted", e);
            }
            return added;
        }
    }

    private static final class FakeClock implements StatsClock {
        private long nanos = 1_000_000L;
        private long wallMs = 1L;

        @Override
        public synchronized long nanoTime() { return nanos; }

        @Override
        public synchronized long currentTimeMillis() { return wallMs; }

        synchronized void advanceMillis(long millis) {
            nanos += millis * 1_000_000L;
            wallMs += millis;
        }
    }

    private static final class HookClock implements StatsClock {
        private long nanos = 1_000_000L;
        private Runnable hook;

        @Override
        public synchronized long nanoTime() {
            Runnable current = hook;
            hook = null;
            if (current != null) current.run();
            return nanos;
        }

        @Override
        public long currentTimeMillis() {
            return 1L;
        }

        synchronized void arm(Runnable next) {
            hook = next;
        }
    }
}
