package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientErrorCodeAllRes
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientErrorCodeAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientErrorCodeAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
