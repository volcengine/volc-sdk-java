package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.CheckpointInfo;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.ModifyCheckpointRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.response.ConsumerHeartbeatResponse;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeConsumerGroupsResponse;
import com.volcengine.model.tls.response.DescribeCursorResponse;
import com.volcengine.model.tls.response.ModifyCheckpointResponse;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.ConsumerOperationalStats;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.consumer.ConsumerImpl;
import com.volcengine.service.tls.consumer.CheckpointTracker;
import com.volcengine.service.tls.consumer.LogProcessor;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ConsumerStatsIntegrationTest {
    @Test
    public void offIsHeaderOnlyThroughRealConsumerLifecycle() throws Exception {
        ConsumerImpl consumer = newConsumer(MetricsLevel.OFF, new CountingProcessor(false),
                new FakeClient());
        consumer.start();
        try {
            ConsumerStatsSnapshot snapshot = consumer.getStats(StatsOptions.debug());
            assertTrue(snapshot.getHeader().isMetricsDisabled());
            assertTrue(snapshot.getHeader().isPartial());
            assertFalse(snapshot.getHealth().isPresent());
            assertFalse(snapshot.getOperational().isPresent());
            assertFalse(snapshot.getLatencyHistograms().isPresent());
        } finally {
            consumer.stop();
        }
        ConsumerStatsSnapshot closed = consumer.getStats(StatsOptions.health());
        assertEquals(Consistency.FINAL, closed.getHeader().getConsistency());
        assertEquals(LifecycleState.CLOSED, closed.getHeader().getLifecycleState());
    }

    @Test
    public void realLoopPreservesOutcomeEquationAndReturnedPayload() throws Exception {
        CountingProcessor processor = new CountingProcessor(false);
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, processor, new FakeClient());
        consumer.start();
        ConsumerStatsSnapshot live;
        try {
            live = awaitNormalReturns(consumer, 2, 8_000);
            ConsumerOperationalStats operational = live.getOperational().get();
            assertTrue(operational.getFetchSuccessTotal() >= 2);
            assertTrue(operational.getHeldBatchReferences() >= operational.getReadyToProcess());
            assertTrue(operational.getHeldBatchReferences() >= operational.getProcessInFlight());
            assertEquals(operational.getHandlerNormalReturnsTotal(),
                    operational.getHandlerReturnedGroupsTotal());
            assertEquals(operational.getHandlerNormalReturnsTotal() * 3,
                    operational.getHandlerReturnedLogsTotal());
            assertTrue(operational.getHeldBatchReferences() >= 0);
            assertTrue(operational.getReadyToProcess() >= 0);
        } finally {
            consumer.stop();
        }

        ConsumerStatsSnapshot finalOperational = consumer.getStats(StatsOptions.operational());
        ConsumerStatsSnapshot finalHealth = consumer.getStats(StatsOptions.health());
        assertEquals(Consistency.FINAL, finalOperational.getHeader().getConsistency());
        assertEquals(0, finalOperational.getOperational().get().getHeldBatchReferences());
        assertEquals(0, finalOperational.getOperational().get().getReadyToProcess());
        assertEquals(finalOperational.getHeader().getSnapshotSequence(),
                finalHealth.getHeader().getSnapshotSequence());
        assertEquals(finalOperational.getHeader().getCapturedAtUnixMs(),
                finalHealth.getHeader().getCapturedAtUnixMs());
        assertEquals(processor.calls.get(), finalOperational.getOperational().get().getHandlerNormalReturnsTotal());
    }

    @Test
    public void handlerThrowableRetriesSameSlotAndOnlyNormalReturnCountsPayload() throws Exception {
        CountingProcessor processor = new CountingProcessor(true);
        ConsumerImpl consumer = newConsumer(MetricsLevel.DETAILED, processor, new FakeClient());
        consumer.start();
        try {
            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(8);
            ConsumerStatsSnapshot snapshot;
            do {
                Thread.sleep(20);
                snapshot = consumer.getStats(StatsOptions.debug());
            } while ((snapshot.getOperational().get().getHandlerExceptionReturnsTotal() < 1
                    || snapshot.getOperational().get().getHandlerNormalReturnsTotal() < 1)
                    && System.nanoTime() < deadline);

            ConsumerOperationalStats operational = snapshot.getOperational().get();
            assertTrue(operational.getHandlerExceptionReturnsTotal() >= 1);
            assertTrue(operational.getHandlerNormalReturnsTotal() >= 1);
            assertTrue(operational.getHeldBatchReferences() >= operational.getReadyToProcess());
            assertTrue(operational.getHeldBatchReferences() >= operational.getProcessInFlight());
            assertEquals(operational.getHandlerNormalReturnsTotal(),
                    operational.getHandlerReturnedGroupsTotal());
            assertEquals(operational.getHandlerNormalReturnsTotal() * 3,
                    operational.getHandlerReturnedLogsTotal());
            assertTrue(snapshot.getLatencyHistograms().isPresent());
        } finally {
            consumer.stop();
        }
        ConsumerOperationalStats terminal = consumer.getStats(StatsOptions.operational()).getOperational().get();
        assertEquals(processor.calls.get(), terminal.getHandlerNormalReturnsTotal()
                + terminal.getHandlerExceptionReturnsTotal());
    }

    @Test
    public void handlerErrorFailsRunOnceAndClosesProcessAttempt() throws Exception {
        ErrorOnceProcessor processor = new ErrorOnceProcessor();
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, processor, new FakeClient());
        try {
            consumer.start();
            assertTrue("handler did not enter", processor.entered.await(5, TimeUnit.SECONDS));
            ConsumerStatsSnapshot snapshot = awaitProcessCompletion(consumer, processor, 5_000);
            ConsumerOperationalStats operational = snapshot.getOperational().get();
            assertEquals("fatal handler error must not be retried", 1, processor.calls.get());
            assertEquals(1L, operational.getHandlerExceptionReturnsTotal());
            assertEquals(0, operational.getProcessInFlight());
            assertEquals(1L, operational.getHeldBatchReferences());
            assertEquals(LifecycleState.CLOSING, snapshot.getHeader().getLifecycleState());

            try {
                consumer.stop();
                throw new AssertionError("stop must surface the fatal handler error");
            } catch (IllegalStateException expected) {
                assertEquals(processor.failure, expected.getCause());
            }
        } finally {
            try {
                consumer.stop();
            } catch (IllegalStateException cleanupFailure) {
                if (processor.calls.get() != 1
                        || cleanupFailure.getCause() != processor.failure) {
                    throw cleanupFailure;
                }
            }
        }
        ConsumerOperationalStats terminal = consumer.getStats(StatsOptions.operational()).getOperational().get();
        assertEquals(1, processor.calls.get());
        assertEquals(1L, terminal.getHandlerExceptionReturnsTotal());
        assertEquals(0, terminal.getProcessInFlight());
        assertEquals(0L, terminal.getHeldBatchReferences());
    }

    @Test
    public void stopDuringHandlerErrorRetainsRunFailureCause() throws Exception {
        BlockingErrorProcessor processor = new BlockingErrorProcessor();
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, processor, new FakeClient());
        AtomicReference<Throwable> stopFailure = new AtomicReference<>();
        Thread stopper = null;
        try {
            consumer.start();
            assertTrue("handler did not enter", processor.entered.await(5, TimeUnit.SECONDS));
            stopper = new Thread(() -> {
                try {
                    consumer.stop();
                } catch (Throwable failure) {
                    stopFailure.set(failure);
                }
            }, "consumer-stop-during-handler-error");
            stopper.start();
            assertTrue("stop did not publish its stop flag", awaitStopFlag(consumer, 5_000));
            processor.release.countDown();

            stopper.join(8_000L);
            assertFalse("stop did not finish", stopper.isAlive());
            assertTrue("stop must surface the handler Error",
                    stopFailure.get() instanceof IllegalStateException);
            assertSame(processor.failure, stopFailure.get().getCause());
        } finally {
            processor.release.countDown();
            if (stopper != null) {
                stopper.join(8_000L);
            }
            try {
                consumer.stop();
            } catch (IllegalStateException cleanupFailure) {
                if (cleanupFailure.getCause() != processor.failure) {
                    throw cleanupFailure;
                }
            }
        }

        ConsumerOperationalStats terminal = consumer.getStats(StatsOptions.operational())
                .getOperational().get();
        assertEquals(1, processor.calls.get());
        assertEquals(1L, terminal.getHandlerExceptionReturnsTotal());
        assertEquals(0, terminal.getProcessInFlight());
        assertEquals(0L, terminal.getHeldBatchReferences());
    }

    @Test
    public void checkpointFailureRemainsPendingUntilARealSuccessfulFlush() throws Exception {
        FakeClient client = new FakeClient();
        client.checkpointFailuresRemaining.set(1);
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, new CountingProcessor(false), client);
        ConsumeShard shard = new ConsumeShard("topic", 0);
        CheckpointTracker tracker = new CheckpointTracker(consumer, shard);
        tracker.setCheckpoint(new CheckpointInfo("cursor-1", shard));
        Thread.sleep(5);

        try {
            tracker.uploadCheckpoint();
            throw new AssertionError("first checkpoint flush must fail");
        } catch (LogException expected) {
            // expected
        }
        ConsumerStatsSnapshot failed = consumer.getStats(StatsOptions.operational());
        assertEquals(1, failed.getOperational().get().getCheckpointPending().getCurrentItems());
        assertEquals(1, failed.getOperational().get().getCheckpointFailureTotal());
        assertTrue(failed.getHealth().get().getLastErrorAgeMs() != null);

        tracker.uploadCheckpoint();
        ConsumerStatsSnapshot succeeded = consumer.getStats(StatsOptions.operational());
        assertEquals(0, succeeded.getOperational().get().getCheckpointPending().getCurrentItems());
        assertEquals(1, succeeded.getOperational().get().getCheckpointSuccessTotal());
        tracker.abandonPending();
    }

    private static ConsumerStatsSnapshot awaitNormalReturns(ConsumerImpl consumer, long minimum,
                                                            long timeoutMs) throws Exception {
        long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(timeoutMs);
        ConsumerStatsSnapshot snapshot;
        do {
            Thread.sleep(20);
            snapshot = consumer.getStats(StatsOptions.operational());
        } while (snapshot.getOperational().get().getHandlerNormalReturnsTotal() < minimum
                && System.nanoTime() < deadline);
        assertTrue("consumer did not process enough batches",
                snapshot.getOperational().get().getHandlerNormalReturnsTotal() >= minimum);
        return snapshot;
    }

    private static ConsumerStatsSnapshot awaitProcessCompletion(ConsumerImpl consumer,
                                                                  ErrorOnceProcessor processor,
                                                                  long timeoutMs)
            throws InterruptedException {
        long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(timeoutMs);
        ConsumerStatsSnapshot snapshot;
        do {
            Thread.yield();
            snapshot = consumer.getStats(StatsOptions.operational());
        } while ((snapshot.getOperational().get().getProcessInFlight() != 0
                || snapshot.getHeader().getLifecycleState() == LifecycleState.RUNNING
                || processor.calls.get() != 1
                || snapshot.getOperational().get().getHandlerExceptionReturnsTotal() < 1)
                && System.nanoTime() < deadline);
        assertEquals(0, snapshot.getOperational().get().getProcessInFlight());
        assertEquals(LifecycleState.CLOSING, snapshot.getHeader().getLifecycleState());
        assertEquals(1, processor.calls.get());
        assertEquals(1L, snapshot.getOperational().get().getHandlerExceptionReturnsTotal());
        return snapshot;
    }

    private static boolean awaitStopFlag(ConsumerImpl consumer, long timeoutMs) throws Exception {
        Field field = ConsumerImpl.class.getDeclaredField("isStop");
        field.setAccessible(true);
        long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(timeoutMs);
        while (System.nanoTime() < deadline) {
            if ((Boolean) field.get(consumer)) {
                return true;
            }
            Thread.yield();
        }
        return (Boolean) field.get(consumer);
    }

    private static ConsumerImpl newConsumer(MetricsLevel level, LogProcessor processor,
                                            FakeClient handler) throws Exception {
        ConsumerConfig config = new ConsumerConfig("http://endpoint", "region", "ak", "sk");
        config.setProjectID("project");
        config.setConsumerGroupName("group");
        config.setConsumerName("consumer");
        config.setTopicIDList(Collections.singletonList("topic"));
        config.setHeartbeatIntervalInSecond(1);
        config.setDataFetchIntervalInMillisecond(10);
        config.setFlushCheckpointIntervalInSecond(1);
        config.setStopTimeout(3);
        config.setMetricsLevel(level);
        ConsumerImpl consumer = new ConsumerImpl(config, processor);
        injectClient(consumer, proxy(handler));
        return consumer;
    }

    private static TLSLogClient proxy(FakeClient handler) {
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, handler);
    }

    private static void injectClient(ConsumerImpl consumer, TLSLogClient client) throws Exception {
        Field clientField = ConsumerImpl.class.getDeclaredField("tlsClient");
        clientField.setAccessible(true);
        clientField.set(consumer, client);
        Field trackerField = ConsumerImpl.class.getDeclaredField("heartbeatTracker");
        trackerField.setAccessible(true);
        Object tracker = trackerField.get(consumer);
        Field trackerClient = tracker.getClass().getDeclaredField("tlsClient");
        trackerClient.setAccessible(true);
        trackerClient.set(tracker, client);
    }

    private static final class CountingProcessor implements LogProcessor {
        private final AtomicBoolean throwOnce;
        private final AtomicInteger calls = new AtomicInteger();

        private CountingProcessor(boolean throwOnce) {
            this.throwOnce = new AtomicBoolean(throwOnce);
        }

        public void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList) {
            calls.incrementAndGet();
            if (throwOnce.compareAndSet(true, false)) {
                throw new IllegalStateException("expected handler failure");
            }
        }
    }

    private static final class ErrorOnceProcessor implements LogProcessor {
        private final AtomicBoolean throwOnce = new AtomicBoolean(true);
        private final AtomicInteger calls = new AtomicInteger();
        private final java.util.concurrent.CountDownLatch entered =
                new java.util.concurrent.CountDownLatch(1);
        private final AssertionError failure = new AssertionError("expected handler error");

        public void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList) {
            calls.incrementAndGet();
            entered.countDown();
            if (throwOnce.compareAndSet(true, false)) {
                throw failure;
            }
        }
    }

    private static final class BlockingErrorProcessor implements LogProcessor {
        private final AtomicInteger calls = new AtomicInteger();
        private final CountDownLatch entered = new CountDownLatch(1);
        private final CountDownLatch release = new CountDownLatch(1);
        private final AssertionError failure = new AssertionError("expected stop-time handler error");

        public void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList) {
            calls.incrementAndGet();
            entered.countDown();
            awaitIgnoringInterrupt(release);
            throw failure;
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

    private static final class FakeClient implements InvocationHandler {
        private final AtomicInteger checkpointFailuresRemaining = new AtomicInteger();

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("describeConsumerGroups".equals(name)) {
                DescribeConsumerGroupsResponse response = new DescribeConsumerGroupsResponse();
                response.setConsumerGroups(new ArrayList<>());
                return response;
            }
            if ("consumerHeartbeat".equals(name)) {
                ConsumerHeartbeatResponse response = new ConsumerHeartbeatResponse();
                response.setShards(Collections.singletonList(new ConsumeShard("topic", 0)));
                return response;
            }
            if ("describeCheckPoint".equals(name)) {
                DescribeCheckpointResponse response = new DescribeCheckpointResponse();
                response.setCheckpoint("");
                return response;
            }
            if ("describeCursor".equals(name)) {
                DescribeCursorResponse response = new DescribeCursorResponse();
                response.setCursor("cursor-0");
                return response;
            }
            if ("consumeLogs".equals(name)) {
                PutLogRequest.LogGroup.Builder group = PutLogRequest.LogGroup.newBuilder()
                        .setSource("source").setFileName("file");
                for (int i = 0; i < 3; i++) {
                    group.addLogs(PutLogRequest.Log.newBuilder().setTime(1)
                            .addContents(PutLogRequest.LogContent.newBuilder()
                                    .setKey("key").setValue("value" + i)));
                }
                ConsumeLogsResponse response = new ConsumeLogsResponse();
                response.setLogGroupList(PutLogRequest.LogGroupList.newBuilder()
                        .addLogGroups(group).build());
                response.setXTlsCursor("cursor-next");
                return response;
            }
            if ("modifyCheckPoint".equals(name)) {
                ModifyCheckpointRequest ignored = (ModifyCheckpointRequest) args[0];
                if (checkpointFailuresRemaining.getAndDecrement() > 0) {
                    throw new LogException(500, "CheckpointFailure", "checkpoint failed", "request");
                }
                return new ModifyCheckpointResponse(null);
            }
            if ("toString".equals(name)) return "FakeConsumerClient";
            if ("hashCode".equals(name)) return System.identityHashCode(proxy);
            if ("equals".equals(name)) return proxy == args[0];
            Class<?> type = method.getReturnType();
            if (type == boolean.class) return false;
            if (type == int.class) return 0;
            if (type == long.class) return 0L;
            return null;
        }
    }
}
