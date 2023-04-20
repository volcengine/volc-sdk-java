package com.volcengine.model.tls.util;

import com.google.common.math.LongMath;

public class TimeUtil {
    private TimeUtil() {
    }

    // 计算重试应该等待的时间间隔
    public static long calcDefaultBackOffMs(int counter, int baseRetryMs, long expectedQuitTimestamp) throws InterruptedException {
        long currentTime = System.currentTimeMillis();
        int randomNum = (int) (Math.random() * counter);
        long sleepTime = (long) randomNum * baseRetryMs;

        if (currentTime + sleepTime < expectedQuitTimestamp) {
            return sleepTime;
        } else {
            return expectedQuitTimestamp - currentTime;
        }
    }
}
