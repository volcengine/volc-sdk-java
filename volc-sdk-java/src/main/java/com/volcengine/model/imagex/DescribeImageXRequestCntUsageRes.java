package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXRequestCntUsageRes
 */
@lombok.Data
public final class DescribeImageXRequestCntUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXRequestCntUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXRequestCntUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
