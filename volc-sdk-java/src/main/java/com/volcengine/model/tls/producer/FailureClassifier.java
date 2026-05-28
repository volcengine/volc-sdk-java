package com.volcengine.model.tls.producer;

import com.volcengine.model.tls.exception.LogException;

public final class FailureClassifier {
    private FailureClassifier() {
    }

    public static FailureType classify(LogException e) {
        return e == null ? FailureType.NETWORK : classifyHttpCode(e.getHttpCode());
    }

    public static FailureType classifyHttpCode(int httpCode) {
        if (httpCode == ProducerConfig.TOO_MANY_REQUEST_ERROR) {
            return FailureType.THROTTLED;
        }
        if (httpCode >= ProducerConfig.EXTERNAL_ERROR) {
            return FailureType.SERVER;
        }
        if (httpCode == 0) {
            return FailureType.NETWORK;
        }
        return FailureType.PERMANENT;
    }

    public static boolean shouldRetry(FailureType type) {
        return type == FailureType.THROTTLED || type == FailureType.SERVER || type == FailureType.NETWORK;
    }

    public static boolean shouldRecordCircuitFailure(FailureType type) {
        return shouldRetry(type);
    }
}
