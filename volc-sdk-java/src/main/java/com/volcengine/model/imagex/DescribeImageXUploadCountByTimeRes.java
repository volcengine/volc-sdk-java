package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadCountByTimeRes
 */
@lombok.Data
public final class DescribeImageXUploadCountByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadCountByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadCountByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
