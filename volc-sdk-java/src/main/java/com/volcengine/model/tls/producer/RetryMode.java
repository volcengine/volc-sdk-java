package com.volcengine.model.tls.producer;

public enum RetryMode {
    /**
     * Retained for source compatibility only; nested client retries are unsupported for Producer.
     *
     * @deprecated use {@link #PRODUCER_MANAGED}; Producer is the only retry owner.
     */
    @Deprecated
    LEGACY_DOUBLE_RETRY,
    PRODUCER_MANAGED
}
