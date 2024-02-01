package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopQualityURLRes
 */
@lombok.Data
public final class DescribeImageXClientTopQualityURLRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientTopQualityURLResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientTopQualityURLResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
