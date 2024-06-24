package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeEncryptDRMRes
 */
@lombok.Data
public final class DescribeEncryptDRMRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeEncryptDRMResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeEncryptDRMResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
