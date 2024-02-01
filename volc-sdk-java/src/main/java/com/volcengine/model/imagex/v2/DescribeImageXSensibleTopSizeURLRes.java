package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopSizeURLRes
 */
@lombok.Data
public final class DescribeImageXSensibleTopSizeURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleTopSizeURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleTopSizeURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
