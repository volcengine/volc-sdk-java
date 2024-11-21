package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeErrorCodeByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeErrorCodeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeErrorCodeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeErrorCodeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
