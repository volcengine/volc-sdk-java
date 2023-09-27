package com.volcengine.model.tls.consumer;

public enum ConsumerStatus {
    PENDING,
    INITIALIZING,
    READY_TO_FETCH,
    FETCHING,
    READY_TO_CONSUME,
    CONSUMING,
    BACKOFF,
    WAIT_FOR_RESTART
}
