package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXDomainBandwidthNinetyFiveDataResResult
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthNinetyFiveDataResResult  {

    /**
     * <p>带宽95值，单位bps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BpsData")
    private Double bpsData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
