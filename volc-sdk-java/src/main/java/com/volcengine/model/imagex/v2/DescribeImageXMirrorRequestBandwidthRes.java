package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMirrorRequestBandwidthRes
 */
@lombok.Data
public final class DescribeImageXMirrorRequestBandwidthRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXMirrorRequestBandwidthResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXMirrorRequestBandwidthResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
