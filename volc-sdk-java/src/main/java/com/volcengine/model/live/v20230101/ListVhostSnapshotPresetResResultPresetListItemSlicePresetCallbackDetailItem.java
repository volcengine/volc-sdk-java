package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetResResultPresetListItemSlicePresetCallbackDetailItem
 */
@lombok.Data
public final class ListVhostSnapshotPresetResResultPresetListItemSlicePresetCallbackDetailItem  {

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
