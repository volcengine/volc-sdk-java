package com.volcengine.model.tls.stats;

/** Consumer operational counters and bounded gauges. */
public final class ConsumerOperationalStats {
    private final long fetchSuccessTotal;
    private final long fetchFailureTotal;
    private final long fetchedLogsTotal;
    private final long fetchedLogGroupsTotal;
    private final long handlerNormalReturnsTotal;
    private final long handlerExceptionReturnsTotal;
    private final long handlerReturnedLogsTotal;
    private final long handlerReturnedGroupsTotal;
    private final long checkpointSuccessTotal;
    private final long checkpointFailureTotal;
    private final long heartbeatSuccessTotal;
    private final long heartbeatFailureTotal;
    private final long rebalanceTotal;
    private final int assignedShards;
    private final long heldBatchReferences;
    private final long readyToProcess;
    private final int fetchInFlight;
    private final int processInFlight;
    private final QueueSummary checkpointPending;
    private final WorkerSummary workers;

    private ConsumerOperationalStats(Builder b) {
        if (b.workers == null) throw new IllegalArgumentException("consumer workers are required");
        long[] values = {
                b.fetchSuccessTotal, b.fetchFailureTotal, b.fetchedLogsTotal,
                b.fetchedLogGroupsTotal, b.handlerNormalReturnsTotal,
                b.handlerExceptionReturnsTotal, b.handlerReturnedLogsTotal,
                b.handlerReturnedGroupsTotal, b.checkpointSuccessTotal,
                b.checkpointFailureTotal, b.heartbeatSuccessTotal,
                b.heartbeatFailureTotal, b.rebalanceTotal, b.assignedShards,
                b.heldBatchReferences, b.readyToProcess, b.fetchInFlight, b.processInFlight
        };
        for (long value : values) StatsValidation.nonNegative(value, "consumer operational counter");
        this.fetchSuccessTotal = b.fetchSuccessTotal;
        this.fetchFailureTotal = b.fetchFailureTotal;
        this.fetchedLogsTotal = b.fetchedLogsTotal;
        this.fetchedLogGroupsTotal = b.fetchedLogGroupsTotal;
        this.handlerNormalReturnsTotal = b.handlerNormalReturnsTotal;
        this.handlerExceptionReturnsTotal = b.handlerExceptionReturnsTotal;
        this.handlerReturnedLogsTotal = b.handlerReturnedLogsTotal;
        this.handlerReturnedGroupsTotal = b.handlerReturnedGroupsTotal;
        this.checkpointSuccessTotal = b.checkpointSuccessTotal;
        this.checkpointFailureTotal = b.checkpointFailureTotal;
        this.heartbeatSuccessTotal = b.heartbeatSuccessTotal;
        this.heartbeatFailureTotal = b.heartbeatFailureTotal;
        this.rebalanceTotal = b.rebalanceTotal;
        this.assignedShards = b.assignedShards;
        this.heldBatchReferences = b.heldBatchReferences;
        this.readyToProcess = b.readyToProcess;
        this.fetchInFlight = b.fetchInFlight;
        this.processInFlight = b.processInFlight;
        this.checkpointPending = b.checkpointPending;
        this.workers = b.workers;
    }

    public static Builder builder() { return new Builder(); }

    public long getFetchSuccessTotal() { return fetchSuccessTotal; }
    public long getFetchFailureTotal() { return fetchFailureTotal; }
    public long getFetchedLogsTotal() { return fetchedLogsTotal; }
    public long getFetchedLogGroupsTotal() { return fetchedLogGroupsTotal; }
    public long getHandlerNormalReturnsTotal() { return handlerNormalReturnsTotal; }
    public long getHandlerExceptionReturnsTotal() { return handlerExceptionReturnsTotal; }
    public long getHandlerReturnedLogsTotal() { return handlerReturnedLogsTotal; }
    public long getHandlerReturnedGroupsTotal() { return handlerReturnedGroupsTotal; }
    public long getCheckpointSuccessTotal() { return checkpointSuccessTotal; }
    public long getCheckpointFailureTotal() { return checkpointFailureTotal; }
    public long getHeartbeatSuccessTotal() { return heartbeatSuccessTotal; }
    public long getHeartbeatFailureTotal() { return heartbeatFailureTotal; }
    public long getRebalanceTotal() { return rebalanceTotal; }
    public int getAssignedShards() { return assignedShards; }
    public long getHeldBatchReferences() { return heldBatchReferences; }
    public long getReadyToProcess() { return readyToProcess; }
    public int getFetchInFlight() { return fetchInFlight; }
    public int getProcessInFlight() { return processInFlight; }
    public QueueSummary getCheckpointPending() { return checkpointPending; }
    public WorkerSummary getWorkers() { return workers; }

