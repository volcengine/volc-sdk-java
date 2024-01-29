package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopRamURLRes
 */
@lombok.Data
public final class DescribeImageXSensibleTopRamURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleTopRamURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleTopRamURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
