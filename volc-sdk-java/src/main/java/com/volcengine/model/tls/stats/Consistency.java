package com.volcengine.model.tls.stats;

/**
 * Snapshot consistency level.
 *
 * <ul>
 *   <li>{@link #WEAK} — the instance is still running or closing; writers are active and fields may
 *       be observed at slightly different instants.</li>
 *   <li>{@link #FINAL} — the instance is closed/failed; the snapshot is frozen and every subsequent
 *       read returns identical values.</li>
 * </ul>
 */
public enum Consistency {
    WEAK("weak"),
    FINAL("final");

    private final String wireName;

    Consistency(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
