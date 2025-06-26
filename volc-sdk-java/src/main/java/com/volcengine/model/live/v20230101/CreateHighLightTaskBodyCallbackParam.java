package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyCallbackParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyCallbackParam  {

    /**
     * <p>回调类型。当前仅支持 `0`，表示 HTTP 回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private Integer callbackType;

    /**
     * <p>HTTP 回调相关参数配置，包含回调地址 `CallbackAdr`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HttpParams")
    private CreateHighLightTaskBodyCallbackParamHttpParams httpParams;

    /**
     * <p>自定义参数，通过回调直接透传，便于您自定义标识，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackExtra")
    private String callbackExtra;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
