package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnSuccessRateAllRes
 */
@lombok.Data
public final class DescribeImageXCdnSuccessRateAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnSuccessRateAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnSuccessRateAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
