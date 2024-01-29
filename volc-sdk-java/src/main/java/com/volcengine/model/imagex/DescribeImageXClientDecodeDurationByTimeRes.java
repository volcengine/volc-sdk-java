package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientDecodeDurationByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientDecodeDurationByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientDecodeDurationByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientDecodeDurationByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
