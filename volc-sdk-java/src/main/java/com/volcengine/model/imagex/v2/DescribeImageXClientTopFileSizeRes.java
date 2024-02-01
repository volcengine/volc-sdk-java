package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopFileSizeRes
 */
@lombok.Data
public final class DescribeImageXClientTopFileSizeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientTopFileSizeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientTopFileSizeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
