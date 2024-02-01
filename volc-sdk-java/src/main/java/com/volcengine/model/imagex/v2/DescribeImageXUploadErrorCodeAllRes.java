package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadErrorCodeAllRes
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadErrorCodeAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadErrorCodeAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
