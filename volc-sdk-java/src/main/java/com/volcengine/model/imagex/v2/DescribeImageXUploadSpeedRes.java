package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadSpeedRes
 */
@lombok.Data
public final class DescribeImageXUploadSpeedRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadSpeedResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadSpeedResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
