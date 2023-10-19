package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSnapshotPresetResResultPresetListItemSlicePreset
 */
@lombok.Data
public final class ListVhostSnapshotPresetResResultPresetListItemSlicePreset  {

    /**
     * <p>截图在 ToS 中的存储位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>回调信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetail")
    private List<ListVhostSnapshotPresetResResultPresetListItemSlicePresetCallbackDetailItem> callbackDetail;

    /**
     * <p>截图间隔时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>截图模版名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>veImageX 的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>截图模版状态。</p>
     *
     *
     *
     * <p>- 1：开启</p>
     *
     * <p>- 0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
