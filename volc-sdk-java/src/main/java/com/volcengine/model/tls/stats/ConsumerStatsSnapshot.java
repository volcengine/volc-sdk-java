package com.volcengine.model.tls.stats;

import java.util.Optional;

/** Immutable consumer projection with direct sections. */
public final class ConsumerStatsSnapshot implements StatsSnapshot {
    private final SnapshotHeader header;
    private final ConsumerHealthSignals health;
    private final ConsumerOperationalStats operational;
    private final WorkerDetails workerDetails;
    private final ConsumerRetryDetails retryDetails;
    private final ConsumerLatencyHistograms latencyHistograms;

    public ConsumerStatsSnapshot(SnapshotHeader header, ConsumerHealthSignals health,
                                 ConsumerOperationalStats operational, WorkerDetails workerDetails,
                                 ConsumerRetryDetails retryDetails,
                                 ConsumerLatencyHistograms latencyHistograms) {
        if (header == null || header.getComponentType() != ComponentType.CONSUMER) {
            throw new IllegalArgumentException("consumer header is required");
        }
        validateHeader(header);
        this.header = header;
        this.health = health;
        this.operational = operational;
        this.workerDetails = workerDetails;
        this.retryDetails = retryDetails;
        this.latencyHistograms = latencyHistograms;
    }

    public SnapshotHeader getHeader() { return header; }
    public Optional<ConsumerHealthSignals> getHealth() {
        return Optional.ofNullable(canHealth() ? health : null);
    }
    public Optional<ConsumerOperationalStats> getOperational() {
        return Optional.ofNullable(canOperational() ? operational : null);
    }
    public Optional<WorkerDetails> getWorkerDetails() {
        return Optional.ofNullable(canWorkerDetails() ? workerDetails : null);
    }
    public Optional<ConsumerRetryDetails> getRetryDetails() {
        return Optional.ofNullable(canRetryDetails() ? retryDetails : null);
    }
    public Optional<ConsumerLatencyHistograms> getLatencyHistograms() {
        return Optional.ofNullable(canLatency() ? latencyHistograms : null);
    }
    public Optional<ManagedMemorySummary> getManagedMemory() { return Optional.empty(); }
    public Optional<ManagedMemoryBreakdown> getMemoryBreakdown() { return Optional.empty(); }
    public Optional<MemoryGateSummary> getBatchInflightMemoryGate() { return Optional.empty(); }

    @Override
    public String toJson() {
        JsonWriter writer = header.writeTo(new JsonWriter());
        if (getHealth().isPresent()) writer.raw("health", healthJson());
        if (getOperational().isPresent()) writer.raw("operational", operational.toJson());
        if (getWorkerDetails().isPresent()) writer.raw("worker_details", workerDetails.toJson());
        if (getRetryDetails().isPresent()) writer.raw("retry_details", retryDetails.toJson());
        if (getLatencyHistograms().isPresent()) {
            writer.raw("latency_histograms", latencyHistograms.toJson());
        }
        return writer.end();
    }

    @Override
    public String toString() { return toJson(); }

    private String healthJson() {
        return new JsonWriter().raw("signals", health.toJson()).end();
    }

    private boolean canHealth() {
        return health != null && header.getCollectedLevel().getCode() >= MetricsLevel.CORE.getCode()
                && Capability.has(header.getCapabilities(), Capability.HEALTH);
    }

    private boolean canOperational() {
        return operational != null && header.getRequestedView() != StatsView.HEALTH
                && header.getCollectedLevel().getCode() >= MetricsLevel.CORE.getCode()
                && Capability.has(header.getCapabilities(), Capability.OPERATIONAL);
    }

    private boolean isDetailedView() {
        return header.getRequestedView() == StatsView.DEBUG
                && header.getCollectedLevel() == MetricsLevel.DETAILED;
    }

    private boolean canWorkerDetails() {
        return workerDetails != null && isDetailedView() && Capability.has(header.getCapabilities(),
                Capability.WORKER_DETAILS);
    }

    private boolean canRetryDetails() {
        return retryDetails != null && isDetailedView() && Capability.has(header.getCapabilities(),
                Capability.RETRY_DETAILS);
    }

    private boolean canLatency() {
        return latencyHistograms != null && isDetailedView() && Capability.has(header.getCapabilities(),
                Capability.LATENCY);
    }

    private static void validateHeader(SnapshotHeader header) {
        if (!header.getMissingSections().equals(StatsSections.missing(ComponentType.CONSUMER,
                header.getCapabilities(), header.getCollectedLevel(), header.getRequestedView()))) {
            throw new IllegalArgumentException("consumer missingSections does not match capability, level and view");
        }
    }
}
