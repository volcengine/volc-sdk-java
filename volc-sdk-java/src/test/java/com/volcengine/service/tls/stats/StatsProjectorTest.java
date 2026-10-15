package com.volcengine.service.tls.stats;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.stats.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/** Projection and header contract checks. */
public class StatsProjectorTest {
    private static final long PRODUCER_CAPABILITIES = Capability.HEALTH | Capability.OPERATIONAL
            | Capability.WORKER_DETAILS | Capability.RETRY_DETAILS | Capability.LATENCY
            | Capability.MEMORY_BREAKDOWN | Capability.MANAGED | Capability.RUNTIME_LEVEL_CHANGE;
    private static final long CONSUMER_CAPABILITIES = Capability.HEALTH | Capability.OPERATIONAL
            | Capability.WORKER_DETAILS | Capability.RETRY_DETAILS | Capability.LATENCY
            | Capability.RUNTIME_LEVEL_CHANGE;

    @Test(expected = IllegalArgumentException.class)
    public void statsOptionsRejectsNullView() {
        new StatsOptions(null);
    }

    @Test
    public void producerOffDebugUsesStableCapabilitiesAndGoMissingOrder() {
        SnapshotAnchor anchor = anchor(ComponentType.PRODUCER, MetricsLevel.OFF, PRODUCER_CAPABILITIES);
        ProducerStatsSnapshot snapshot = StatsProjector.producer(anchor, null, null,
                null, null, null, null, null, StatsOptions.debug());
        assertTrue(snapshot.getHeader().isMetricsDisabled());
        assertTrue(snapshot.getHeader().isPartial());
        assertEquals(Arrays.asList(MissingSection.HEALTH, MissingSection.OPERATIONAL,
                MissingSection.MANAGED_MEMORY, MissingSection.WORKER_DETAILS,
                MissingSection.RETRY_DETAILS, MissingSection.LATENCY_HISTOGRAMS,
                MissingSection.MEMORY_BREAKDOWN), snapshot.getHeader().getMissingSections());
        JSONObject json = JSON.parseObject(snapshot.toJson());
        assertEquals(2, json.getIntValue("schema_version"));
        assertEquals(0, json.getIntValue("collected_level"));
        assertEquals(2, json.getIntValue("requested_view"));
        assertEquals(PRODUCER_CAPABILITIES, json.getLongValue("capabilities"));
        assertFalse(json.containsKey("health"));
        assertFalse(json.containsKey("operational"));
        assertFalse(json.containsKey("debug"));
    }

    @Test
    public void producerCoreDebugOmitsOnlyDetailedSections() {
        SnapshotAnchor anchor = anchor(ComponentType.PRODUCER, MetricsLevel.CORE, PRODUCER_CAPABILITIES);
        ProducerStatsSnapshot snapshot = StatsProjector.producer(anchor, producerHealth(), producerOperational(),
                producerMemory(), null, null, null, null, StatsOptions.debug());
        assertTrue(snapshot.getHeader().isPartial());
        assertEquals(Arrays.asList(MissingSection.WORKER_DETAILS, MissingSection.RETRY_DETAILS,
                MissingSection.LATENCY_HISTOGRAMS, MissingSection.MEMORY_BREAKDOWN),
                snapshot.getHeader().getMissingSections());
        assertTrue(snapshot.getHealth().isPresent());
        assertTrue(snapshot.getOperational().isPresent());
        assertTrue(snapshot.getManagedMemory().isPresent());
        assertFalse(snapshot.getWorkerDetails().isPresent());
    }

    @Test
    public void producerDetailedDebugFlattensSections() {
        SnapshotAnchor anchor = anchor(ComponentType.PRODUCER, MetricsLevel.DETAILED, PRODUCER_CAPABILITIES);
        ProducerStatsSnapshot snapshot = StatsProjector.producer(anchor, producerHealth(), producerOperational(),
                producerMemory(), producerWorkerDetails(), producerRetry(), producerLatency(),
                producerMemoryBreakdown(), StatsOptions.debug());
        assertFalse(snapshot.getHeader().isPartial());
        JSONObject json = JSON.parseObject(snapshot.toJson());
        assertTrue(json.containsKey("health"));
        assertTrue(json.containsKey("operational"));
        assertTrue(json.containsKey("managed_memory"));
        assertTrue(json.containsKey("worker_details"));
        assertTrue(json.containsKey("retry_details"));
        assertTrue(json.containsKey("latency_histograms"));
        assertTrue(json.containsKey("memory_breakdown"));
        assertFalse(json.containsKey("debug"));
        assertEquals("fast_v1", json.getJSONObject("latency_histograms")
                .getJSONObject("batch_queue_delay").getJSONObject("histogram").getString("bucket_profile"));
    }

