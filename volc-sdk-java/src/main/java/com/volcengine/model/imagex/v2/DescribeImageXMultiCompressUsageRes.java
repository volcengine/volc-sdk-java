package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMultiCompressUsageRes
 */
@lombok.Data
public final class DescribeImageXMultiCompressUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXMultiCompressUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXMultiCompressUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
