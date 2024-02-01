package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopResolutionURLRes
 */
@lombok.Data
public final class DescribeImageXSensibleTopResolutionURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleTopResolutionURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleTopResolutionURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
