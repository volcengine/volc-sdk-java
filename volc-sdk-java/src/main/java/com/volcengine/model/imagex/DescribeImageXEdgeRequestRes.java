package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestRes
 */
@lombok.Data
public final class DescribeImageXEdgeRequestRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXEdgeRequestResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXEdgeRequestResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
