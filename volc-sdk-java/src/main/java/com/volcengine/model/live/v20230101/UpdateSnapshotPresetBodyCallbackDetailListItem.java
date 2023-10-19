package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSnapshotPresetBodyCallbackDetailListItem
 */
@lombok.Data
public final class UpdateSnapshotPresetBodyCallbackDetailListItem  {

    /**
     * <p>回调类型，默认值为 http。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    /**
     * <p>回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
