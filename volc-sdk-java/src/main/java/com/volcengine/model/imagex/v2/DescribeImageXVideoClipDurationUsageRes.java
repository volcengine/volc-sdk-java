package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXVideoClipDurationUsageRes
 */
@lombok.Data
public final class DescribeImageXVideoClipDurationUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXVideoClipDurationUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXVideoClipDurationUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
