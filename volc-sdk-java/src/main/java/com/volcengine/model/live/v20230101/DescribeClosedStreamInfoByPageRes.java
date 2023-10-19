package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeClosedStreamInfoByPageRes
 */
@lombok.Data
public final class DescribeClosedStreamInfoByPageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeClosedStreamInfoByPageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeClosedStreamInfoByPageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
