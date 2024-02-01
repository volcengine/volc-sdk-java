package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadErrorCodeByTimeRes
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadErrorCodeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadErrorCodeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
