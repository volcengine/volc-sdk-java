package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetResResultPresetListItemSlicePresetCallbackDetail
 */
@lombok.Data
public final class ListVhostSnapshotPresetResResultPresetListItemSlicePresetCallbackDetail  {

    /**
     * <p>回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>回调类型。</p>
     *
     *
     *
     * <p>- http</p>
     *
     * <p>- nsq</p>
     *
     * <p>- kafka</p>
     *
     * <p>- rpc</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
