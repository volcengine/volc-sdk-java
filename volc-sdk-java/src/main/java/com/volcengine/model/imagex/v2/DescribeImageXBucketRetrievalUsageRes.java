package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXBucketRetrievalUsageRes
 */
@lombok.Data
public final class DescribeImageXBucketRetrievalUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXBucketRetrievalUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXBucketRetrievalUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
