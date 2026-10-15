package com.volcengine.model.tls.stats;

/**
 * Lifecycle state of an observable Producer/Consumer instance.
 *
 * <p>Serialized as a lower-case string to match the cross-language contract. {@code FAILED} is
 * defined for parity and is reserved for a hard, unrecoverable initialization/close failure.
 */
public enum LifecycleState {
    NEW("new"),
    RUNNING("running"),
    CLOSING("closing"),
    CLOSED("closed"),
    FAILED("failed");

    private final String wireName;

    LifecycleState(String wireName) {
        this.wireName = wireName;
    }

    public String getWireName() {
        return wireName;
    }
}
