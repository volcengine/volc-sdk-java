package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHeifEncodeDurationByTimeRes
 */
@lombok.Data
public final class DescribeImageXHeifEncodeDurationByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXHeifEncodeDurationByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXHeifEncodeDurationByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
