package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopUnknownURLRes
 */
@lombok.Data
public final class DescribeImageXSensibleTopUnknownURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleTopUnknownURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleTopUnknownURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
