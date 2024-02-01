package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCdnErrorCodeByTimeRes
 */
@lombok.Data
public final class DescribeImageXCdnErrorCodeByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCdnErrorCodeByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCdnErrorCodeByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
