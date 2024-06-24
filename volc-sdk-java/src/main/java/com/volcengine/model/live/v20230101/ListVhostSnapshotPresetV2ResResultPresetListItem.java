package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItem
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图配置基础信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SlicePresetV2")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2 slicePresetV2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
