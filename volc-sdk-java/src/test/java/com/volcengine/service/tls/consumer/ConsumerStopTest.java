package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.response.ConsumerHeartbeatResponse;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeConsumerGroupsResponse;
import com.volcengine.model.tls.response.DescribeCursorResponse;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ConsumerStopTest {
    @Test
    public void processorIgnoringInterruptCannotBeReportedAsStopped() throws Exception {
        CountDownLatch entered = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        ConsumerImpl consumer = newConsumer(new BlockingProcessor(entered, release),
                new FakeClient(null, null));
        consumer.start();
        assertTrue("processor did not start", entered.await(5, TimeUnit.SECONDS));

        long startedNanos = System.nanoTime();
        try {
            consumer.stop();
            fail("stop must report an executor that ignored interruption");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("still running"));
        } finally {
            release.countDown();
        }
        assertTrue("stop must remain bounded",
                TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startedNanos) < 8L);
        assertFailedFinalization(consumer);
        assertTrue("processor executor did not terminate after release",
                consumer.executor.awaitTermination(3, TimeUnit.SECONDS));
    }

    @Test
    public void heartbeatIgnoringInterruptCannotBeReportedAsStopped() throws Exception {
        CountDownLatch entered = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        ConsumerImpl consumer = newConsumer(new NoopProcessor(),
                new FakeClient(entered, release));
        consumer.start();
        assertTrue("heartbeat did not start", entered.await(5, TimeUnit.SECONDS));

        ScheduledExecutorService heartbeatExecutor = heartbeatExecutor(consumer);
        long startedNanos = System.nanoTime();
        try {
            consumer.stop();
            fail("stop must report a heartbeat worker that ignored interruption");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("still running"));
        } finally {
            release.countDown();
        }
        assertTrue("stop must remain bounded",
                TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startedNanos) < 7L);
        assertFailedFinalization(consumer);
        assertTrue("heartbeat executor did not terminate after release",
                heartbeatExecutor.awaitTermination(3, TimeUnit.SECONDS));
    }

    @Test
    public void cooperativeInterruptCompletesSecondPhaseCleanup() throws Exception {
        CountDownLatch entered = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        InterruptibleProcessor processor = new InterruptibleProcessor(entered, release);
        ConsumerImpl consumer = newConsumer(processor, new FakeClient(null, null));
        consumer.start();
        assertTrue("processor did not start", entered.await(5, TimeUnit.SECONDS));

        Map<String, LogConsumer> workers = workerMap(consumer);
        assertEquals(1, workers.size());
        LogConsumer worker = workers.values().iterator().next();
        assertNotNull("test requires a held payload", field(worker, "currLogGroupList"));

        try {
            consumer.stop();
        } finally {
            release.countDown();
        }

        assertTrue("processor must observe shutdownNow interruption", processor.interrupted);
        assertTrue("all terminal workers must be released", workers.isEmpty());
        assertEquals("payload must be released after true task termination", null,
                field(worker, "currLogGroupList"));
        ConsumerStatsSnapshot terminal = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, terminal.getHeader().getConsistency());
        assertEquals(LifecycleState.CLOSED, terminal.getHeader().getLifecycleState());
        assertFalse(terminal.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
        assertEquals(0, terminal.getOperational().get().getAssignedShards());
        assertEquals(0L, terminal.getOperational().get().getHeldBatchReferences());
        assertEquals(0L, terminal.getOperational().get().getReadyToProcess());
        assertEquals(0L, terminal.getOperational().get().getCheckpointPending().getCurrentItems());
        assertEquals(0, terminal.getOperational().get().getFetchInFlight());
        assertEquals(0, terminal.getOperational().get().getProcessInFlight());
    }

    private static void assertFailedFinalization(ConsumerImpl consumer) {
        ConsumerStatsSnapshot snapshot = consumer.getStats(StatsOptions.operational());
        assertEquals(Consistency.FINAL, snapshot.getHeader().getConsistency());
        assertEquals(LifecycleState.FAILED, snapshot.getHeader().getLifecycleState());
        assertTrue(snapshot.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    private static ConsumerImpl newConsumer(LogProcessor processor, FakeClient handler)
            throws Exception {
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
        HeartbeatTracker tracker = (HeartbeatTracker) trackerField.get(consumer);
        Field trackerClient = HeartbeatTracker.class.getDeclaredField("tlsClient");
        trackerClient.setAccessible(true);
        trackerClient.set(tracker, client);
    }

    private static ScheduledExecutorService heartbeatExecutor(ConsumerImpl consumer)
            throws Exception {
        Field trackerField = ConsumerImpl.class.getDeclaredField("heartbeatTracker");
        trackerField.setAccessible(true);
        HeartbeatTracker tracker = (HeartbeatTracker) trackerField.get(consumer);
        Field executorField = HeartbeatTracker.class.getDeclaredField("executorService");
        executorField.setAccessible(true);
        return (ScheduledExecutorService) executorField.get(tracker);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, LogConsumer> workerMap(ConsumerImpl consumer) throws Exception {
        return (Map<String, LogConsumer>) field(consumer, "workerMap");
    }

    private static Object field(Object target, String name) throws Exception {
        Field value = target.getClass().getDeclaredField(name);
        value.setAccessible(true);
        return value.get(target);
    }

    private static final class BlockingProcessor implements LogProcessor {
        private final CountDownLatch entered;
        private final CountDownLatch release;

        private BlockingProcessor(CountDownLatch entered, CountDownLatch release) {
            this.entered = entered;
            this.release = release;
        }

        public void process(String topicID, int shardID,
                            PutLogRequest.LogGroupList logGroupList) {
            entered.countDown();
            awaitIgnoringInterrupt(release);
        }
    }

    private static final class NoopProcessor implements LogProcessor {
        public void process(String topicID, int shardID,
                            PutLogRequest.LogGroupList logGroupList) {
        }
    }

    private static final class InterruptibleProcessor implements LogProcessor {
        private final CountDownLatch entered;
        private final CountDownLatch release;
        private volatile boolean interrupted;

        private InterruptibleProcessor(CountDownLatch entered, CountDownLatch release) {
            this.entered = entered;
            this.release = release;
        }

        public void process(String topicID, int shardID,
                            PutLogRequest.LogGroupList logGroupList) {
            entered.countDown();
            try {
                release.await();
            } catch (InterruptedException expected) {
                interrupted = true;
            }
        }
    }

    private static final class FakeClient implements InvocationHandler {
        private final CountDownLatch heartbeatEntered;
        private final CountDownLatch heartbeatRelease;

        private FakeClient(CountDownLatch heartbeatEntered, CountDownLatch heartbeatRelease) {
            this.heartbeatEntered = heartbeatEntered;
            this.heartbeatRelease = heartbeatRelease;
        }

        public Object invoke(Object proxy, Method method, Object[] args) {
            String name = method.getName();
            if ("describeConsumerGroups".equals(name)) {
                DescribeConsumerGroupsResponse response = new DescribeConsumerGroupsResponse();
                response.setConsumerGroups(new ArrayList<>());
                return response;
            }
            if ("consumerHeartbeat".equals(name)) {
                if (heartbeatEntered != null) {
                    heartbeatEntered.countDown();
                    awaitIgnoringInterrupt(heartbeatRelease);
                }
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
                        .setSource("source").setFileName("file")
                        .addLogs(PutLogRequest.Log.newBuilder().setTime(1));
                ConsumeLogsResponse response = new ConsumeLogsResponse();
                response.setLogGroupList(PutLogRequest.LogGroupList.newBuilder()
                        .addLogGroups(group).build());
                response.setXTlsCursor("cursor-next");
                return response;
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
