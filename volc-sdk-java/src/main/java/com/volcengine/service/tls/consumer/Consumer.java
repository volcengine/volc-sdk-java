package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;

public interface Consumer {
    void start() throws LogException;
    void stop() throws InterruptedException;
    void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken);

    /** Returns an immutable local snapshot projected to the explicitly requested view. */
    ConsumerStatsSnapshot getStats(StatsOptions options);

    /** Changes collection level only while the consumer is running. */
    void setMetricsLevel(MetricsLevel level);
}
