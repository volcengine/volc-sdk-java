package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRelaySourceV4Res
 */
@lombok.Data
public final class ListRelaySourceV4Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListRelaySourceV4ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListRelaySourceV4ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
