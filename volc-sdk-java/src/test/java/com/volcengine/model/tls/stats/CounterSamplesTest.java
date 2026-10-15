package com.volcengine.model.tls.stats;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class CounterSamplesTest {
    private static final Set<String> PRODUCER_KEYS = new HashSet<>(Arrays.asList(
            "accepted_logs_total", "accepted_groups_total",
            "terminal_success_logs_total", "terminal_failure_logs_total",
            "terminal_dropped_logs_total", "terminal_success_groups_total",
            "terminal_failure_groups_total", "terminal_dropped_groups_total",
            "send_calls_success_total", "send_calls_failure_total",
            "send_call_payload_logs_total", "send_call_payload_groups_total",
            "retries_scheduled_total", "rejected_invalid_argument_total",
            "rejected_memory_full_total", "rejected_managed_admission_total",
            "rejected_closed_total", "rejected_circuit_open_total"));

    private static final Set<String> CONSUMER_KEYS = new HashSet<>(Arrays.asList(
            "fetch_calls_success_total", "fetch_calls_failure_total",
            "fetched_logs_total", "fetched_groups_total",
            "process_attempts_success_total", "process_attempts_failure_total",
            "processed_success_logs_total", "processed_success_groups_total",
            "checkpoint_calls_success_total", "checkpoint_calls_failure_total",
            "heartbeat_calls_success_total", "heartbeat_calls_failure_total",
            "rebalance_total"));

    @Test
    public void producerUsesFixedKeysSameHeaderAndOperationalJsonValues() {
        ProducerStatsSnapshot snapshot = producer(StatsView.OPERATIONAL);
        CounterSample sample = CounterSamples.from(snapshot);

        assertSame(snapshot.getHeader(), sample.getHeader());
        assertEquals(PRODUCER_KEYS, sample.getCounters().keySet());
        assertEquals(18, sample.getCounters().size());
        assertValuesMatchOperationalJson(snapshot, sample.getCounters(), PRODUCER_KEYS);
        assertEquals(Long.valueOf(5L), sample.getCounters().get("rejected_managed_admission_total"));
        assertFalse(sample.getCounters().containsKey("rejected_batch_inflight_limit_total"));
        assertFalse(sample.getCounters().containsKey("rejected_internal_total"));
    }

    @Test
    public void consumerUsesFixedKeysAndNormalHandlerOutcomeCounters() {
        ConsumerStatsSnapshot snapshot = consumer(StatsView.OPERATIONAL);
        CounterSample sample = CounterSamples.from(snapshot);

        assertSame(snapshot.getHeader(), sample.getHeader());
        assertEquals(CONSUMER_KEYS, sample.getCounters().keySet());
        assertEquals(13, sample.getCounters().size());
        assertValuesMatchOperationalJson(snapshot, sample.getCounters(), CONSUMER_KEYS);
        assertEquals(Long.valueOf(7L), sample.getCounters().get("process_attempts_success_total"));
        assertEquals(Long.valueOf(3L), sample.getCounters().get("process_attempts_failure_total"));
        assertEquals(Long.valueOf(17L), sample.getCounters().get("processed_success_logs_total"));
        assertEquals(Long.valueOf(7L), sample.getCounters().get("processed_success_groups_total"));
    }

    @Test
    public void nonOperationalViewsProduceUnavailableSamplesWithoutZeroFill() {
        ProducerStatsSnapshot producer = producer(StatsView.HEALTH);
        CounterSample producerSample = CounterSamples.from(producer);
        assertSame(producer.getHeader(), producerSample.getHeader());
        assertTrue(producerSample.getCounters() == null);

        ConsumerStatsSnapshot consumer = consumer(StatsView.HEALTH);
        CounterSample consumerSample = CounterSamples.from(consumer);
        assertSame(consumer.getHeader(), consumerSample.getHeader());
        assertTrue(consumerSample.getCounters() == null);
    }

    private static void assertValuesMatchOperationalJson(StatsSnapshot snapshot,
                                                         Map<String, Long> actual,
                                                         Set<String> keys) {
        JSONObject root = JSON.parseObject(snapshot.toJson());
        JSONObject operational = root.getJSONObject("operational");
        JSONObject counters = operational.getJSONObject("counters");
        for (String key : keys) {
            assertTrue("operational JSON missing " + key, counters.containsKey(key));
            assertEquals(key, Long.valueOf(counters.getLongValue(key)), actual.get(key));
        }
    }

    private static ProducerStatsSnapshot producer(StatsView view) {
        ProducerHealthSignals health = new ProducerHealthSignals(
                null, null, 0D, 0D, 0D, null, new WorkerSummary(0L, 0L, 0L, 0L),
                Collections.<CriticalFlag>emptyList());
        ProducerOperationalStats operational = ProducerOperationalStats.builder()
                .acceptedLogsTotal(101L).terminalSuccessLogsTotal(61L)
                .terminalFailureLogsTotal(20L).terminalDroppedLogsTotal(5L)
                .acceptedGroupsTotal(201L).terminalSuccessGroupsTotal(121L)
                .terminalFailureGroupsTotal(40L).terminalDroppedGroupsTotal(10L)
                .rejectedInvalidArgumentTotal(2L)
                .rejectedMemoryFullTotal(4L).rejectedManagedAdmissionTotal(5L)
                .rejectedClosedTotal(6L).rejectedCircuitOpenTotal(7L)
                .sendCallsSuccessTotal(9L)
                .sendCallsFailureTotal(10L).sendCallPayloadLogsTotal(11L)
                .sendCallPayloadGroupsTotal(12L).retriesScheduledTotal(13L)
                .sendQueue(new QueueSummary(0L, 10L, 10L, true))
                .retryQueue(new QueueSummary(0L, null, 0L, false))
                .workers(new WorkerSummary(0L, 0L, 0L, 0L)).build();
        SnapshotHeader header = header("producer-instance", ComponentType.PRODUCER, view,
                Capability.HEALTH | Capability.OPERATIONAL);
        return new ProducerStatsSnapshot(header, health, operational, null, null, null, null, null);
    }

    private static ConsumerStatsSnapshot consumer(StatsView view) {
        ConsumerHealthSignals health = new ConsumerHealthSignals(
                1L, 3L, new WorkerSummary(0L, 0L, 0L, 0L),
                Collections.<CriticalFlag>emptyList());
        ConsumerOperationalStats operational = ConsumerOperationalStats.builder()
                .fetchSuccessTotal(11L).fetchFailureTotal(2L)
                .fetchedLogsTotal(41L).fetchedLogGroupsTotal(31L)
                .handlerNormalReturnsTotal(7L).handlerExceptionReturnsTotal(3L)
                .handlerReturnedLogsTotal(17L).handlerReturnedGroupsTotal(7L)
                .checkpointSuccessTotal(4L).checkpointFailureTotal(1L)
                .heartbeatSuccessTotal(5L).heartbeatFailureTotal(1L)
                .rebalanceTotal(9L).assignedShards(1).heldBatchReferences(3L)
                .readyToProcess(1L).fetchInFlight(0).processInFlight(0)
                .checkpointPending(new QueueSummary(0L, null, 0L, false))
                .workers(new WorkerSummary(0L, 0L, 0L, 0L)).build();
        SnapshotHeader header = header("consumer-instance", ComponentType.CONSUMER, view,
                Capability.HEALTH | Capability.OPERATIONAL);
        return new ConsumerStatsSnapshot(header, health, operational, null, null, null);
    }

    private static SnapshotHeader header(String instance, ComponentType component, StatsView view,
                                         long capabilities) {
        return new SnapshotHeader(instance, component, 20_000L, 10_000L, 4L,
                LifecycleState.RUNNING, Consistency.WEAK, MetricsLevel.CORE, view,
                false, capabilities, Collections.<MissingSection>emptyList(), 2L, 1_000L);
    }

}