    String toJson() {
        JsonWriter counters = new JsonWriter()
                .num("fetch_calls_success_total", fetchSuccessTotal)
                .num("fetch_calls_failure_total", fetchFailureTotal)
                .num("fetched_logs_total", fetchedLogsTotal)
                .num("fetched_groups_total", fetchedLogGroupsTotal)
                .num("process_attempts_success_total", handlerNormalReturnsTotal)
                .num("process_attempts_failure_total", handlerExceptionReturnsTotal)
                .num("processed_success_logs_total", handlerReturnedLogsTotal)
                .num("processed_success_groups_total", handlerReturnedGroupsTotal)
                .num("checkpoint_calls_success_total", checkpointSuccessTotal)
                .num("checkpoint_calls_failure_total", checkpointFailureTotal)
                .num("heartbeat_calls_success_total", heartbeatSuccessTotal)
                .num("heartbeat_calls_failure_total", heartbeatFailureTotal)
                .num("rebalance_total", rebalanceTotal);
        JsonWriter writer = new JsonWriter().raw("counters", counters.end())
                .num("assigned_shards", assignedShards)
                .num("held_batch_references", heldBatchReferences)
                .num("ready_to_process", readyToProcess)
                .num("fetch_in_flight", fetchInFlight)
                .num("process_in_flight", processInFlight);
        if (checkpointPending != null) writer.raw("checkpoint_pending", checkpointPending.toJson());
        return writer.raw("workers", workers.toJson()).end();
    }

    public static final class Builder {
        private long fetchSuccessTotal;
        private long fetchFailureTotal;
        private long fetchedLogsTotal;
        private long fetchedLogGroupsTotal;
        private long handlerNormalReturnsTotal;
        private long handlerExceptionReturnsTotal;
        private long handlerReturnedLogsTotal;
        private long handlerReturnedGroupsTotal;
        private long checkpointSuccessTotal;
        private long checkpointFailureTotal;
        private long heartbeatSuccessTotal;
        private long heartbeatFailureTotal;
        private long rebalanceTotal;
        private int assignedShards;
        private long heldBatchReferences;
        private long readyToProcess;
        private int fetchInFlight;
        private int processInFlight;
        private QueueSummary checkpointPending;
        private WorkerSummary workers;

        public Builder fetchSuccessTotal(long value) { fetchSuccessTotal = value; return this; }
        public Builder fetchFailureTotal(long value) { fetchFailureTotal = value; return this; }
        public Builder fetchedLogsTotal(long value) { fetchedLogsTotal = value; return this; }
        public Builder fetchedLogGroupsTotal(long value) { fetchedLogGroupsTotal = value; return this; }
        public Builder handlerNormalReturnsTotal(long value) { handlerNormalReturnsTotal = value; return this; }
        public Builder handlerExceptionReturnsTotal(long value) { handlerExceptionReturnsTotal = value; return this; }
        public Builder handlerReturnedLogsTotal(long value) { handlerReturnedLogsTotal = value; return this; }
        public Builder handlerReturnedGroupsTotal(long value) { handlerReturnedGroupsTotal = value; return this; }
        public Builder checkpointSuccessTotal(long value) { checkpointSuccessTotal = value; return this; }
        public Builder checkpointFailureTotal(long value) { checkpointFailureTotal = value; return this; }
        public Builder heartbeatSuccessTotal(long value) { heartbeatSuccessTotal = value; return this; }
        public Builder heartbeatFailureTotal(long value) { heartbeatFailureTotal = value; return this; }
        public Builder rebalanceTotal(long value) { rebalanceTotal = value; return this; }
        public Builder assignedShards(int value) { assignedShards = value; return this; }
        public Builder heldBatchReferences(long value) { heldBatchReferences = value; return this; }
        public Builder readyToProcess(long value) { readyToProcess = value; return this; }
        public Builder fetchInFlight(int value) { fetchInFlight = value; return this; }
        public Builder processInFlight(int value) { processInFlight = value; return this; }
        public Builder checkpointPending(QueueSummary value) { checkpointPending = value; return this; }
        public Builder workers(WorkerSummary value) { workers = value; return this; }
        public ConsumerOperationalStats build() { return new ConsumerOperationalStats(this); }
    }
}
