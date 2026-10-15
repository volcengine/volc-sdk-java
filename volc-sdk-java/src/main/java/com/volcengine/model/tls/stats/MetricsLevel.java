package com.volcengine.model.tls.stats;

/** Runtime collection level. It is independent from the requested {@link StatsView}. */
public enum MetricsLevel {
    OFF(0, "off"),
    CORE(1, "core"),
    DETAILED(2, "detailed");

    private final int code;
    private final String wireName;

    MetricsLevel(int code, String wireName) {
        this.code = code;
        this.wireName = wireName;
    }

    /** Integer code used in the serialized snapshot. */
    public int getCode() {
        return code;
    }

    public String getWireName() {
        return wireName;
    }

    /**
     * Normalizes a possibly-null level to a concrete value. Null maps to {@link #OFF} so callers
     * never trip a {@link NullPointerException} at runtime.
     */
    public static MetricsLevel normalize(MetricsLevel level) {
        return level == null ? OFF : level;
    }
}
