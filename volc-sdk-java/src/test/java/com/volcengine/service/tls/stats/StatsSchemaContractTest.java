package com.volcengine.service.tls.stats;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.stats.CounterSamples;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.StatsView;
import org.junit.Test;
import static org.junit.Assert.*;

/** Wire-contract checks pinned to Go MR1689 5d79e28b232ad388121955d48a6d08858c2642f2. */
public class StatsSchemaContractTest {
    private static final StatsClock CLOCK = new StatsClock() {
        public long nanoTime() { return 1_000_000_000L; }
        public long currentTimeMillis() { return 123456789L; }
    };

    @Test public void producerCollectionAndViewMatrixUsesStableCapabilities() {
        Long capabilities = null;
        for (MetricsLevel level : MetricsLevel.values()) {
            ProducerStatsState state = new ProducerStatsState(level, 2,
                    new MemoryLimiter(1000, 800, level != MetricsLevel.OFF), "producer-test", CLOCK);
            for (StatsView view : StatsView.values()) {
                ProducerStatsSnapshot snapshot = state.snapshot(new StatsOptions(view));
                JSONObject json = JSON.parseObject(snapshot.toJson());
                assertHeader(json, level, view, "producer");
                assertEquals(level, snapshot.getHeader().getCollectedLevel());
                assertEquals(view, snapshot.getHeader().getRequestedView());
                assertEquals(level == MetricsLevel.OFF ||
                                (level == MetricsLevel.CORE && view == StatsView.DEBUG),
                        snapshot.getHeader().isPartial());
                if (capabilities == null) capabilities = json.getLong("capabilities");
                assertEquals(capabilities, json.getLong("capabilities"));
                assertTrue((capabilities & (1L << 7)) != 0); // runtime level change
                assertTrue((capabilities & (1L << 6)) != 0); // managed memory
                assertEquals(level != MetricsLevel.OFF, json.containsKey("health"));
                assertEquals(level != MetricsLevel.OFF, snapshot.getHealth().isPresent());
                assertEquals(level != MetricsLevel.OFF, json.containsKey("managed_memory"));
                assertEquals(level != MetricsLevel.OFF && view != StatsView.HEALTH,
                        json.containsKey("operational"));
                assertEquals(level != MetricsLevel.OFF && view != StatsView.HEALTH,
                        snapshot.getOperational().isPresent());
                boolean detailed = level == MetricsLevel.DETAILED && view == StatsView.DEBUG;
                assertEquals(detailed, json.containsKey("worker_details"));
                assertEquals(detailed, json.containsKey("retry_details"));
                assertEquals(detailed, json.containsKey("latency_histograms"));
                assertEquals(detailed, snapshot.getLatencyHistograms().isPresent());
                assertEquals(detailed, json.containsKey("memory_breakdown"));
                assertFalse(json.containsKey("debug"));
                if (json.containsKey("health")) {
                    JSONObject signals = json.getJSONObject("health").getJSONObject("signals");
                    assertNotNull(signals);
                    assertFalse(signals.containsKey("accepted_logs_total"));
                    assertFalse("unbounded queues have no utilization denominator",
                            signals.containsKey("queue_pressure"));
                    assertNotNull(signals.getJSONObject("worker_summary"));
                }
                if (json.containsKey("operational")) {
                    assertNotNull(json.getJSONObject("operational").getJSONObject("counters"));
                    assertEquals(CounterSamples.from(snapshot).getCounters().keySet(),
                            json.getJSONObject("operational").getJSONObject("counters").keySet());
                }
                if (detailed) assertWorkerItems(json);
            }
        }
    }

    @Test public void consumerDoesNotClaimOrMissProducerMemorySections() {
        Long capabilities = null;
        for (MetricsLevel level : MetricsLevel.values()) {
            ConsumerStatsState state = new ConsumerStatsState(level, 2, "consumer-test", CLOCK);
            for (StatsView view : StatsView.values()) {
                JSONObject json = JSON.parseObject(state.snapshot(new StatsOptions(view)).toJson());
                assertHeader(json, level, view, "consumer");
                if (capabilities == null) capabilities = json.getLong("capabilities");
                assertEquals(capabilities, json.getLong("capabilities"));
                assertEquals(0, capabilities & ((1L << 5) | (1L << 6) | (1L << 8)));
                assertFalse(json.containsKey("managed_memory"));
                assertFalse(json.containsKey("memory_breakdown"));
                assertFalse(json.containsKey("batch_inflight_memory_gate"));
                if (json.containsKey("missing_sections")) {
                    assertFalse(json.getJSONArray("missing_sections").contains("managed_memory"));
                    assertFalse(json.getJSONArray("missing_sections").contains("memory_breakdown"));
                }
                assertEquals(level != MetricsLevel.OFF, json.containsKey("health"));
                assertEquals(level != MetricsLevel.OFF && view != StatsView.HEALTH,
                        json.containsKey("operational"));
                assertFalse(json.containsKey("debug"));
                if (level == MetricsLevel.DETAILED && view == StatsView.DEBUG) assertWorkerItems(json);
            }
        }
    }

