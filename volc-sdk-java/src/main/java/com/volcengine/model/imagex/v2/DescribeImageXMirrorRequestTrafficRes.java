package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMirrorRequestTrafficRes
 */
@lombok.Data
public final class DescribeImageXMirrorRequestTrafficRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXMirrorRequestTrafficResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXMirrorRequestTrafficResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
