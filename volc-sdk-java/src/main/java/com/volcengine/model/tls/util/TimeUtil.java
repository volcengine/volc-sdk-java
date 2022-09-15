package com.volcengine.model.tls.util;

import com.google.common.math.LongMath;

public class TimeUtil {
    public static final int BASE_RETRY_MS = 100;
    public static final int MAX_RETRY_MS = 50 * 1000;

    private TimeUtil() {
    }

    //
    public static long calBackOffMs(long baseBackOff, long maxBackOff, int retry) {
        long retryBackoffMs = baseBackOff * LongMath.pow(2, retry);
        if (retryBackoffMs <= 0) {
            retryBackoffMs = maxBackOff;
        }
        return Math.min(retryBackoffMs, maxBackOff);
    }

    public static long calDefaultBackOffMs(int retry) {
        return calBackOffMs(BASE_RETRY_MS, MAX_RETRY_MS, retry);
    }
}
