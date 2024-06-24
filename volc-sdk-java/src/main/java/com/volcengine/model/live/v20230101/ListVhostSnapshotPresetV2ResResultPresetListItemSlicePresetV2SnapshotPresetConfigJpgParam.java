package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpgParam
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpgParam  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TOSParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpgParamTOSParam tOSParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageXParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpgParamImageXParam imageXParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
