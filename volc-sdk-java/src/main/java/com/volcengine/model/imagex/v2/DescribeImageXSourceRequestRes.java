package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSourceRequestRes
 */
@lombok.Data
public final class DescribeImageXSourceRequestRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSourceRequestResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSourceRequestResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
