package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXUploadSegmentSpeedByTimeRes
 */
@lombok.Data
public final class DescribeImageXUploadSegmentSpeedByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXUploadSegmentSpeedByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXUploadSegmentSpeedByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
