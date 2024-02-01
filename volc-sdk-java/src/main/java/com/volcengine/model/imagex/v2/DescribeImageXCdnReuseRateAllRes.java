package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnReuseRateAllRes
 */
@lombok.Data
public final class DescribeImageXCdnReuseRateAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnReuseRateAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnReuseRateAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
