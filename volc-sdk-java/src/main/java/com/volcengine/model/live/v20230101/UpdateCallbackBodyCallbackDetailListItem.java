package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCallbackBodyCallbackDetailListItem
 */
@lombok.Data
public final class UpdateCallbackBodyCallbackDetailListItem  {

    /**
     * <p>回调类型，支持设置为 HTTP，表示可以使用 HTTP 和 HTTPS 接收回调事件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    /**
     * <p>回调的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
