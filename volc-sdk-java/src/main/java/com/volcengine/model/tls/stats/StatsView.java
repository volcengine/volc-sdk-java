package com.volcengine.model.tls.stats;

/** Projection requested from an already configured collection level. */
public enum StatsView {
    HEALTH(0, "health"),
    OPERATIONAL(1, "operational"),
    DEBUG(2, "debug");

    private final int code;
    private final String wireName;

    StatsView(int code, String wireName) {
        this.code = code;
        this.wireName = wireName;
    }

    /** Numeric code used by the cross-language wire contract. */
    public int getCode() {
        return code;
    }

    public String getWireName() {
        return wireName;
    }
}
