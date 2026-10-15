package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Producer health facts. Cumulative counters belong to the operational section. */
public final class ProducerHealthSignals implements HealthSignals {
    private final Long lastSuccessAgeMs;
    private final Long lastErrorAgeMs;
    private final Double queuePressure;
    private final Double managedMemoryPressure;
    private final Double memoryPressure;
    private final Long oldestPendingAgeMs;
    private final WorkerSummary workerSummary;
    private final List<CriticalFlag> criticalFlags;

    /**
     * Creates the health section. {@code memoryPressure} is the payload-admission pressure
     * extension used by the Java producer; {@code managedMemoryPressure} is total managed-memory
     * pressure. Both are optional facts and must not be replaced by synthetic zeroes.
     */
    public ProducerHealthSignals(Long lastSuccessAgeMs, Long lastErrorAgeMs,
                                 Double queuePressure, Double managedMemoryPressure,
                                 Double memoryPressure, Long oldestPendingAgeMs,
                                 WorkerSummary workerSummary, List<CriticalFlag> criticalFlags) {
        if (workerSummary == null || criticalFlags == null) {
            throw new IllegalArgumentException("required producer health facts are missing");
        }
        StatsValidation.optionalNonNegative(lastSuccessAgeMs, "lastSuccessAgeMs");
        StatsValidation.optionalNonNegative(lastErrorAgeMs, "lastErrorAgeMs");
        StatsValidation.optionalFiniteNonNegative(queuePressure, "queuePressure");
        StatsValidation.optionalFiniteNonNegative(managedMemoryPressure, "managedMemoryPressure");
        StatsValidation.optionalFiniteNonNegative(memoryPressure, "memoryPressure");
        StatsValidation.optionalNonNegative(oldestPendingAgeMs, "oldestPendingAgeMs");
        StatsValidation.orderedDistinct(criticalFlags, CriticalFlag.values(), "criticalFlags");
        this.lastSuccessAgeMs = lastSuccessAgeMs;
        this.lastErrorAgeMs = lastErrorAgeMs;
        this.queuePressure = queuePressure;
        this.managedMemoryPressure = managedMemoryPressure;
        this.memoryPressure = memoryPressure;
        this.oldestPendingAgeMs = oldestPendingAgeMs;
        this.workerSummary = workerSummary;
        this.criticalFlags = Collections.unmodifiableList(new ArrayList<>(criticalFlags));
    }

    public Long getLastSuccessAgeMs() { return lastSuccessAgeMs; }
    public Long getLastErrorAgeMs() { return lastErrorAgeMs; }
    public Double getQueuePressure() { return queuePressure; }
    public Double getManagedMemoryPressure() { return managedMemoryPressure; }
    public Double getMemoryPressure() { return memoryPressure; }
    public Long getOldestPendingAgeMs() { return oldestPendingAgeMs; }
    public WorkerSummary getWorkerSummary() { return workerSummary; }
    public List<CriticalFlag> getCriticalFlags() { return criticalFlags; }

    String toJson() {
        List<String> flags = new ArrayList<>(criticalFlags.size());
        for (CriticalFlag flag : criticalFlags) flags.add(flag.getWireName());
        JsonWriter writer = new JsonWriter()
                .numOpt("last_success_age_ms", lastSuccessAgeMs)
                .numOpt("last_error_age_ms", lastErrorAgeMs)
                .numOpt("queue_pressure", queuePressure)
                .numOpt("managed_memory_pressure", managedMemoryPressure)
                .numOpt("memory_pressure", memoryPressure)
                .numOpt("oldest_pending_age_ms", oldestPendingAgeMs)
                .raw("worker_summary", workerSummary.toJson())
                .raw("critical_flags", JsonWriter.stringArray(flags));
        if (memoryPressure != null && memoryPressure > 0D) {
            writer.str("memory_pressure_source", "managed_payload_admission");
        }
        return writer.end();
    }
}
