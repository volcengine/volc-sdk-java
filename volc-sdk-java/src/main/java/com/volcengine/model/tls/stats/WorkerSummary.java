package com.volcengine.model.tls.stats;

public final class WorkerSummary {
    private final long expectedTotal;
    private final long runningTotal;
    private final long inFlightTotal;
    private final long missingCriticalRoles;

    /** Constructs a worker summary with explicit missing-role accounting. */
    public WorkerSummary(long expectedTotal, long runningTotal, long inFlightTotal,
                         long missingCriticalRoles) {
        StatsValidation.nonNegative(expectedTotal, "expectedTotal");
        StatsValidation.nonNegative(runningTotal, "runningTotal");
        StatsValidation.nonNegative(inFlightTotal, "inFlightTotal");
        StatsValidation.nonNegative(missingCriticalRoles, "missingCriticalRoles");
        if (runningTotal > expectedTotal) {
            throw new IllegalArgumentException("runningTotal exceeds expectedTotal");
        }
        this.expectedTotal = expectedTotal;
        this.runningTotal = runningTotal;
        this.inFlightTotal = inFlightTotal;
        this.missingCriticalRoles = missingCriticalRoles;
    }

    public long getExpectedTotal() { return expectedTotal; }
    public long getRunningTotal() { return runningTotal; }
    public long getInFlightTotal() { return inFlightTotal; }
    public long getMissingCriticalRoles() { return missingCriticalRoles; }

    String toJson() {
        return new JsonWriter().num("expected", expectedTotal)
                .num("running", runningTotal).num("in_flight", inFlightTotal)
                .num("missing_critical_roles", missingCriticalRoles).end();
    }
}
