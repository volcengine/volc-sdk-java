package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ComponentType;
import com.volcengine.model.tls.stats.ConsumerHealthSignals;
import com.volcengine.model.tls.stats.ConsumerLatencyHistograms;
import com.volcengine.model.tls.stats.ConsumerOperationalStats;
import com.volcengine.model.tls.stats.ConsumerRetryDetails;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.ManagedMemoryBreakdown;
import com.volcengine.model.tls.stats.ManagedMemorySummary;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.MissingSection;
import com.volcengine.model.tls.stats.ProducerHealthSignals;
import com.volcengine.model.tls.stats.ProducerLatencyHistograms;
import com.volcengine.model.tls.stats.ProducerOperationalStats;
import com.volcengine.model.tls.stats.ProducerRetryDetails;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.SnapshotHeader;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.StatsSections;
import com.volcengine.model.tls.stats.StatsView;
import com.volcengine.model.tls.stats.WorkerDetails;

import java.util.List;

/** Deterministic projection over one view-neutral capture. */
public final class StatsProjector {
    private StatsProjector() { }

    public static ProducerStatsSnapshot producer(SnapshotAnchor anchor,
                                                 ProducerHealthSignals health,
                                                 ProducerOperationalStats operational,
                                                 ManagedMemorySummary managedMemory,
                                                 WorkerDetails workerDetails,
                                                 ProducerRetryDetails retryDetails,
                                                 ProducerLatencyHistograms latencyHistograms,
                                                 ManagedMemoryBreakdown memoryBreakdown,
                                                 StatsOptions options) {
        require(anchor, options, ComponentType.PRODUCER);
        return new ProducerStatsSnapshot(header(anchor, options.getView()), health, operational,
                managedMemory, workerDetails, retryDetails, latencyHistograms, memoryBreakdown);
    }

    public static ConsumerStatsSnapshot consumer(SnapshotAnchor anchor,
                                                 ConsumerHealthSignals health,
                                                 ConsumerOperationalStats operational,
                                                 WorkerDetails workerDetails,
                                                 ConsumerRetryDetails retryDetails,
                                                 ConsumerLatencyHistograms latencyHistograms,
                                                 StatsOptions options) {
        require(anchor, options, ComponentType.CONSUMER);
        return new ConsumerStatsSnapshot(header(anchor, options.getView()), health, operational,
                workerDetails, retryDetails, latencyHistograms);
    }

    private static void require(SnapshotAnchor anchor, StatsOptions options,
                                ComponentType componentType) {
        if (anchor == null || options == null || anchor.componentType != componentType) {
            throw new IllegalArgumentException("anchor/options/component mismatch");
        }
    }

    private static SnapshotHeader header(SnapshotAnchor anchor, StatsView view) {
        List<MissingSection> missing = StatsSections.missing(anchor.componentType,
                anchor.capabilities, anchor.collectedLevel, view);
        return new SnapshotHeader(anchor.instanceId, anchor.componentType, anchor.capturedAtUnixMs,
                anchor.uptimeMs, anchor.snapshotSequence, anchor.lifecycleState, anchor.consistency,
                anchor.collectedLevel, view, !missing.isEmpty(), anchor.capabilities, missing,
                anchor.collectionGeneration, anchor.collectionStartedAtUnixMs);
    }
}
