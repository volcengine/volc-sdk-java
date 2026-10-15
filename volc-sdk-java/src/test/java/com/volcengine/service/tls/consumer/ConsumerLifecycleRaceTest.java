package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.consumer.ConsumerStatus;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.response.ConsumerHeartbeatResponse;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeConsumerGroupsResponse;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ConsumerLifecycleRaceTest {
    @Test
    public void checkpointStopLinearizesBehindExecutorPublication() throws Exception {
        ConsumerImpl consumer = newConsumer();
        CountDownLatch factoryEntered = new CountDownLatch(1);
        CountDownLatch allowFactory = new CountDownLatch(1);
        AtomicReference<ScheduledExecutorService> created = new AtomicReference<>();
        CheckpointTracker tracker = new CheckpointTracker(consumer,
                new ConsumeShard("topic", 0), threadFactory -> {
                    factoryEntered.countDown();
                    awaitIgnoringInterrupt(allowFactory);
                    ScheduledExecutorService service =
                            Executors.newSingleThreadScheduledExecutor(threadFactory);
                    created.set(service);
                    return service;
                });

        AtomicReference<Throwable> startFailure = new AtomicReference<>();
        Thread starter = new Thread(() -> {
            try {
                tracker.start();
            } catch (Throwable failure) {
                startFailure.set(failure);
            }
        });
        starter.start();
        assertTrue("executor factory was not entered", factoryEntered.await(3, TimeUnit.SECONDS));

        AtomicReference<Boolean> stopResult = new AtomicReference<>();
        AtomicReference<Throwable> stopFailure = new AtomicReference<>();
        Thread stopper = new Thread(() -> {
            try {
                stopResult.set(tracker.stop());
            } catch (Throwable failure) {
                stopFailure.set(failure);
            }
        });
        stopper.start();
        assertTrue("stop must wait for the in-progress start linearization",
                awaitThreadState(stopper, Thread.State.BLOCKED, 3, TimeUnit.SECONDS));

        allowFactory.countDown();
        starter.join(3000L);
        stopper.join(3000L);

        assertFalse("start did not finish", starter.isAlive());
        assertFalse("stop did not finish", stopper.isAlive());
        assertEquals(null, startFailure.get());
        assertEquals(null, stopFailure.get());
        assertEquals(Boolean.TRUE, stopResult.get());
        assertNotNull(created.get());
        assertTrue("published checkpoint executor must be terminated", created.get().isTerminated());
    }

    @Test
    public void rebalanceStopFailureIsRetainedAndFinalizesConsumerAsFailed() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.statsState.markStarted();
        FailOnceStopLogConsumer worker = new FailOnceStopLogConsumer(consumer);
        Map<String, LogConsumer> workers = new LinkedHashMap<>();
        workers.put("topic0", worker);
        setField(consumer, "workerMap", workers);
        setField(consumer, "heartbeatTracker", new FixedHeartbeatTracker(consumer));
        consumer.executor = Executors.newSingleThreadExecutor();

        Thread runThread = invokeRun(consumer);
        setField(consumer, "runThread", runThread);
        runThread.join(3000L);
        assertFalse("main loop must terminate on rebalance retirement failure", runThread.isAlive());
        assertEquals(1, worker.stopCalls.get());
        assertSame("failed worker must not be removed", worker, workers.get("topic0"));

        ConsumerStatsSnapshot awaitingCleanup = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.WEAK, awaitingCleanup.getHeader().getConsistency());
        assertEquals(LifecycleState.CLOSING, awaitingCleanup.getHeader().getLifecycleState());

        try {
            consumer.stop();
            fail("stop must surface the retained rebalance failure");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("rebalance"));
        }
        assertEquals("shutdown retries the failed worker", 2, worker.stopCalls.get());
        assertTrue(consumer.executor.isTerminated());
        assertTrue("completed teardown releases the failed worker", workers.isEmpty());
        ConsumerStatsSnapshot failed = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, failed.getHeader().getConsistency());
        assertEquals(LifecycleState.FAILED, failed.getHeader().getLifecycleState());
        assertEquals(0, failed.getOperational().get().getAssignedShards());
        assertFalse(failed.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void rebalanceFailureRequestsHeartbeatStopAndRetainsRootCause() throws Exception {
        ConsumerImpl consumer = newConsumer();
        Thread runThread = null;
        Throwable rootFailure = null;
        try {
            consumer.statsState.markStarted();
            CountingHeartbeatClient client = new CountingHeartbeatClient();
            injectClient(consumer, client);
            FailOnceStopLogConsumer worker = new FailOnceStopLogConsumer(consumer);
            Map<String, LogConsumer> workers = new LinkedHashMap<>();
            workers.put("topic0", worker);
            setField(consumer, "workerMap", workers);
            HeartbeatTracker heartbeat = new HeartbeatTracker(consumer);
            setField(heartbeat, "shards", Collections.emptyList());
            setField(consumer, "heartbeatTracker", heartbeat);
            // The replacement tracker has a final client field; inject after publication so both
            // the consumer and this tracker use the call-counting client.
            injectClient(consumer, client);
            consumer.executor = Executors.newSingleThreadExecutor();
            heartbeat.start();
            ScheduledExecutorService heartbeatExecutor = heartbeatExecutor(heartbeat);
            assertTrue("initial heartbeat did not complete",
                    client.firstCompleted.await(3, TimeUnit.SECONDS));

            int callsBeforeFailure = client.calls.get();
            runThread = invokeRun(consumer);
            setField(consumer, "runThread", runThread);
            runThread.join(3000L);
            assertFalse("main loop must terminate on rebalance retirement failure", runThread.isAlive());
            rootFailure = (Throwable) getField(consumer, "runFailure");
            assertNotNull("rebalance failure must be retained", rootFailure);
            assertTrue("heartbeat executor must be requested to stop with the run",
                    heartbeatExecutor.isShutdown());
            assertTrue("heartbeat executor did not finish its in-flight request",
                    heartbeatExecutor.awaitTermination(3, TimeUnit.SECONDS));
            assertTrue("initial heartbeat count must be recorded", callsBeforeFailure > 0);
            int callsAfterFailure = client.calls.get();
            heartbeat.uploadHeartbeat();
            assertEquals("failed consumer must not start a new heartbeat request",
                    callsAfterFailure, client.calls.get());

            try {
                consumer.stop();
                fail("stop must surface the retained rebalance failure");
            } catch (IllegalStateException expected) {
                assertSame(rootFailure, expected.getCause());
            }
        } finally {
            if (runThread != null) {
                runThread.join(3000L);
            }
            try {
                consumer.stop();
            } catch (IllegalStateException cleanupFailure) {
                Throwable retained = (Throwable) getField(consumer, "runFailure");
                if (retained == null || cleanupFailure.getCause() != retained) {
                    throw cleanupFailure;
                }
            }
        }
    }

    @Test
    public void normalStopDoesNotTurnAConcurrentBarrierFailureIntoRunFailure() throws Exception {
        ConsumerImpl consumer = newConsumer();
        Thread runThread = null;
        Thread stopper = null;
        BarrierFalseOnceStopLogConsumer worker = null;
        AtomicReference<Throwable> stopFailure = new AtomicReference<>();
        try {
            consumer.statsState.markStarted();
            consumer.executor = Executors.newSingleThreadExecutor();
            setField(consumer, "heartbeatTracker", new FixedHeartbeatTracker(consumer));
            worker = new BarrierFalseOnceStopLogConsumer(consumer);
            Map<String, LogConsumer> workers = new LinkedHashMap<>();
            workers.put("topic0", worker);
            setField(consumer, "workerMap", workers);

            runThread = invokeRun(consumer);
            setField(consumer, "runThread", runThread);
            assertTrue("rebalance stop barrier was not entered", worker.entered.await(3, TimeUnit.SECONDS));

            stopper = new Thread(() -> {
                try {
                    consumer.stop();
                } catch (Throwable failure) {
                    stopFailure.set(failure);
                }
            });
            stopper.start();
            assertTrue("stop did not publish its stop flag",
                    awaitFieldBoolean(consumer, "isStop", true, 3, TimeUnit.SECONDS));
            worker.release.countDown();

            runThread.join(3000L);
            stopper.join(5000L);
            assertFalse("main loop did not finish after normal stop", runThread.isAlive());
            assertFalse("stop did not finish", stopper.isAlive());
            assertEquals(null, stopFailure.get());
            assertEquals(null, getField(consumer, "runFailure"));
            assertEquals(LifecycleState.CLOSED,
                    consumer.getStats(StatsOptions.health()).getHeader().getLifecycleState());
        } finally {
            if (worker != null) {
                worker.release.countDown();
            }
            if (runThread != null) {
                runThread.join(3000L);
            }
            if (stopper != null) {
                stopper.join(5000L);
            }
            consumer.stop();
        }
    }

    @Test
    public void liveMainLoopMutationCannotAbortRemainingCleanup() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.statsState.markStarted();
        consumer.executor = Executors.newSingleThreadExecutor();
        FixedHeartbeatTracker heartbeat = new FixedHeartbeatTracker(consumer);
        setField(consumer, "heartbeatTracker", heartbeat);

        CountDownLatch workerStopEntered = new CountDownLatch(1);
        CountDownLatch releaseWorkerStop = new CountDownLatch(1);
        BlockingStopLogConsumer first = new BlockingStopLogConsumer(
                consumer, workerStopEntered, releaseWorkerStop);
        RecordingStopLogConsumer second = new RecordingStopLogConsumer(consumer);
        RecordingStopLogConsumer concurrentlyAdded = new RecordingStopLogConsumer(consumer);
        Map<String, LogConsumer> workers = new LinkedHashMap<>();
        workers.put("topic0", first);
        workers.put("topic1", second);
        setField(consumer, "workerMap", workers);

        CountDownLatch mutate = new CountDownLatch(1);
        CountDownLatch mutated = new CountDownLatch(1);
        Thread liveRunThread = new Thread(() -> {
            awaitIgnoringInterrupt(mutate);
            workers.put("topic2", concurrentlyAdded);
            mutated.countDown();
        });
        liveRunThread.start();
        setField(consumer, "runThread", liveRunThread);

        AtomicReference<Throwable> stopResult = new AtomicReference<>();
        Thread stopper = new Thread(() -> {
            try {
                consumer.stop();
            } catch (Throwable failure) {
                stopResult.set(failure);
            }
        });
        stopper.start();
        assertTrue("worker cleanup was not reached", workerStopEntered.await(5, TimeUnit.SECONDS));

        mutate.countDown();
        assertTrue("main loop did not mutate its map", mutated.await(3, TimeUnit.SECONDS));
        releaseWorkerStop.countDown();
        stopper.join(5000L);

        assertFalse("stop did not remain bounded", stopper.isAlive());
        assertTrue("the live main loop must still be reported",
                stopResult.get() instanceof IllegalStateException);
        assertTrue(stopResult.get().getMessage().contains("main loop"));
        assertTrue("concurrent mutation must not skip later workers", second.stopped.get());
        assertTrue("executor cleanup must still run", consumer.executor.isTerminated());
        assertTrue("heartbeat cleanup must still run", heartbeat.stopped.get());
    }

    @Test
    public void runningShardTaskCannotBeReportedAsStopped() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.executor = Executors.newSingleThreadExecutor();
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        CountDownLatch entered = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);

        invokeExecuteTracked(worker, () -> {
            entered.countDown();
            awaitIgnoringInterrupt(release);
        });
        assertTrue("tracked task did not start", entered.await(3, TimeUnit.SECONDS));

        assertFalse("live task must be conjoined with checkpoint termination", worker.stop());
        release.countDown();
        assertTrue("executor did not terminate after task release",
                stopExecutor(consumer.executor));
        assertTrue("stop should succeed after the task has really exited", worker.stop());
    }

    @Test
    public void oldShardTaskFinallyCannotTouchRestartedWorkerFacts() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.statsState.markStarted();
        consumer.executor = Executors.newSingleThreadExecutor();

        CountDownLatch taskEntered = new CountDownLatch(1);
        CountDownLatch delegateFinished = new CountDownLatch(1);
        CountDownLatch releaseTask = new CountDownLatch(1);
        LogConsumer oldWorker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        invokeExecuteTracked(oldWorker, () -> {
            taskEntered.countDown();
            awaitIgnoringInterrupt(releaseTask);
            delegateFinished.countDown();
        });
        assertTrue("old shard task did not start", taskEntered.await(3, TimeUnit.SECONDS));

        // Simulate the clean terminal boundary and a new run while the old task's finally is
        // still pending. Hold the same lifecycle lock used by the wrapper so the old finally
        // cannot observe the old epoch before the restart reset publishes the new one.
        synchronized (consumer.workerLifecycleLock()) {
            releaseTask.countDown();
            assertTrue("old task delegate did not finish", delegateFinished.await(3, TimeUnit.SECONDS));
            consumer.statsState.markClosing();
            consumer.statsState.markClosedAndFreeze();
            consumer.statsState.restart();
            setField(consumer, "workerRunEpoch", 1L);
            consumer.statsState.markStarted();
            consumer.statsState.onShardTaskStarted();
        }

        assertTrue("old executor did not drain", stopExecutor(consumer.executor));
        assertTrue("old worker did not retire", oldWorker.stop());

        ConsumerStatsSnapshot snapshot = consumer.getStats(StatsOptions.operational());
        assertEquals("late old finally must not decrement the new task", 1L,
                snapshot.getHealth().get().getWorkerSummary().getInFlightTotal());
    }

    @Test
    public void queuedShardTaskIsClosedBeforeItCanStart() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.executor = Executors.newSingleThreadExecutor();
        CountDownLatch blockerEntered = new CountDownLatch(1);
        CountDownLatch releaseBlocker = new CountDownLatch(1);
        consumer.executor.execute(() -> {
            blockerEntered.countDown();
            awaitIgnoringInterrupt(releaseBlocker);
        });
        assertTrue("executor blocker did not start", blockerEntered.await(3, TimeUnit.SECONDS));

        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        AtomicBoolean taskRan = new AtomicBoolean(false);
        invokeExecuteTracked(worker, () -> taskRan.set(true));

        assertTrue("queued-but-not-started task should be cancelled by stop", worker.stop());
        releaseBlocker.countDown();
        assertTrue("executor did not drain", stopExecutor(consumer.executor));
        assertFalse("closed admission must not execute its queued task", taskRan.get());
    }

    @Test
    public void successfulStopClearsPayloadWorkersAndAssignmentWithoutRebalance() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.statsState.markStarted();
        consumer.executor = Executors.newSingleThreadExecutor();
        FixedHeartbeatTracker heartbeat = new FixedHeartbeatTracker(consumer);
        setField(consumer, "heartbeatTracker", heartbeat);

        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        PutLogRequest.LogGroupList payload = PutLogRequest.LogGroupList.newBuilder()
                .addLogGroups(PutLogRequest.LogGroup.newBuilder()
                        .addLogs(PutLogRequest.Log.newBuilder().setTime(1)))
                .build();
        setField(worker, "currLogGroupList", payload);
        Map<String, LogConsumer> workers = new LinkedHashMap<>();
        workers.put("topic0", worker);
        setField(consumer, "workerMap", workers);
        consumer.statsState.onAssignment(1, true);
        assertEquals("initial assignment is not a rebalance", 0L,
                consumer.getStats(StatsOptions.operational())
                        .getOperational().get().getRebalanceTotal());
        consumer.statsState.onAssignment(2, true);
        long rebalancesBefore = consumer.getStats(StatsOptions.operational())
                .getOperational().get().getRebalanceTotal();
        assertEquals("a real membership change is one rebalance", 1L, rebalancesBefore);

        consumer.stop();

        assertTrue("terminal worker map must release workers", workers.isEmpty());
        assertEquals("terminal worker must release its payload", null,
                getField(worker, "currLogGroupList"));
        ConsumerStatsSnapshot terminal = consumer.getStats(StatsOptions.operational());
        assertEquals(0, terminal.getOperational().get().getAssignedShards());
        assertEquals("terminal assignment reset is not a rebalance", rebalancesBefore,
                terminal.getOperational().get().getRebalanceTotal());
    }

    @Test
    public void terminatedExecutorClearsThreadWrapperGaugeBeforeFinalFreeze() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.statsState.markStarted();
        for (int i = 0; i < 45; i++) {
            consumer.statsState.onShardWorkerStarted();
        }
        consumer.executor = Executors.newSingleThreadExecutor();
        consumer.executor.shutdown();
        assertTrue("fixture executor did not terminate",
                consumer.executor.awaitTermination(3, TimeUnit.SECONDS));
        assertEquals(45L, consumer.getStats(StatsOptions.operational())
                .getHealth().get().getWorkerSummary().getRunningTotal());

        consumer.stop();

        ConsumerStatsSnapshot terminal = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, terminal.getHeader().getConsistency());
        assertEquals(0L, terminal.getHealth().get().getWorkerSummary().getRunningTotal());
        assertFalse(terminal.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void readyPublicationAndActiveTaskRetirementAreOneLinearization() throws Exception {
        ConsumerImpl consumer = newConsumer();
        consumer.executor = Executors.newSingleThreadExecutor();
        CountDownLatch readyPublished = new CountDownLatch(1);
        CountDownLatch allowRetirement = new CountDownLatch(1);
        PublishingBarrierLogConsumer worker = new PublishingBarrierLogConsumer(
                consumer, readyPublished, allowRetirement);

        worker.run();
        assertTrue("READY was not published", readyPublished.await(3, TimeUnit.SECONDS));

        AtomicReference<Throwable> secondRunFailure = new AtomicReference<>();
        CountDownLatch secondRunStarted = new CountDownLatch(1);
        Thread secondRun = new Thread(() -> {
            secondRunStarted.countDown();
            try {
                worker.run();
            } catch (Throwable failure) {
                secondRunFailure.set(failure);
            }
        });
        secondRun.start();
        assertTrue(secondRunStarted.await(1, TimeUnit.SECONDS));
        secondRun.join(200L);
        boolean waitedForRetirement = secondRun.isAlive();

        allowRetirement.countDown();
        secondRun.join(3000L);
        assertFalse("second run did not complete", secondRun.isAlive());
        assertTrue("READY must not be actionable before active retirement",
                waitedForRetirement);
        assertEquals(null, secondRunFailure.get());
        assertTrue(worker.stop());
        assertTrue(stopExecutor(consumer.executor));
    }

    @Test
    public void directStopBeforeStartIsAClosedTerminalState() throws Exception {
        ConsumerImpl consumer = newConsumer();

        consumer.stop();

        ConsumerStatsSnapshot terminal = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, terminal.getHeader().getConsistency());
        assertEquals(LifecycleState.CLOSED, terminal.getHeader().getLifecycleState());
        assertFalse(terminal.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void startStopRaceWaitsForPublishedResourcesThenCleansThem() throws Exception {
        ConsumerImpl consumer = newConsumer();
        BlockingStartClient handler = new BlockingStartClient();
        injectClient(consumer, handler);
        AtomicReference<Throwable> startFailure = new AtomicReference<>();
        AtomicReference<Throwable> stopFailure = new AtomicReference<>();

        Thread starter = new Thread(() -> {
            try {
                consumer.start();
            } catch (Throwable failure) {
                startFailure.set(failure);
            }
        });
        starter.start();
        assertTrue("start did not enter init", handler.entered.await(3, TimeUnit.SECONDS));

        Thread stopper = new Thread(() -> {
            try {
                consumer.stop();
            } catch (Throwable failure) {
                stopFailure.set(failure);
            }
        });
        stopper.start();
        stopper.join(200L);
        boolean waitedForStart = stopper.isAlive();
        handler.release.countDown();
        starter.join(5000L);
        stopper.join(5000L);

        assertTrue("stop must fence an in-progress start", waitedForStart);
        assertFalse(starter.isAlive());
        assertFalse(stopper.isAlive());
        assertEquals(null, startFailure.get());
        assertEquals(null, stopFailure.get());
        assertTrue(consumer.executor.isTerminated());
        assertEquals(LifecycleState.CLOSED, consumer.getStats(StatsOptions.health())
                .getHeader().getLifecycleState());
    }

    @Test
    public void initFailureClosesPublishedResourcesAndFreezesFailed() throws Exception {
        ConsumerImpl consumer = newConsumer();
        FailingStartClient handler = new FailingStartClient();
        injectClient(consumer, handler);

        try {
            consumer.start();
            fail("init failure must be returned to the caller");
        } catch (LogException expected) {
            assertTrue(expected.getMessage().contains("expected init failure"));
        }

        assertTrue("client must close after init failure", handler.closed.get());
        ConsumerStatsSnapshot terminal = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, terminal.getHeader().getConsistency());
        assertEquals(LifecycleState.FAILED, terminal.getHeader().getLifecycleState());
        assertFalse(terminal.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    private static ConsumerImpl newConsumer() throws Exception {
        ConsumerConfig config = new ConsumerConfig("http://endpoint", "region", "ak", "sk");
        config.setProjectID("project");
        config.setConsumerGroupName("group");
        config.setConsumerName("consumer");
        config.setTopicIDList(Collections.singletonList("topic"));
        config.setHeartbeatIntervalInSecond(1);
        config.setDataFetchIntervalInMillisecond(5);
        config.setFlushCheckpointIntervalInSecond(1);
        config.setStopTimeout(1);
        config.setMetricsLevel(MetricsLevel.CORE);
        ConsumerImpl consumer = new ConsumerImpl(config, (topicID, shardID, logs) -> { });
        TLSLogClient client = (TLSLogClient) Proxy.newProxyInstance(
                TLSLogClient.class.getClassLoader(), new Class<?>[]{TLSLogClient.class},
                new NoopClient());
        injectClient(consumer, client);
        return consumer;
    }

    private static void injectClient(ConsumerImpl consumer, InvocationHandler handler)
            throws Exception {
        TLSLogClient client = (TLSLogClient) Proxy.newProxyInstance(
                TLSLogClient.class.getClassLoader(), new Class<?>[]{TLSLogClient.class}, handler);
        injectClient(consumer, client);
    }

    private static void injectClient(ConsumerImpl consumer, TLSLogClient client) throws Exception {
        setField(consumer, "tlsClient", client);
        Field trackerField = HeartbeatTracker.class.getDeclaredField("tlsClient");
        trackerField.setAccessible(true);
        trackerField.set(getField(consumer, "heartbeatTracker"), client);
    }

    private static Thread invokeRun(ConsumerImpl consumer) throws Exception {
        Method run = ConsumerImpl.class.getDeclaredMethod("run");
        run.setAccessible(true);
        Thread thread = new Thread(() -> {
            try {
                run.invoke(consumer);
            } catch (Exception failure) {
                throw new AssertionError(failure);
            }
        });
        thread.start();
        return thread;
    }

    private static void invokeExecuteTracked(LogConsumer worker, Runnable task) throws Exception {
        Method method = LogConsumer.class.getDeclaredMethod("executeTracked", Runnable.class);
        method.setAccessible(true);
        method.invoke(worker, task);
    }

    private static boolean stopExecutor(ExecutorService executor) throws InterruptedException {
        executor.shutdown();
        return executor.awaitTermination(3, TimeUnit.SECONDS);
    }

    private static ScheduledExecutorService heartbeatExecutor(HeartbeatTracker tracker)
            throws Exception {
        Field field = HeartbeatTracker.class.getDeclaredField("executorService");
        field.setAccessible(true);
        return (ScheduledExecutorService) field.get(tracker);
    }

    private static boolean awaitThreadState(Thread thread, Thread.State expected,
                                            long timeout, TimeUnit unit)
            throws InterruptedException {
        long deadline = System.nanoTime() + unit.toNanos(timeout);
        while (System.nanoTime() < deadline) {
            if (thread.getState() == expected) {
                return true;
            }
            Thread.yield();
        }
        return thread.getState() == expected;
    }

    private static boolean awaitFieldBoolean(Object target, String name, boolean expected,
                                              long timeout, TimeUnit unit)
            throws Exception {
        long deadline = System.nanoTime() + unit.toNanos(timeout);
        while (System.nanoTime() < deadline) {
            if (expected == (Boolean) getField(target, name)) {
                return true;
            }
            Thread.yield();
        }
        return expected == (Boolean) getField(target, name);
    }

    private static void setField(Object target, String name, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }

    private static Object getField(Object target, String name) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field.get(target);
    }

    private static class FixedHeartbeatTracker extends HeartbeatTracker {
        private final AtomicBoolean stopped = new AtomicBoolean(false);

        FixedHeartbeatTracker(ConsumerImpl consumer) {
            super(consumer);
        }

        @Override
        List<ConsumeShard> getShards() {
            return Collections.emptyList();
        }

        @Override
        public boolean stop() {
            stopped.set(true);
            return true;
        }
    }

    private static class RecordingStopLogConsumer extends LogConsumer {
        final AtomicBoolean stopped = new AtomicBoolean(false);

        RecordingStopLogConsumer(ConsumerImpl consumer) {
            super(consumer, new ConsumeShard("topic", 0));
        }

        @Override
        public boolean stop() {
            stopped.set(true);
            return true;
        }

        @Override
        public void run() {
        }

        @Override
        public ConsumerStatus loadStatus() {
            return ConsumerStatus.PENDING;
        }
    }

    private static final class BlockingStopLogConsumer extends RecordingStopLogConsumer {
        private final CountDownLatch entered;
        private final CountDownLatch release;

        BlockingStopLogConsumer(ConsumerImpl consumer, CountDownLatch entered,
                                CountDownLatch release) {
            super(consumer);
            this.entered = entered;
            this.release = release;
        }

        @Override
        public boolean stop() {
            entered.countDown();
            awaitIgnoringInterrupt(release);
            return super.stop();
        }
    }

    private static final class FailOnceStopLogConsumer extends RecordingStopLogConsumer {
        private final AtomicInteger stopCalls = new AtomicInteger();

        FailOnceStopLogConsumer(ConsumerImpl consumer) {
            super(consumer);
        }

        @Override
        public boolean stop() {
            return stopCalls.incrementAndGet() > 1;
        }
    }

    private static final class BarrierFalseOnceStopLogConsumer extends RecordingStopLogConsumer {
        private final CountDownLatch entered = new CountDownLatch(1);
        private final CountDownLatch release = new CountDownLatch(1);
        private final AtomicInteger stopCalls = new AtomicInteger();

        BarrierFalseOnceStopLogConsumer(ConsumerImpl consumer) {
            super(consumer);
        }

        @Override
        public boolean stop() {
            if (stopCalls.incrementAndGet() == 1) {
                entered.countDown();
                awaitIgnoringInterrupt(release);
                return false;
            }
            return true;
        }
    }

    private static final class PublishingBarrierLogConsumer extends LogConsumer {
        private final CountDownLatch readyPublished;
        private final CountDownLatch allowRetirement;

        PublishingBarrierLogConsumer(ConsumerImpl consumer, CountDownLatch readyPublished,
                                     CountDownLatch allowRetirement) {
            super(consumer, new ConsumeShard("topic", 0));
            this.readyPublished = readyPublished;
            this.allowRetirement = allowRetirement;
        }

        @Override
        public void setStatus(ConsumerStatus status) {
            super.setStatus(status);
            if (status == ConsumerStatus.READY_TO_FETCH) {
                readyPublished.countDown();
                awaitIgnoringInterrupt(allowRetirement);
            }
        }
    }

    private static class NoopClient implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("describeConsumerGroups".equals(method.getName())) {
                DescribeConsumerGroupsResponse response = new DescribeConsumerGroupsResponse();
                response.setConsumerGroups(Collections.emptyList());
                return response;
            }
            if ("consumerHeartbeat".equals(method.getName())) {
                ConsumerHeartbeatResponse response = new ConsumerHeartbeatResponse();
                response.setShards(Collections.emptyList());
                return response;
            }
            if ("describeCheckPoint".equals(method.getName())) {
                DescribeCheckpointResponse response = new DescribeCheckpointResponse();
                response.setCheckpoint("cursor-0");
                return response;
            }
            if ("toString".equals(method.getName())) return "NoopClient";
            if ("hashCode".equals(method.getName())) return System.identityHashCode(proxy);
            if ("equals".equals(method.getName())) return proxy == args[0];
            Class<?> type = method.getReturnType();
            if (type == boolean.class) return false;
            if (type == int.class) return 0;
            if (type == long.class) return 0L;
            return null;
        }
    }

    private static final class CountingHeartbeatClient extends NoopClient {
        private final AtomicInteger calls = new AtomicInteger();
        private final CountDownLatch firstCompleted = new CountDownLatch(1);

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("consumerHeartbeat".equals(method.getName())) {
                calls.incrementAndGet();
                try {
                    return super.invoke(proxy, method, args);
                } finally {
                    firstCompleted.countDown();
                }
            }
            return super.invoke(proxy, method, args);
        }
    }

    private static final class BlockingStartClient extends NoopClient {
        private final CountDownLatch entered = new CountDownLatch(1);
        private final CountDownLatch release = new CountDownLatch(1);

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("describeConsumerGroups".equals(method.getName())) {
                entered.countDown();
                awaitIgnoringInterrupt(release);
            }
            return super.invoke(proxy, method, args);
        }
    }

    private static final class FailingStartClient extends NoopClient {
        private final AtomicBoolean closed = new AtomicBoolean(false);

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("describeConsumerGroups".equals(method.getName())) {
                throw new LogException("InvalidArgument", "expected init failure", null);
            }
            if ("close".equals(method.getName())) {
                closed.set(true);
                return null;
            }
            return super.invoke(proxy, method, args);
        }
    }

    private static void awaitIgnoringInterrupt(CountDownLatch latch) {
        boolean interrupted = false;
        while (true) {
            try {
                latch.await();
                break;
            } catch (InterruptedException ignored) {
                interrupted = true;
            }
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
    }
}
