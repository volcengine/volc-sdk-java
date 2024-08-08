package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSourceRequestBandwidthRes
 */
@lombok.Data
public final class DescribeImageXSourceRequestBandwidthRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSourceRequestBandwidthResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSourceRequestBandwidthResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
