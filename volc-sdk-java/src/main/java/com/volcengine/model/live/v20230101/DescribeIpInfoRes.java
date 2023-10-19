package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeIpInfoRes
 */
@lombok.Data
public final class DescribeIpInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeIpInfoResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeIpInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
