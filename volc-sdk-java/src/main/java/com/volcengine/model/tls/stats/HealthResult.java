package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HealthResult {
    private final HealthStatus status;
    private final List<HealthReasonCode> reasonCodes;
    private final long evaluatedAtUnixMs;
    private final boolean insufficientData;

    HealthResult(HealthStatus status, List<HealthReasonCode> reasonCodes,
                 long evaluatedAtUnixMs, boolean insufficientData) {
        this.status = status;
        this.reasonCodes = Collections.unmodifiableList(new ArrayList<>(reasonCodes));
        this.evaluatedAtUnixMs = evaluatedAtUnixMs;
        this.insufficientData = insufficientData;
    }

    public HealthStatus getStatus() { return status; }
    public List<HealthReasonCode> getReasonCodes() { return reasonCodes; }
    public long getEvaluatedAtUnixMs() { return evaluatedAtUnixMs; }
    public boolean isInsufficientData() { return insufficientData; }

    public String toJson() {
        List<String> reasons = new ArrayList<>(reasonCodes.size());
        for (HealthReasonCode reason : reasonCodes) reasons.add(reason.getWireName());
        return new JsonWriter().str("status", status.getWireName())
                .raw("reason_codes", JsonWriter.stringArray(reasons))
                .num("evaluated_at_unix_ms", evaluatedAtUnixMs)
                .bool("insufficient_data", insufficientData).end();
    }

    @Override public String toString() { return toJson(); }
}
