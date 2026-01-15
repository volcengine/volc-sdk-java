package com.volcengine.model.tls.enumration;

public enum TraceInstanceStatus {
    CREATING("CREATING"),
    CREATED("CREATED"),
    DELETING("DELETING");

    private final String value;

    TraceInstanceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TraceInstanceStatus fromValue(String value) {
        for (TraceInstanceStatus status : TraceInstanceStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException(value);
    }
}