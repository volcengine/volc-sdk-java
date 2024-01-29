package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadFileSizeRes
 */
@lombok.Data
public final class DescribeImageXUploadFileSizeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadFileSizeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadFileSizeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
