package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXDomainBandwidthDataRes
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXDomainBandwidthDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXDomainBandwidthDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
