package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeEncryptHLSRes
 */
@lombok.Data
public final class DescribeEncryptHLSRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeEncryptHLSResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeEncryptHLSResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
