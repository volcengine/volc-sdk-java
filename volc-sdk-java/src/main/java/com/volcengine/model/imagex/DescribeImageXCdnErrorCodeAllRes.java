package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnErrorCodeAllRes
 */
@lombok.Data
public final class DescribeImageXCdnErrorCodeAllRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnErrorCodeAllResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnErrorCodeAllResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
