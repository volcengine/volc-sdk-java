package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXExceedResolutionRatioAllRes
 */
@lombok.Data
public final class DescribeImageXExceedResolutionRatioAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXExceedResolutionRatioAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXExceedResolutionRatioAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
