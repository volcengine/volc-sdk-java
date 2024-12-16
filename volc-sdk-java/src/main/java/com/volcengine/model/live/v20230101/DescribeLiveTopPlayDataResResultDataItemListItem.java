package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTopPlayDataResResultDataItemListItem
 */
@lombok.Data
public final class DescribeLiveTopPlayDataResResultDataItemListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>直播流的 AppName，查询类型为 `Stream` 时返回该信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流的 StreamName，查询类型为 `Stream` 时返回该信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>查询时间范围内当前域名或直播流的峰值带宽，单位为 bps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakBandwidth")
    private Float peakBandwidth;

    /**
     * <p>查询时间范围内当前域名或直播流的平均带宽，单位为 bps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgBandwidth")
    private Float avgBandwidth;

    /**
     * <p>查询时间范围内当前域名或直播流的流量加和，单位为 Byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalTraffic")
    private Float totalTraffic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
