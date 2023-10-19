package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotAuditPresetBodyCallbackDetailListItem
 */
@lombok.Data
public final class CreateSnapshotAuditPresetBodyCallbackDetailListItem  {

    /**
     * <p>回调的类型 HTTP。</p>
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
