package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** Deterministic operation-boundary checks through the real LogConsumer private call path. */
public class ConsumerOperationBoundaryTest {
    @Test
    public void oldFetchReturnAfterOffDoesNotEnterNewHeldButProcessesInNewWindow() throws Exception {
        CountDownLatch fetchEntered = new CountDownLatch(1);
        CountDownLatch releaseFetch = new CountDownLatch(1);
        AtomicInteger processed = new AtomicInteger();
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, (topic, shard, batch) -> processed.incrementAndGet());
        consumer.statsState.markStarted();
        injectClient(consumer, client(batch(), fetchEntered, releaseFetch));
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));

        AtomicReference<Throwable> failure = new AtomicReference<Throwable>();
        Thread fetch = new Thread(() -> invoke(worker, "fetchData", failure), "old-fetch");
        fetch.start();
        assertTrue("fetch did not enter client", fetchEntered.await(3, TimeUnit.SECONDS));

        consumer.statsState.setMetricsLevel(MetricsLevel.OFF);
        consumer.statsState.setMetricsLevel(MetricsLevel.CORE);
        releaseFetch.countDown();
        fetch.join(3_000L);
        assertFalse("fetch did not return", fetch.isAlive());
        assertEquals(null, failure.get());

        ConsumerStatsSnapshot fetched = snapshot(consumer);
        assertEquals("old fetch must not create a new held cohort", 0L,
                fetched.getOperational().get().getHeldBatchReferences());
        assertEquals("old fetch must not create a new ready cohort", 0L,
                fetched.getOperational().get().getReadyToProcess());

        invoke(worker, "consume", failure);
        assertEquals(null, failure.get());
        ConsumerStatsSnapshot processedSnapshot = snapshot(consumer);
        assertEquals(1, processed.get());
        assertEquals(1L, processedSnapshot.getOperational().get().getHandlerNormalReturnsTotal());
        assertEquals(0, processedSnapshot.getOperational().get().getProcessInFlight());
        assertEquals(1L, processedSnapshot.getOperational().get().getHandlerReturnedGroupsTotal());
        assertEquals(1L, processedSnapshot.getOperational().get().getHandlerReturnedLogsTotal());
        assertFalse(processedSnapshot.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    @Test
    public void heldBatchCrossingOffStartsIndependentNewProcessAttempt() throws Exception {
        AtomicInteger processed = new AtomicInteger();
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, (topic, shard, batch) -> processed.incrementAndGet());
        consumer.statsState.markStarted();
        injectClient(consumer, client(batch(), null, null));
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));

        AtomicReference<Throwable> failure = new AtomicReference<Throwable>();
        invoke(worker, "fetchData", failure);
        assertEquals(null, failure.get());
        assertEquals(1L, snapshot(consumer).getOperational().get().getHeldBatchReferences());

        consumer.statsState.setMetricsLevel(MetricsLevel.OFF);
        consumer.statsState.setMetricsLevel(MetricsLevel.CORE);
        invoke(worker, "consume", failure);
        assertEquals(null, failure.get());

        ConsumerStatsSnapshot snapshot = snapshot(consumer);
        assertEquals(1, processed.get());
        assertEquals(1L, snapshot.getOperational().get().getHandlerNormalReturnsTotal());
        assertEquals(0, snapshot.getOperational().get().getProcessInFlight());
        assertEquals(1L, snapshot.getOperational().get().getHandlerReturnedGroupsTotal());
        assertEquals(1L, snapshot.getOperational().get().getHandlerReturnedLogsTotal());
        assertEquals(0L, snapshot.getOperational().get().getHeldBatchReferences());
        assertFalse(snapshot.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    @Test
    public void processCompletionAcrossOffDoesNotWriteTheNewGeneration() throws Exception {
        CountDownLatch handlerEntered = new CountDownLatch(1);
        CountDownLatch releaseHandler = new CountDownLatch(1);
        AtomicReference<Boolean> blockNextHandler = new AtomicReference<Boolean>(Boolean.FALSE);
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, (topic, shard, batch) -> {
            if (Boolean.TRUE.equals(blockNextHandler.get())) {
                handlerEntered.countDown();
                await(releaseHandler);
            }
        });
        consumer.statsState.markStarted();
        injectClient(consumer, client(batch(), null, null));
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        AtomicReference<Throwable> failure = new AtomicReference<Throwable>();
        invoke(worker, "fetchData", failure);
        assertEquals(null, failure.get());
        invoke(worker, "consume", failure);
        assertEquals(null, failure.get());
        assertEquals(1L, snapshot(consumer).getOperational().get().getHandlerReturnedGroupsTotal());

        blockNextHandler.set(Boolean.TRUE);
        invoke(worker, "fetchData", failure);
        assertEquals(null, failure.get());

        Thread consume = new Thread(() -> invoke(worker, "consume", failure), "old-process");
        consume.start();
        assertTrue("handler did not enter", handlerEntered.await(3, TimeUnit.SECONDS));
        consumer.statsState.setMetricsLevel(MetricsLevel.OFF);
        consumer.statsState.setMetricsLevel(MetricsLevel.CORE);
        releaseHandler.countDown();
        consume.join(3_000L);
        assertFalse("handler did not return", consume.isAlive());
        assertEquals(null, failure.get());

        ConsumerStatsSnapshot snapshot = snapshot(consumer);
        assertEquals("old completion cannot increment the new generation", 1L,
                snapshot.getOperational().get().getHandlerNormalReturnsTotal());
        assertEquals("the completed pre-OFF payload remains cumulative", 1L,
                snapshot.getOperational().get().getHandlerReturnedGroupsTotal());
        assertEquals(0, snapshot.getOperational().get().getProcessInFlight());
        assertEquals(0L, snapshot.getOperational().get().getHeldBatchReferences());
        assertFalse(snapshot.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
    }

    @Test
    public void dispatchLatencyDoesNotCrossDetailedCoreDetailed() throws Exception {
        ConsumerImpl consumer = newConsumer(MetricsLevel.DETAILED, (topic, shard, batch) -> { });
        consumer.statsState.markStarted();
        injectClient(consumer, client(batch(), null, null));
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        AtomicReference<Throwable> failure = new AtomicReference<Throwable>();

        invoke(worker, "fetchData", failure);
        assertEquals(null, failure.get());
        consumer.statsState.setMetricsLevel(MetricsLevel.CORE);
        consumer.statsState.setMetricsLevel(MetricsLevel.DETAILED);

        invoke(worker, "consume", failure);
        assertEquals(null, failure.get());
        assertEquals("a dispatch span started before CORE cannot be recorded in the new DETAILED epoch",
                0L, consumer.getStats(StatsOptions.debug()).getLatencyHistograms().get()
                        .getDispatchDelay().getCount());
    }

    @Test
    public void uncheckedFetchAndHeartbeatFailuresAreObservedAndRethrown() throws Exception {
        ConsumerImpl consumer = newConsumer(MetricsLevel.CORE, (topic, shard, batch) -> { });
        consumer.statsState.markStarted();
        TLSLogClient client = errorClient();
        injectClient(consumer, client);
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));
        AtomicReference<Throwable> fetchFailure = new AtomicReference<Throwable>();
        invoke(worker, "fetchData", fetchFailure);
        assertTrue(fetchFailure.get() != null);
        ConsumerStatsSnapshot afterFetch = snapshot(consumer);
        assertEquals(1L, afterFetch.getOperational().get().getFetchFailureTotal());
        assertEquals(0, afterFetch.getOperational().get().getFetchInFlight());

        HeartbeatTracker heartbeat = new HeartbeatTracker(consumer);
        try {
            heartbeat.uploadHeartbeat();
        } catch (AssertionError expected) {
            ConsumerStatsSnapshot afterHeartbeat = snapshot(consumer);
            assertEquals(1L, afterHeartbeat.getOperational().get().getHeartbeatFailureTotal());
            return;
        }
        throw new AssertionError("unchecked heartbeat failure must be rethrown");
    }

    private static ConsumerImpl newConsumer(MetricsLevel level, LogProcessor processor) throws Exception {
        ConsumerConfig config = new ConsumerConfig("http://endpoint", "region", "ak", "sk");
        config.setProjectID("project");
        config.setConsumerGroupName("group");
        config.setConsumerName("consumer");
        config.setTopicIDList(Collections.singletonList("topic"));
        config.setHeartbeatIntervalInSecond(1);
        config.setDataFetchIntervalInMillisecond(10);
        config.setFlushCheckpointIntervalInSecond(1);
        config.setStopTimeout(1);
        config.setMetricsLevel(level);
        return new ConsumerImpl(config, processor);
    }

    private static TLSLogClient client(PutLogRequest.LogGroupList batch, CountDownLatch entered,
                                       CountDownLatch release) {
        InvocationHandler handler = (proxy, method, args) -> {
            if ("consumeLogs".equals(method.getName())) {
                if (entered != null) {
                    entered.countDown();
                    await(release);
                }
                ConsumeLogsResponse response = new ConsumeLogsResponse();
                response.setLogGroupList(batch);
                response.setXTlsCursor("cursor-next");
                return response;
            }
            if ("toString".equals(method.getName())) return "ConsumerOperationBoundaryClient";
            if ("hashCode".equals(method.getName())) return System.identityHashCode(proxy);
            if ("equals".equals(method.getName())) return proxy == args[0];
            Class<?> type = method.getReturnType();
            if (type == boolean.class) return false;
            if (type == int.class) return 0;
            if (type == long.class) return 0L;
            return null;
        };
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, handler);
    }

    private static TLSLogClient errorClient() {
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if ("consumeLogs".equals(method.getName())
                            || "consumerHeartbeat".equals(method.getName())) {
                        throw new AssertionError("synthetic unchecked client failure");
                    }
                    if ("toString".equals(method.getName())) return "UncheckedFailureClient";
                    if ("hashCode".equals(method.getName())) return System.identityHashCode(proxy);
                    if ("equals".equals(method.getName())) return proxy == args[0];
                    Class<?> type = method.getReturnType();
                    if (type == boolean.class) return false;
                    if (type == int.class) return 0;
                    if (type == long.class) return 0L;
                    return null;
                });
    }

    private static PutLogRequest.LogGroupList batch() {
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder()
                .setSource("source").setFileName("file")
                .addLogs(PutLogRequest.Log.newBuilder().setTime(1)).build();
        return PutLogRequest.LogGroupList.newBuilder().addLogGroups(group).build();
    }

    private static void injectClient(ConsumerImpl consumer, TLSLogClient client) throws Exception {
        Field field = ConsumerImpl.class.getDeclaredField("tlsClient");
        field.setAccessible(true);
        field.set(consumer, client);
    }

    private static ConsumerStatsSnapshot snapshot(ConsumerImpl consumer) {
        return consumer.getStats(StatsOptions.operational());
    }

    private static void invoke(LogConsumer worker, String method, AtomicReference<Throwable> failure) {
        try {
            Method target = LogConsumer.class.getDeclaredMethod(method);
            target.setAccessible(true);
            target.invoke(worker);
        } catch (Throwable error) {
            failure.compareAndSet(null, error);
        }
    }

    private static void await(CountDownLatch latch) {
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
