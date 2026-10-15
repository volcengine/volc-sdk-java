package com.volcengine.model.tls.stats;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/** Projects only the operational section into the fixed counter contract. */
public final class CounterSamples {
    private CounterSamples() { }

    /** Does not fetch or synthesize another snapshot. */
    public static CounterSample from(StatsSnapshot snapshot) {
        if (snapshot == null || snapshot.getHeader() == null) {
            throw new IllegalArgumentException("snapshot and header must not be null");
        }
        if (snapshot instanceof ProducerStatsSnapshot) {
            return producer((ProducerStatsSnapshot) snapshot);
        }
        if (snapshot instanceof ConsumerStatsSnapshot) {
            return consumer((ConsumerStatsSnapshot) snapshot);
        }
        throw new IllegalArgumentException("unsupported stats snapshot type");
    }

    private static CounterSample producer(ProducerStatsSnapshot snapshot) {
        Optional<ProducerOperationalStats> value = snapshot.getOperational();
        if (!value.isPresent()) return unavailable(snapshot);
        ProducerOperationalStats o = value.get();
        Map<String, Long> counters = new LinkedHashMap<>();
        counters.put("accepted_logs_total", o.getAcceptedLogsTotal());
        counters.put("accepted_groups_total", o.getAcceptedGroupsTotal());
        counters.put("terminal_success_logs_total", o.getTerminalSuccessLogsTotal());
        counters.put("terminal_failure_logs_total", o.getTerminalFailureLogsTotal());
        counters.put("terminal_dropped_logs_total", o.getTerminalDroppedLogsTotal());
        counters.put("terminal_success_groups_total", o.getTerminalSuccessGroupsTotal());
        counters.put("terminal_failure_groups_total", o.getTerminalFailureGroupsTotal());
        counters.put("terminal_dropped_groups_total", o.getTerminalDroppedGroupsTotal());
        counters.put("send_calls_success_total", o.getSendCallsSuccessTotal());
        counters.put("send_calls_failure_total", o.getSendCallsFailureTotal());
        counters.put("send_call_payload_logs_total", o.getSendCallPayloadLogsTotal());
        counters.put("send_call_payload_groups_total", o.getSendCallPayloadGroupsTotal());
        counters.put("retries_scheduled_total", o.getRetriesScheduledTotal());
        counters.put("rejected_invalid_argument_total", o.getRejectedInvalidArgumentTotal());
        counters.put("rejected_memory_full_total", o.getRejectedMemoryFullTotal());
        counters.put("rejected_managed_admission_total", o.getRejectedManagedAdmissionTotal());
        counters.put("rejected_closed_total", o.getRejectedClosedTotal());
        counters.put("rejected_circuit_open_total", o.getRejectedCircuitOpenTotal());
        return new CounterSample(snapshot.getHeader(), counters);
    }

    private static CounterSample consumer(ConsumerStatsSnapshot snapshot) {
        Optional<ConsumerOperationalStats> value = snapshot.getOperational();
        if (!value.isPresent()) return unavailable(snapshot);
        ConsumerOperationalStats o = value.get();
        Map<String, Long> counters = new LinkedHashMap<>();
        counters.put("fetch_calls_success_total", o.getFetchSuccessTotal());
        counters.put("fetch_calls_failure_total", o.getFetchFailureTotal());
        counters.put("fetched_logs_total", o.getFetchedLogsTotal());
        counters.put("fetched_groups_total", o.getFetchedLogGroupsTotal());
        counters.put("process_attempts_success_total", o.getHandlerNormalReturnsTotal());
        counters.put("process_attempts_failure_total", o.getHandlerExceptionReturnsTotal());
        counters.put("processed_success_logs_total", o.getHandlerReturnedLogsTotal());
        counters.put("processed_success_groups_total", o.getHandlerReturnedGroupsTotal());
        counters.put("checkpoint_calls_success_total", o.getCheckpointSuccessTotal());
        counters.put("checkpoint_calls_failure_total", o.getCheckpointFailureTotal());
        counters.put("heartbeat_calls_success_total", o.getHeartbeatSuccessTotal());
        counters.put("heartbeat_calls_failure_total", o.getHeartbeatFailureTotal());
        counters.put("rebalance_total", o.getRebalanceTotal());
        return new CounterSample(snapshot.getHeader(), counters);
    }

    private static CounterSample unavailable(StatsSnapshot snapshot) {
        return new CounterSample(snapshot.getHeader(), null);
    }
}
