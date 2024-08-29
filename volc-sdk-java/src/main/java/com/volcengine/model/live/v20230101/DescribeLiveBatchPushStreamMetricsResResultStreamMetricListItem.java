package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItem  {

    /**
     * <p>推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>按指定时间粒度聚合的监控数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MetricList")
    private List<DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItemMetricListItem> metricList;

    /**
     * <p>标记一路推流的唯一 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionID")
    private String sessionID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
