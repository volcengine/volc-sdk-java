package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchPushStreamAvgMetricsBody
 */
@lombok.Data
public final class DescribeLiveBatchPushStreamAvgMetricsBody  {

    /**
     * <p>推流域名，您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中的 AppName 字段取值相同，查询流粒度数据时必传，且需同时传入 `Stream`。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度的监控数据时，需同时指定 `App` 和 `Stream` 来指定直播流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，预置与直播流地址中的 StreamName 字段取值相同，查询流粒度数据时必传，且需同时传入 `Stream`。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度的监控数据时，需同时指定 `App` 和 `Stream` 来指定直播流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 1 天，历史查询最大时间范围为 366 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     * <p>- `5`：5 秒；</p>
     *
     * <p>- `30`：30 秒；</p>
     *
     * <p>- `60`：（默认值）1 分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
