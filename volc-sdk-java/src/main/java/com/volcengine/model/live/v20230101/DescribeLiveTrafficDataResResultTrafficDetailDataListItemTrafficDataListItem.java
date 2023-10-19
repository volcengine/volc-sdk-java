package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 时间，例如，2022-04-13T00:00:00+08:00</p>
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
