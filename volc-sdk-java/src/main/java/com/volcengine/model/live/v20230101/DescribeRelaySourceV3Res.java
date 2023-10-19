package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceV3Res
 */
@lombok.Data
public final class DescribeRelaySourceV3Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeRelaySourceV3ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeRelaySourceV3ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
