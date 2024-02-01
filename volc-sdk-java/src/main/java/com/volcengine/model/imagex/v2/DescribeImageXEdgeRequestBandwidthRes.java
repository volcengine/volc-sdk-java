package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestBandwidthRes
 */
@lombok.Data
public final class DescribeImageXEdgeRequestBandwidthRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXEdgeRequestBandwidthResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXEdgeRequestBandwidthResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