    @Test
    public void consumerUsesStableCapabilitiesAndNoProducerMemorySections() {
        SnapshotAnchor off = anchor(ComponentType.CONSUMER, MetricsLevel.OFF, CONSUMER_CAPABILITIES);
        ConsumerStatsSnapshot disabled = StatsProjector.consumer(off, null, null,
                null, null, null, StatsOptions.debug());
        assertEquals(Arrays.asList(MissingSection.HEALTH, MissingSection.OPERATIONAL,
                MissingSection.WORKER_DETAILS, MissingSection.RETRY_DETAILS,
                MissingSection.LATENCY_HISTOGRAMS), disabled.getHeader().getMissingSections());
        assertEquals(CONSUMER_CAPABILITIES, disabled.getHeader().getCapabilities());

        SnapshotAnchor detailed = anchor(ComponentType.CONSUMER, MetricsLevel.DETAILED,
                CONSUMER_CAPABILITIES);
        ConsumerStatsSnapshot snapshot = StatsProjector.consumer(detailed, consumerHealth(),
                consumerOperational(), consumerWorkerDetails(), consumerRetry(), consumerLatency(),
                StatsOptions.debug());
        JSONObject json = JSON.parseObject(snapshot.toJson());
        assertFalse(snapshot.getHeader().isPartial());
        assertFalse(json.containsKey("managed_memory"));
        assertFalse(json.containsKey("memory_breakdown"));
        assertFalse(json.containsKey("batch_inflight_memory_gate"));
        assertFalse(json.containsKey("debug"));
    }

    @Test
    public void headerAndSectionCollectionsAreDefensive() {
        ArrayList<MissingSection> missing = new ArrayList<>();
        SnapshotHeader header = new SnapshotHeader("i", ComponentType.PRODUCER, 1, 2, 3,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE, StatsView.HEALTH,
                false, PRODUCER_CAPABILITIES, missing, 9, 7);
        missing.add(MissingSection.HEALTH);
        assertTrue(header.getMissingSections().isEmpty());
        assertEquals(9, header.getCollectionGeneration());
        assertEquals(7, header.getCollectionStartedAtUnixMs());
        try {
            header.getMissingSections().add(MissingSection.HEALTH);
            fail("header list must be immutable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    private static SnapshotAnchor anchor(ComponentType component, MetricsLevel level, long caps) {
        return new SnapshotAnchor("instance", component, 100, 0, 1, LifecycleState.RUNNING,
                Consistency.WEAK, level, caps, 9, 7);
    }

    private static WorkerSummary workerSummary() { return new WorkerSummary(1, 1, 0, 0); }

    private static ProducerHealthSignals producerHealth() {
        return new ProducerHealthSignals(null, null, 0D, 0D, 0D, null, workerSummary(),
                Collections.<CriticalFlag>emptyList());
    }

    private static ProducerOperationalStats producerOperational() {
        return ProducerOperationalStats.builder()
                .sendQueue(new QueueSummary(0, null, 0, false))
                .retryQueue(new QueueSummary(0, null, 0, false))
                .workers(workerSummary()).build();
    }

    private static ManagedMemorySummary producerMemory() {
        return new ManagedMemorySummary(100, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    private static WorkerDetails producerWorkerDetails() {
        return new WorkerDetails(0, Collections.<WorkerDetail>emptyList());
    }

    private static ProducerRetryDetails producerRetry() {
        return new ProducerRetryDetails(new QueueSummary(0, null, 0, false), 0);
    }

    private static ProducerLatencyHistograms producerLatency() {
        return new ProducerLatencyHistograms(fastHistogram(), fastHistogram(),
                slowHistogram(), slowHistogram());
    }

    private static ManagedMemoryBreakdown producerMemoryBreakdown() {
        return new ManagedMemoryBreakdown(0, 0, 0, 0, 0);
    }

    private static HistogramSnapshot fastHistogram() {
        return new HistogramSnapshot("fast_v1", new long[14], 0, 0);
    }

    private static HistogramSnapshot slowHistogram() {
        return new HistogramSnapshot("slow_v1", new long[16], 0, 0);
    }

    private static ConsumerHealthSignals consumerHealth() {
        return new ConsumerHealthSignals(null, null, workerSummary(),
                Collections.<CriticalFlag>emptyList());
    }

    private static ConsumerOperationalStats consumerOperational() {
        return ConsumerOperationalStats.builder()
                .checkpointPending(new QueueSummary(0, null, 0, false))
                .workers(workerSummary()).build();
    }

    private static WorkerDetails consumerWorkerDetails() {
        return new WorkerDetails(0, Collections.<WorkerDetail>emptyList());
    }

    private static ConsumerRetryDetails consumerRetry() {
        return new ConsumerRetryDetails(0);
    }

    private static ConsumerLatencyHistograms consumerLatency() {
        return new ConsumerLatencyHistograms(fastHistogram(), fastHistogram(),
                slowHistogram(), slowHistogram());
    }
}
