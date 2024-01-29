package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXScreenshotUsageRes
 */
@lombok.Data
public final class DescribeImageXScreenshotUsageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXScreenshotUsageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXScreenshotUsageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
