package com.volcengine.model.tls.stats;

/** Producer operational counters and bounded gauges. */
public final class ProducerOperationalStats {
    private final long acceptedLogsTotal;
    private final long acceptedGroupsTotal;
    private final long terminalSuccessLogsTotal;
    private final long terminalFailureLogsTotal;
    private final long terminalDroppedLogsTotal;
    private final long terminalSuccessGroupsTotal;
    private final long terminalFailureGroupsTotal;
    private final long terminalDroppedGroupsTotal;
    private final long sendCallsSuccessTotal;
    private final long sendCallsFailureTotal;
    private final long sendCallPayloadLogsTotal;
    private final long sendCallPayloadGroupsTotal;
    private final long retriesScheduledTotal;
    private final long rejectedInvalidArgumentTotal;
    private final long rejectedMemoryFullTotal;
    private final long rejectedManagedAdmissionTotal;
    private final long rejectedClosedTotal;
    private final long rejectedCircuitOpenTotal;
    private final QueueSummary sendQueue;
    private final QueueSummary retryQueue;
    private final Long aggregateBatches;
    private final Long aggregateGroups;
    private final Integer sendCallsInFlight;
    private final Long callbacksPending;
    private final Integer callbacksInFlight;
    private final WorkerSummary workers;

    private ProducerOperationalStats(Builder b) {
        if (b.workers == null) throw new IllegalArgumentException("producer workers are required");
        long[] values = {
                b.acceptedLogsTotal, b.acceptedGroupsTotal,
                b.terminalSuccessLogsTotal, b.terminalFailureLogsTotal, b.terminalDroppedLogsTotal,
                b.terminalSuccessGroupsTotal, b.terminalFailureGroupsTotal,
                b.terminalDroppedGroupsTotal, b.sendCallsSuccessTotal, b.sendCallsFailureTotal,
                b.sendCallPayloadLogsTotal, b.sendCallPayloadGroupsTotal, b.retriesScheduledTotal,
                b.rejectedInvalidArgumentTotal, b.rejectedMemoryFullTotal,
                b.rejectedManagedAdmissionTotal, b.rejectedClosedTotal,
                b.rejectedCircuitOpenTotal
        };
        for (long value : values) StatsValidation.nonNegative(value, "producer operational counter");
        StatsValidation.optionalNonNegative(b.aggregateBatches, "aggregateBatches");
        StatsValidation.optionalNonNegative(b.aggregateGroups, "aggregateGroups");
        StatsValidation.optionalNonNegative(b.callbacksPending, "callbacksPending");
        if (b.sendCallsInFlight != null) StatsValidation.nonNegative(b.sendCallsInFlight, "sendCallsInFlight");
        if (b.callbacksInFlight != null) StatsValidation.nonNegative(b.callbacksInFlight, "callbacksInFlight");
        this.acceptedLogsTotal = b.acceptedLogsTotal;
        this.acceptedGroupsTotal = b.acceptedGroupsTotal;
        this.terminalSuccessLogsTotal = b.terminalSuccessLogsTotal;
        this.terminalFailureLogsTotal = b.terminalFailureLogsTotal;
        this.terminalDroppedLogsTotal = b.terminalDroppedLogsTotal;
        this.terminalSuccessGroupsTotal = b.terminalSuccessGroupsTotal;
        this.terminalFailureGroupsTotal = b.terminalFailureGroupsTotal;
        this.terminalDroppedGroupsTotal = b.terminalDroppedGroupsTotal;
        this.sendCallsSuccessTotal = b.sendCallsSuccessTotal;
        this.sendCallsFailureTotal = b.sendCallsFailureTotal;
        this.sendCallPayloadLogsTotal = b.sendCallPayloadLogsTotal;
        this.sendCallPayloadGroupsTotal = b.sendCallPayloadGroupsTotal;
        this.retriesScheduledTotal = b.retriesScheduledTotal;
        this.rejectedInvalidArgumentTotal = b.rejectedInvalidArgumentTotal;
        this.rejectedMemoryFullTotal = b.rejectedMemoryFullTotal;
        this.rejectedManagedAdmissionTotal = b.rejectedManagedAdmissionTotal;
        this.rejectedClosedTotal = b.rejectedClosedTotal;
        this.rejectedCircuitOpenTotal = b.rejectedCircuitOpenTotal;
        this.sendQueue = b.sendQueue;
        this.retryQueue = b.retryQueue;
        this.aggregateBatches = b.aggregateBatches;
        this.aggregateGroups = b.aggregateGroups;
        this.sendCallsInFlight = b.sendCallsInFlight;
        this.callbacksPending = b.callbacksPending;
        this.callbacksInFlight = b.callbacksInFlight;
        this.workers = b.workers;
    }

