package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveEdgeStatDataResResultEdgeStatDataListItem
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataResResultEdgeStatDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的 UTC+8 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内产生的总上行流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpTraffic")
    private Float upTraffic;

    /**
     * <p>当前数据聚合时间粒度内产生的总下行流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownTraffic")
    private Float downTraffic;

    /**
     * <p>上行峰值带宽。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidth")
    private Float upBandwidth;

    /**
     * <p>下行峰值带宽。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidth")
    private Float downBandwidth;

    /**
     * <p>请求参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Float request;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
