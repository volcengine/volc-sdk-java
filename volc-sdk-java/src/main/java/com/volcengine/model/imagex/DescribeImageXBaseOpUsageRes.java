package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXBaseOpUsageRes
 */
@lombok.Data
public final class DescribeImageXBaseOpUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXBaseOpUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXBaseOpUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
