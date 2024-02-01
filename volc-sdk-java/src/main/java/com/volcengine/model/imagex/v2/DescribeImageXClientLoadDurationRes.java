package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientLoadDurationRes
 */
@lombok.Data
public final class DescribeImageXClientLoadDurationRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientLoadDurationResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientLoadDurationResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
