package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestTrafficRes
 */
@lombok.Data
public final class DescribeImageXEdgeRequestTrafficRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXEdgeRequestTrafficResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXEdgeRequestTrafficResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
