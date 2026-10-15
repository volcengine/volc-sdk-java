package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ConsumerOffFastPathTest {
    @Test
    public void offLargeBatchHasNoObservationSlotCasOrTimingState() throws Exception {
        PutLogRequest.LogGroupList batch = largeBatch(128, 128);
        AtomicInteger processed = new AtomicInteger();
        ConsumerImpl consumer = newConsumer((topicID, shardID, logs) -> {
            assertSame(batch, logs);
            processed.incrementAndGet();
        });
        TLSLogClient client = largeBatchClient(batch);
        setField(consumer, "tlsClient", client);
        consumer.executor = Executors.newSingleThreadExecutor();
        LogConsumer worker = new LogConsumer(consumer, new ConsumeShard("topic", 0));

        Field enabled = LogConsumer.class.getDeclaredField("metricsEnabled");
        enabled.setAccessible(true);
        assertTrue("OFF decision must be frozen at construction", Modifier.isFinal(enabled.getModifiers()));
        assertEquals(Boolean.FALSE, enabled.get(worker));
        assertNull("OFF must not allocate a batch ledger slot", field(worker, "batchSlot"));
        assertNull("OFF must not allocate held-batch CAS state", field(worker, "held"));

        invoke(worker, "fetchData");
        assertSame("business payload must still be fetched", batch,
                field(worker, "currLogGroupList"));
        assertEquals("business cursor must still advance", "cursor-next",
                field(worker, "nextCheckpoint"));
        assertEquals("OFF must not record dispatch timing", 0L,
                field(worker, "dispatchStartNanos"));

        invoke(worker, "consume");
        assertEquals("business handler must still run exactly once", 1, processed.get());
        assertFalse(consumer.getStats(StatsOptions.debug()).getHealth().isPresent());

        assertTrue(worker.stop());
        consumer.executor.shutdown();
        assertTrue(consumer.executor.awaitTermination(3, TimeUnit.SECONDS));
    }

    private static ConsumerImpl newConsumer(LogProcessor processor) throws Exception {
        ConsumerConfig config = new ConsumerConfig("http://endpoint", "region", "ak", "sk");
        config.setProjectID("project");
        config.setConsumerGroupName("group");
        config.setConsumerName("consumer");
        config.setTopicIDList(Collections.singletonList("topic"));
        config.setHeartbeatIntervalInSecond(1);
        config.setFlushCheckpointIntervalInSecond(1);
        config.setStopTimeout(1);
        config.setMetricsLevel(MetricsLevel.OFF);
        return new ConsumerImpl(config, processor);
    }

    private static TLSLogClient largeBatchClient(PutLogRequest.LogGroupList batch) {
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if ("consumeLogs".equals(method.getName())) {
                        ConsumeLogsResponse response = new ConsumeLogsResponse();
                        response.setLogGroupList(batch);
                        response.setXTlsCursor("cursor-next");
                        return response;
                    }
                    if ("toString".equals(method.getName())) return "LargeBatchClient";
                    if ("hashCode".equals(method.getName())) return System.identityHashCode(proxy);
                    if ("equals".equals(method.getName())) return proxy == args[0];
                    Class<?> type = method.getReturnType();
                    if (type == boolean.class) return false;
                    if (type == int.class) return 0;
                    if (type == long.class) return 0L;
                    return null;
                });
    }

    private static PutLogRequest.LogGroupList largeBatch(int groups, int logsPerGroup) {
        PutLogRequest.LogGroupList.Builder list = PutLogRequest.LogGroupList.newBuilder();
        for (int groupIndex = 0; groupIndex < groups; groupIndex++) {
            PutLogRequest.LogGroup.Builder group = PutLogRequest.LogGroup.newBuilder();
            for (int logIndex = 0; logIndex < logsPerGroup; logIndex++) {
                group.addLogs(PutLogRequest.Log.newBuilder().setTime(logIndex));
            }
            list.addLogGroups(group);
        }
        return list.build();
    }

    private static Object field(Object target, String name) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field.get(target);
    }

    private static void setField(Object target, String name, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }

    private static void invoke(Object target, String name) throws Exception {
        Method method = target.getClass().getDeclaredMethod(name);
        method.setAccessible(true);
        method.invoke(target);
    }
}
