package com.volcengine.model.tls;

import com.volcengine.model.response.RawResponse;

public interface RetryDecider {
    boolean shouldRetry(RawResponse response);
}
