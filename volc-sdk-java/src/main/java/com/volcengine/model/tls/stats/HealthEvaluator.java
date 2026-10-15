package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/** Stateless health evaluation over immutable snapshot facts. */
public final class HealthEvaluator {
    private HealthEvaluator() { }

    public static HealthResult evaluate(Optional<? extends StatsSnapshot> previous,
                                        StatsSnapshot current, HealthPolicy policy) {
        if (previous == null || current == null || policy == null) {
            throw new IllegalArgumentException("health inputs must not be null");
        }
        SnapshotHeader header = current.getHeader();
        if (header == null) throw new IllegalArgumentException("current snapshot header is required");
        if (header.isMetricsDisabled()) return unknown(header, HealthReasonCode.METRICS_DISABLED);
        LifecycleState lifecycle = header.getLifecycleState();
        if (lifecycle == LifecycleState.NEW || lifecycle == LifecycleState.CLOSING
                || lifecycle == LifecycleState.CLOSED) {
            return unknown(header, HealthReasonCode.LIFECYCLE_NOT_RUNNING);
        }
        if (!previous.isPresent()) return unknown(header, HealthReasonCode.INSUFFICIENT_DATA);
        StatsSnapshot beforeSnapshot = previous.get();
        if (beforeSnapshot == null || beforeSnapshot.getHeader() == null) {
            throw new IllegalArgumentException("previous snapshot must contain a header");
        }
        SnapshotHeader before = beforeSnapshot.getHeader();
        if (before.isMetricsDisabled()) return unknown(header, HealthReasonCode.METRICS_DISABLED);
        if (!before.getInstanceId().equals(header.getInstanceId())) {
            return unknown(header, HealthReasonCode.INSTANCE_CHANGED);
        }
        if (before.getCollectionGeneration() != header.getCollectionGeneration()) {
            return unknown(header, HealthReasonCode.COLLECTION_CHANGED);
        }
        if (lifecycle == LifecycleState.FAILED) {
            return unhealthy(header, HealthReasonCode.LIFECYCLE_FAILED);
        }
        if (!current.getHealth().isPresent()) {
            return unknown(header, HealthReasonCode.INSUFFICIENT_DATA);
        }

        HealthSignals facts = current.getHealth().get();
        WorkerSummary workers;
        List<CriticalFlag> critical;
        Double queuePressure = null;
        Double memoryPressure = null;
        if (facts instanceof ProducerHealthSignals) {
            ProducerHealthSignals producer = (ProducerHealthSignals) facts;
            workers = producer.getWorkerSummary();
            critical = producer.getCriticalFlags();
            queuePressure = producer.getQueuePressure();
            // Java keeps the payload-admission pressure extension separate from total managed
            // pressure. Prefer the health fact, then fall back to total managed pressure.
            memoryPressure = producer.getMemoryPressure();
            if (memoryPressure == null) memoryPressure = producer.getManagedMemoryPressure();
        } else if (facts instanceof ConsumerHealthSignals) {
            ConsumerHealthSignals consumer = (ConsumerHealthSignals) facts;
            workers = consumer.getWorkerSummary();
            critical = consumer.getCriticalFlags();
        } else {
            return unknown(header, HealthReasonCode.INSUFFICIENT_DATA);
        }
        if (!critical.isEmpty()) return unhealthy(header, HealthReasonCode.CRITICAL_FLAG);
        if (workers.getMissingCriticalRoles() > 0) {
            return unhealthy(header, HealthReasonCode.WORKER_MISSING);
        }

        List<HealthReasonCode> reasons = new ArrayList<>(2);
        if (queuePressure != null && queuePressure >= policy.getQueuePressureDegraded()) {
            reasons.add(HealthReasonCode.QUEUE_PRESSURE);
        }
        if (memoryPressure != null && memoryPressure >= policy.getMemoryPressureDegraded()) {
            reasons.add(HealthReasonCode.MEMORY_PRESSURE);
        }
        return new HealthResult(reasons.isEmpty() ? HealthStatus.HEALTHY : HealthStatus.DEGRADED,
                reasons, header.getCapturedAtUnixMs(), false);
    }

    private static HealthResult unknown(SnapshotHeader header, HealthReasonCode reason) {
        return new HealthResult(HealthStatus.UNKNOWN, Collections.singletonList(reason),
                header.getCapturedAtUnixMs(), true);
    }

    private static HealthResult unhealthy(SnapshotHeader header, HealthReasonCode reason) {
        return new HealthResult(HealthStatus.UNHEALTHY, Collections.singletonList(reason),
                header.getCapturedAtUnixMs(), false);
    }
}
