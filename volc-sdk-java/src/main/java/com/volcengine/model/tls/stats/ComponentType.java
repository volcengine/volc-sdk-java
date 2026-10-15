package com.volcengine.model.tls.stats;

/**
 * Component type reported by a snapshot.
 */
public enum ComponentType {
    PRODUCER("producer"),
    CONSUMER("consumer");

    private final String wireName;

    ComponentType(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
