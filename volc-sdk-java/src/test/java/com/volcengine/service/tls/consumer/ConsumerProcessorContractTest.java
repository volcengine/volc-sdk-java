package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.request.ConsumeLogsRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.service.tls.TLSLogClient;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ConsumerProcessorContractTest {
    @Test
    public void configuredProcessorIsUsedOnEveryFetchRegardlessOfOrigin() throws Exception {
        for (boolean origin : new boolean[]{true, false}) {
            ConsumerConfig config = config();
            config.setOrigin(origin);
            config.setProcessorId(" processor-id ");
            List<ConsumeLogsRequest> requests = fetchTwice(config);
            assertEquals(2, requests.size());
            for (ConsumeLogsRequest request : requests) {
                assertEquals(" processor-id ", request.getProcessorId());
                assertEquals(Boolean.FALSE, request.isOrigin());
                assertEquals("topic", request.getTopicId());
                assertEquals(Integer.valueOf(2), request.getShardId());
                assertEquals("group", request.getConsumerGroupName());
                assertEquals("consumer", request.getConsumerName());
            }
            assertEquals("next", requests.get(1).getCursor());
        }
    }

    @Test
    public void missingOrEmptyProcessorKeepsConfiguredOrigin() throws Exception {
        for (String id : new String[]{null, ""}) {
            for (boolean origin : new boolean[]{true, false}) {
                ConsumerConfig config = config();
                config.setOrigin(origin);
                config.setProcessorId(id);
                for (ConsumeLogsRequest request : fetchTwice(config)) {
                    assertTrue(request.getProcessorId() == null || request.getProcessorId().isEmpty());
                    assertEquals(Boolean.valueOf(origin), request.isOrigin());
                }
            }
        }
    }

    private static ConsumerConfig config() throws Exception {
        ConsumerConfig config = new ConsumerConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        config.setProjectID("project");
        config.setTopicIDList(Collections.singletonList("topic"));
        config.setConsumerGroupName("group");
        config.setConsumerName("consumer");
        return config;
    }

    private static List<ConsumeLogsRequest> fetchTwice(ConsumerConfig config) throws Exception {
        ConsumerImpl owner = new ConsumerImpl(config, (topic, shard, logs) -> { });
        owner.tlsClient.close();
        List<ConsumeLogsRequest> requests = new ArrayList<>();
        owner.tlsClient = (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if ("consumeLogs".equals(method.getName())) {
                        requests.add((ConsumeLogsRequest) args[0]);
                        ConsumeLogsResponse response = new ConsumeLogsResponse();
                        response.setXTlsCursor("next");
                        return response;
                    }
                    throw new AssertionError("Unexpected client call: " + method.getName());
                });
        LogConsumer worker = new LogConsumer(owner, new ConsumeShard("topic", 2));
        Method fetch = LogConsumer.class.getDeclaredMethod("fetchData");
        fetch.setAccessible(true);
        fetch.invoke(worker);
        fetch.invoke(worker);
        return requests;
    }
}
