package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXDomainBandwidthNinetyFiveDataRes
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthNinetyFiveDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXDomainBandwidthNinetyFiveDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXDomainBandwidthNinetyFiveDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
