package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleCacheHitRateByTimeRes
 */
@lombok.Data
public final class DescribeImageXSensibleCacheHitRateByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSensibleCacheHitRateByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSensibleCacheHitRateByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
