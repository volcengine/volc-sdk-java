package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMirrorRequestHttpCodeOverviewRes
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeOverviewRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXMirrorRequestHttpCodeOverviewResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXMirrorRequestHttpCodeOverviewResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
