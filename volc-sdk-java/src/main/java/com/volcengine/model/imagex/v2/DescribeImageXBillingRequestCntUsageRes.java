package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXBillingRequestCntUsageRes
 */
@lombok.Data
public final class DescribeImageXBillingRequestCntUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXBillingRequestCntUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXBillingRequestCntUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
