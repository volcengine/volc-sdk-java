package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Consumer health facts. Component counters belong to the operational section. */
public final class ConsumerHealthSignals implements HealthSignals {
    private final Long lastSuccessAgeMs;
    private final Long lastErrorAgeMs;
    private final WorkerSummary workerSummary;
    private final List<CriticalFlag> criticalFlags;

    /** Creates the four-field consumer health section. */
    public ConsumerHealthSignals(Long lastSuccessAgeMs, Long lastErrorAgeMs,
                                 WorkerSummary workerSummary, List<CriticalFlag> criticalFlags) {
        if (workerSummary == null || criticalFlags == null) {
            throw new IllegalArgumentException("required consumer health facts are missing");
        }
        StatsValidation.optionalNonNegative(lastSuccessAgeMs, "lastSuccessAgeMs");
        StatsValidation.optionalNonNegative(lastErrorAgeMs, "lastErrorAgeMs");
        StatsValidation.orderedDistinct(criticalFlags, CriticalFlag.values(), "criticalFlags");
        this.lastSuccessAgeMs = lastSuccessAgeMs;
        this.lastErrorAgeMs = lastErrorAgeMs;
        this.workerSummary = workerSummary;
        this.criticalFlags = Collections.unmodifiableList(new ArrayList<>(criticalFlags));
    }

    public Long getLastSuccessAgeMs() { return lastSuccessAgeMs; }
    public Long getLastErrorAgeMs() { return lastErrorAgeMs; }
    public WorkerSummary getWorkerSummary() { return workerSummary; }
    public List<CriticalFlag> getCriticalFlags() { return criticalFlags; }

    String toJson() {
        List<String> flags = new ArrayList<>(criticalFlags.size());
        for (CriticalFlag flag : criticalFlags) flags.add(flag.getWireName());
        return new JsonWriter().numOpt("last_success_age_ms", lastSuccessAgeMs)
                .numOpt("last_error_age_ms", lastErrorAgeMs)
                .raw("worker_summary", workerSummary.toJson())
                .raw("critical_flags", JsonWriter.stringArray(flags)).end();
    }
}
