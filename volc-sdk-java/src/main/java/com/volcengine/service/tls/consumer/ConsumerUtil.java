package com.volcengine.service.tls.consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConsumerUtil {
    private static final Log LOG = LogFactory.getLog(ConsumerUtil.class);
    public static void sleep(long timeToSleepMillis) {
        try {
            Thread.sleep(timeToSleepMillis);
        } catch (InterruptedException e) {
            LOG.debug("Interrupted while sleeping");
            Thread.currentThread().interrupt();
        }
    }
}
