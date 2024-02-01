package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServerQPSUsageRes
 */
@lombok.Data
public final class DescribeImageXServerQPSUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXServerQPSUsageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXServerQPSUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