    private static void assertWorkerItems(JSONObject snapshot) {
        for (Object item : snapshot.getJSONObject("worker_details").getJSONArray("items")) {
            JSONObject worker = (JSONObject) item;
            assertEquals(new java.util.HashSet<String>(java.util.Arrays.asList(
                    "role", "expected", "running", "in_flight")), worker.keySet());
        }
    }

    @Test public void consumerCountsMissingRolesNotMissingThreadsInBothSections() {
        ConsumerStatsState state = new ConsumerStatsState(MetricsLevel.DETAILED, 2,
                "consumer-role-count", CLOCK);
        state.markStarted();
        state.onAssignment(3, false);
        state.onShardWorkerStarted();
        JSONObject snapshot = JSON.parseObject(state.snapshot(StatsOptions.debug()).toJson());
        JSONObject healthWorkers = snapshot.getJSONObject("health").getJSONObject("signals")
                .getJSONObject("worker_summary");
        JSONObject operationalWorkers = snapshot.getJSONObject("operational").getJSONObject("workers");
        assertEquals(8, healthWorkers.getLongValue("expected"));
        assertEquals(1, healthWorkers.getLongValue("running"));
        assertEquals("main, heartbeat, checkpoint and shard are four deficient roles, not seven threads",
                4, healthWorkers.getLongValue("missing_critical_roles"));
        assertEquals(healthWorkers, operationalWorkers);
    }

    @Test public void memoryPressureSeparatesLifecycleTotalAndPayloadAdmission() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(100, 80, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.CORE, 1, limiter, "memory", CLOCK);
        assertTrue(limiter.acquireTemporary(90, 0));
        JSONObject signals = JSON.parseObject(state.snapshot(StatsOptions.health()).toJson())
                .getJSONObject("health").getJSONObject("signals");
        assertEquals(0.9D, signals.getDoubleValue("managed_memory_pressure"), 0D);
        assertEquals(1.125D, signals.getDoubleValue("memory_pressure"), 0D);
        assertEquals("managed_payload_admission", signals.getString("memory_pressure_source"));
        limiter.releaseTemporary(90);
        signals = JSON.parseObject(state.snapshot(StatsOptions.health()).toJson())
                .getJSONObject("health").getJSONObject("signals");
        assertFalse(signals.containsKey("memory_pressure_source"));
    }

    @Test public void retryDetailsUsesCoreCounterAndSameCapturedQueue() {
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.CORE, 1,
                new MemoryLimiter(1000, 800, true), "retry", CLOCK);
        state.markStarted();
        state.onRetryScheduled();
        state.setMetricsLevel(MetricsLevel.DETAILED);
        JSONObject snapshot = JSON.parseObject(state.snapshot(StatsOptions.debug()).toJson());
        JSONObject retry = snapshot.getJSONObject("retry_details");
        assertEquals(1, retry.getLongValue("retries_scheduled_total"));
        assertEquals(snapshot.getJSONObject("operational").getJSONObject("retry_queue"),
                retry.getJSONObject("queue"));
    }

    private static void assertHeader(JSONObject json, MetricsLevel level, StatsView view, String component) {
        assertEquals(2, json.getIntValue("schema_version"));
        assertEquals("volc-sdk-java", json.getString("sdk_name"));
        assertEquals("java", json.getString("sdk_language"));
        assertNotNull(json.getString("sdk_version"));
        assertFalse(json.getString("sdk_version").isEmpty());
        assertEquals(component, json.getString("component_type"));
        assertTrue(json.get("collected_level") instanceof Number);
        assertTrue(json.get("requested_view") instanceof Number);
        assertEquals(level.getCode(), json.getIntValue("collected_level"));
        assertEquals(view.getCode(), json.getIntValue("requested_view"));
        assertTrue(json.getLongValue("collection_generation") > 0);
        assertEquals(level == MetricsLevel.OFF ? 0 : CLOCK.currentTimeMillis(),
                json.getLongValue("collection_started_at_unix_ms"));
    }
}
