package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCDNTopRequestDataRes
 */
@lombok.Data
public final class DescribeImageXCDNTopRequestDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXCDNTopRequestDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXCDNTopRequestDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
