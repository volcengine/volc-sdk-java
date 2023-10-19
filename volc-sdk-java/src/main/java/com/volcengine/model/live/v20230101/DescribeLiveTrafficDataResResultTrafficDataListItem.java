package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTrafficDataResResultTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveTrafficDataResResultTrafficDataListItem  {

    /**
     * <p>时间片开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>上行流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpTraffic")
    private Float upTraffic;

    /**
     * <p>下行流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownTraffic")
    private Float downTraffic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
