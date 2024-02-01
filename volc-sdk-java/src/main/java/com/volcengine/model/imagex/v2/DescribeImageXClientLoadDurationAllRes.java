package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientLoadDurationAllRes
 */
@lombok.Data
public final class DescribeImageXClientLoadDurationAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientLoadDurationAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientLoadDurationAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