    public static Builder builder() { return new Builder(); }

    public long getAcceptedLogsTotal() { return acceptedLogsTotal; }
    public long getAcceptedGroupsTotal() { return acceptedGroupsTotal; }
    public long getTerminalSuccessLogsTotal() { return terminalSuccessLogsTotal; }
    public long getTerminalFailureLogsTotal() { return terminalFailureLogsTotal; }
    public long getTerminalDroppedLogsTotal() { return terminalDroppedLogsTotal; }
    public long getTerminalSuccessGroupsTotal() { return terminalSuccessGroupsTotal; }
    public long getTerminalFailureGroupsTotal() { return terminalFailureGroupsTotal; }
    public long getTerminalDroppedGroupsTotal() { return terminalDroppedGroupsTotal; }
    public long getSendCallsSuccessTotal() { return sendCallsSuccessTotal; }
    public long getSendCallsFailureTotal() { return sendCallsFailureTotal; }
    public long getSendCallPayloadLogsTotal() { return sendCallPayloadLogsTotal; }
    public long getSendCallPayloadGroupsTotal() { return sendCallPayloadGroupsTotal; }
    public long getRetriesScheduledTotal() { return retriesScheduledTotal; }
    public long getRejectedInvalidArgumentTotal() { return rejectedInvalidArgumentTotal; }
    public long getRejectedMemoryFullTotal() { return rejectedMemoryFullTotal; }
    public long getRejectedManagedAdmissionTotal() { return rejectedManagedAdmissionTotal; }
    public long getRejectedClosedTotal() { return rejectedClosedTotal; }
    public long getRejectedCircuitOpenTotal() { return rejectedCircuitOpenTotal; }
    public QueueSummary getSendQueue() { return sendQueue; }
    public QueueSummary getRetryQueue() { return retryQueue; }
    public Long getAggregateBatches() { return aggregateBatches; }
    public Long getAggregateGroups() { return aggregateGroups; }
    public Integer getSendCallsInFlight() { return sendCallsInFlight; }
    public Long getCallbacksPending() { return callbacksPending; }
    public Integer getCallbacksInFlight() { return callbacksInFlight; }
    public WorkerSummary getWorkers() { return workers; }

    /** Serializes the section exactly once; no health/debug data is synthesized here. */
    String toJson() {
        JsonWriter counters = new JsonWriter()
                .num("accepted_logs_total", acceptedLogsTotal)
                .num("accepted_groups_total", acceptedGroupsTotal)
                .num("terminal_success_logs_total", terminalSuccessLogsTotal)
                .num("terminal_failure_logs_total", terminalFailureLogsTotal)
                .num("terminal_dropped_logs_total", terminalDroppedLogsTotal)
                .num("terminal_success_groups_total", terminalSuccessGroupsTotal)
                .num("terminal_failure_groups_total", terminalFailureGroupsTotal)
                .num("terminal_dropped_groups_total", terminalDroppedGroupsTotal)
                .num("send_calls_success_total", sendCallsSuccessTotal)
                .num("send_calls_failure_total", sendCallsFailureTotal)
                .num("send_call_payload_logs_total", sendCallPayloadLogsTotal)
                .num("send_call_payload_groups_total", sendCallPayloadGroupsTotal)
                .num("retries_scheduled_total", retriesScheduledTotal)
                .num("rejected_invalid_argument_total", rejectedInvalidArgumentTotal)
                .num("rejected_memory_full_total", rejectedMemoryFullTotal)
                .num("rejected_managed_admission_total", rejectedManagedAdmissionTotal)
                .num("rejected_closed_total", rejectedClosedTotal)
                .num("rejected_circuit_open_total", rejectedCircuitOpenTotal);
        JsonWriter writer = new JsonWriter().raw("counters", counters.end());
        if (sendQueue != null) writer.raw("send_queue", sendQueue.toJson());
        if (retryQueue != null) writer.raw("retry_queue", retryQueue.toJson());
        return writer.numOpt("aggregate_batches", aggregateBatches)
                .numOpt("aggregate_groups", aggregateGroups)
                .numOpt("send_calls_in_flight", sendCallsInFlight)
                .numOpt("callbacks_pending", callbacksPending)
                .numOpt("callbacks_in_flight", callbacksInFlight)
                .raw("workers", workers.toJson()).end();
    }

