package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItemEdgeStatDataListItem
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItemEdgeStatDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>上行流量，单位 GB</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpTraffic")
    private Float upTraffic;

    /**
     * <p>下行流量，单位 GB</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownTraffic")
    private Float downTraffic;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidth")
    private Float upBandwidth;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidth")
    private Float downBandwidth;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Float request;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
