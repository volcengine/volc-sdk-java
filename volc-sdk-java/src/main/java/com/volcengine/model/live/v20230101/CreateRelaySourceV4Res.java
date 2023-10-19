package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRelaySourceV4Res
 */
@lombok.Data
public final class CreateRelaySourceV4Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateRelaySourceV4ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateRelaySourceV4ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
