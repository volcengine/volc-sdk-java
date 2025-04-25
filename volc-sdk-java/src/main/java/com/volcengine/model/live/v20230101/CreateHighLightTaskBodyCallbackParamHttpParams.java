package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyCallbackParamHttpParams
 */
@lombok.Data
public final class CreateHighLightTaskBodyCallbackParamHttpParams  {

    /**
     * <p>HTTP 回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackAdr")
    private String callbackAdr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
