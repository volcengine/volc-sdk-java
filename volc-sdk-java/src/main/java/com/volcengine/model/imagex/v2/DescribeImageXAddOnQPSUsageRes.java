package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXAddOnQPSUsageRes
 */
@lombok.Data
public final class DescribeImageXAddOnQPSUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXAddOnQPSUsageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXAddOnQPSUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
