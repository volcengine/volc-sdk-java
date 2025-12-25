package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2  {

    /**
     * <p>录制配置 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>录制配置名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>录制模板详细配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPresetConfig")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfig recordPresetConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
