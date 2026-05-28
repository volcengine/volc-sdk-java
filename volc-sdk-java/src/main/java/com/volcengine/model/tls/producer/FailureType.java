package com.volcengine.model.tls.producer;

public enum FailureType {
    PERMANENT,
    THROTTLED,
    SERVER,
    NETWORK,
    LOCAL_RESOURCE,
    CIRCUIT_OPEN
}
