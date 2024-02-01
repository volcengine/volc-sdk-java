package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfig
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfig  {

    /**
     * <p>图片格式为 JPEG 时的截图参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JpegParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParam jpegParam;

    /**
     * <p>截图间隔时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>截图格式为 JPG 时的截图参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JpgParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpgParam jpgParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
