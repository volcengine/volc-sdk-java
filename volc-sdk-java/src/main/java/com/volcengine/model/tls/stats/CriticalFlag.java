package com.volcengine.model.tls.stats;

public enum CriticalFlag {
    COUNTER_SATURATED("counter_saturated"),
    ACCOUNTING_INVARIANT_BROKEN("accounting_invariant_broken"),
    FINALIZATION_INCOMPLETE("finalization_incomplete");

    private final String wireName;

    CriticalFlag(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
