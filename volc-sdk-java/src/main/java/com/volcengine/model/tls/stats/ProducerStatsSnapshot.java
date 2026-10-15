package com.volcengine.model.tls.stats;

import java.util.Optional;

/** Immutable producer projection with direct sections. */
public final class ProducerStatsSnapshot implements StatsSnapshot {
    private final SnapshotHeader header;
    private final ProducerHealthSignals health;
    private final ProducerOperationalStats operational;
    private final ManagedMemorySummary managedMemory;
    private final WorkerDetails workerDetails;
    private final ProducerRetryDetails retryDetails;
    private final ProducerLatencyHistograms latencyHistograms;
    private final ManagedMemoryBreakdown memoryBreakdown;

    public ProducerStatsSnapshot(SnapshotHeader header, ProducerHealthSignals health,
                                 ProducerOperationalStats operational,
                                 ManagedMemorySummary managedMemory, WorkerDetails workerDetails,
                                 ProducerRetryDetails retryDetails,
                                 ProducerLatencyHistograms latencyHistograms,
                                 ManagedMemoryBreakdown memoryBreakdown) {
        if (header == null || header.getComponentType() != ComponentType.PRODUCER) {
            throw new IllegalArgumentException("producer header is required");
        }
        validateHeader(header);
        this.header = header;
        this.health = health;
        this.operational = operational;
        this.managedMemory = managedMemory;
        this.workerDetails = workerDetails;
        this.retryDetails = retryDetails;
        this.latencyHistograms = latencyHistograms;
        this.memoryBreakdown = memoryBreakdown;
    }

    public SnapshotHeader getHeader() { return header; }
    public Optional<ProducerHealthSignals> getHealth() {
        return Optional.ofNullable(canHealth() ? health : null);
    }
    public Optional<ProducerOperationalStats> getOperational() {
        return Optional.ofNullable(canOperational() ? operational : null);
    }
    public Optional<ManagedMemorySummary> getManagedMemory() {
        return Optional.ofNullable(canManagedMemory() ? managedMemory : null);
    }
    public Optional<WorkerDetails> getWorkerDetails() {
        return Optional.ofNullable(canWorkerDetails() ? workerDetails : null);
    }
    public Optional<ProducerRetryDetails> getRetryDetails() {
        return Optional.ofNullable(canRetryDetails() ? retryDetails : null);
    }
    public Optional<ProducerLatencyHistograms> getLatencyHistograms() {
        return Optional.ofNullable(canLatency() ? latencyHistograms : null);
    }
    public Optional<ManagedMemoryBreakdown> getMemoryBreakdown() {
        return Optional.ofNullable(canMemoryBreakdown() ? memoryBreakdown : null);
    }
    /** Java has no independent batch-inflight admission gate; unsupported is absent, never zero. */
    public Optional<MemoryGateSummary> getBatchInflightMemoryGate() {
        return Optional.empty();
    }

    @Override
    public String toJson() {
        JsonWriter writer = header.writeTo(new JsonWriter());
        if (getHealth().isPresent()) writer.raw("health", healthJson());
        if (getOperational().isPresent()) writer.raw("operational", operational.toJson());
        if (getManagedMemory().isPresent()) writer.raw("managed_memory", managedMemory.toJson());
        if (getWorkerDetails().isPresent()) writer.raw("worker_details", workerDetails.toJson());
        if (getRetryDetails().isPresent()) writer.raw("retry_details", retryDetails.toJson());
        if (getLatencyHistograms().isPresent()) {
            writer.raw("latency_histograms", latencyHistograms.toJson());
        }
        if (getMemoryBreakdown().isPresent()) {
            writer.raw("memory_breakdown", memoryBreakdown.toJson());
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

    private boolean canManagedMemory() {
        return managedMemory != null && header.getCollectedLevel().getCode() >= MetricsLevel.CORE.getCode()
                && Capability.has(header.getCapabilities(), Capability.MANAGED);
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

    private boolean canMemoryBreakdown() {
        return memoryBreakdown != null && isDetailedView() && Capability.has(header.getCapabilities(),
                Capability.MEMORY_BREAKDOWN);
    }

    private boolean isDetailedView() {
        return header.getRequestedView() == StatsView.DEBUG
                && header.getCollectedLevel() == MetricsLevel.DETAILED;
    }

    private static void validateHeader(SnapshotHeader header) {
        if (!header.getMissingSections().equals(StatsSections.missing(ComponentType.PRODUCER,
                header.getCapabilities(), header.getCollectedLevel(), header.getRequestedView()))) {
            throw new IllegalArgumentException("producer missingSections does not match capability, level and view");
        }
    }
}