    public static final class Builder {
        private long acceptedLogsTotal;
        private long acceptedGroupsTotal;
        private long terminalSuccessLogsTotal;
        private long terminalFailureLogsTotal;
        private long terminalDroppedLogsTotal;
        private long terminalSuccessGroupsTotal;
        private long terminalFailureGroupsTotal;
        private long terminalDroppedGroupsTotal;
        private long sendCallsSuccessTotal;
        private long sendCallsFailureTotal;
        private long sendCallPayloadLogsTotal;
        private long sendCallPayloadGroupsTotal;
        private long retriesScheduledTotal;
        private long rejectedInvalidArgumentTotal;
        private long rejectedMemoryFullTotal;
        private long rejectedManagedAdmissionTotal;
        private long rejectedClosedTotal;
        private long rejectedCircuitOpenTotal;
        private QueueSummary sendQueue;
        private QueueSummary retryQueue;
        private Long aggregateBatches;
        private Long aggregateGroups;
        private Integer sendCallsInFlight;
        private Long callbacksPending;
        private Integer callbacksInFlight;
        private WorkerSummary workers;

        public Builder acceptedLogsTotal(long value) { acceptedLogsTotal = value; return this; }
        public Builder acceptedGroupsTotal(long value) { acceptedGroupsTotal = value; return this; }
        public Builder terminalSuccessLogsTotal(long value) { terminalSuccessLogsTotal = value; return this; }
        public Builder terminalFailureLogsTotal(long value) { terminalFailureLogsTotal = value; return this; }
        public Builder terminalDroppedLogsTotal(long value) { terminalDroppedLogsTotal = value; return this; }
        public Builder terminalSuccessGroupsTotal(long value) { terminalSuccessGroupsTotal = value; return this; }
        public Builder terminalFailureGroupsTotal(long value) { terminalFailureGroupsTotal = value; return this; }
        public Builder terminalDroppedGroupsTotal(long value) { terminalDroppedGroupsTotal = value; return this; }
        public Builder sendCallsSuccessTotal(long value) { sendCallsSuccessTotal = value; return this; }
        public Builder sendCallsFailureTotal(long value) { sendCallsFailureTotal = value; return this; }
        public Builder sendCallPayloadLogsTotal(long value) { sendCallPayloadLogsTotal = value; return this; }
        public Builder sendCallPayloadGroupsTotal(long value) { sendCallPayloadGroupsTotal = value; return this; }
        public Builder retriesScheduledTotal(long value) { retriesScheduledTotal = value; return this; }
        public Builder rejectedInvalidArgumentTotal(long value) { rejectedInvalidArgumentTotal = value; return this; }
        public Builder rejectedMemoryFullTotal(long value) { rejectedMemoryFullTotal = value; return this; }
        public Builder rejectedManagedAdmissionTotal(long value) { rejectedManagedAdmissionTotal = value; return this; }
        public Builder rejectedClosedTotal(long value) { rejectedClosedTotal = value; return this; }
        public Builder rejectedCircuitOpenTotal(long value) { rejectedCircuitOpenTotal = value; return this; }
        public Builder sendQueue(QueueSummary value) { sendQueue = value; return this; }
        public Builder retryQueue(QueueSummary value) { retryQueue = value; return this; }
        public Builder aggregateBatches(long value) { aggregateBatches = value; return this; }
        public Builder aggregateGroups(long value) { aggregateGroups = value; return this; }
        public Builder sendCallsInFlight(int value) { sendCallsInFlight = value; return this; }
        public Builder callbacksPending(long value) { callbacksPending = value; return this; }
        public Builder callbacksInFlight(int value) { callbacksInFlight = value; return this; }
        public Builder workers(WorkerSummary value) { workers = value; return this; }
        public ProducerOperationalStats build() { return new ProducerOperationalStats(this); }
    }
}
