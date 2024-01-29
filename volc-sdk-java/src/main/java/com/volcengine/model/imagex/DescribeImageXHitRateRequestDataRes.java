package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHitRateRequestDataRes
 */
@lombok.Data
public final class DescribeImageXHitRateRequestDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHitRateRequestDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHitRateRequestDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
