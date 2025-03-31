package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXAIRequestCntUsageRes
 */
@lombok.Data
public final class DescribeImageXAIRequestCntUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXAIRequestCntUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXAIRequestCntUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
