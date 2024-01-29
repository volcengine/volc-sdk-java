package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientErrorCodeByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientErrorCodeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientErrorCodeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
