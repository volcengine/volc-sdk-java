package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2  {

    /**
     * <p>截图配置详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotPresetConfig")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfig snapshotPresetConfig;

    /**
     * <p>截图配置名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>截图配置生效状态。</p>
     *
     *
     *
     * <p>- 1：生效；</p>
     *
     * <p>- 0：不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
