package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXDomainBandwidthNinetyFiveDataResResult
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthNinetyFiveDataResResult  {

    /**
     * <p>带宽 95 值，单位为 bps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BpsData")
    private Double bpsData;

    /**
     * <p>统计时间点。日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm，比如2019-06-02T00:00:00+08:00。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
