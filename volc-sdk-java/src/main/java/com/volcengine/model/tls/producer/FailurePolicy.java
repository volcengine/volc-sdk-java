package com.volcengine.model.tls.producer;

public enum FailurePolicy {
    RETRY_THEN_CALLBACK,
    FAIL_FAST,
    DROP_WITH_CALLBACK
}
