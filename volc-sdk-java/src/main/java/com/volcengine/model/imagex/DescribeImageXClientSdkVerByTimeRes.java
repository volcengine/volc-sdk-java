package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientSdkVerByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientSdkVerByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientSdkVerByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientSdkVerByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
