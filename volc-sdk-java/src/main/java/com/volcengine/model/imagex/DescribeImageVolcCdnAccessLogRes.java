package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageVolcCdnAccessLogRes
 */
@lombok.Data
public final class DescribeImageVolcCdnAccessLogRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageVolcCdnAccessLogResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageVolcCdnAccessLogResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
