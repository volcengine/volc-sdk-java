package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestRegionsRes
 */
@lombok.Data
public final class DescribeImageXEdgeRequestRegionsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXEdgeRequestRegionsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXEdgeRequestRegionsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
