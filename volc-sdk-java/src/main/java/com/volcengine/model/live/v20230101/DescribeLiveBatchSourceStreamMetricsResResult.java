package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchSourceStreamMetricsResResult
 */
@lombok.Data
public final class DescribeLiveBatchSourceStreamMetricsResResult  {

    /**
     * <p>拉流域名。</p>
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
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。</p>
     *
     *
     *
     * <p>- `30`：30 秒；</p>
     *
     * <p>- `60`：1 分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>回源流信息，包含域名、应用名称、流名称和监控数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamMetricList")
    private List<DescribeLiveBatchSourceStreamMetricsResResultStreamMetricListItem> streamMetricList;

    /**
     * <p>数据聚合时间粒度内，动态指标的聚合算法，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `max`：（默认值）计算聚合时间粒度内的最大值；</p>
     *
     * <p>- `avg`：计算聚合时间粒度内的平均值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AggType")
    private String aggType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
