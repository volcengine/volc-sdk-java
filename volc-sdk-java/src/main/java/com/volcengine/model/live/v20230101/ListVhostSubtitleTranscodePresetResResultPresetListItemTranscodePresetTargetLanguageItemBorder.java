package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePresetTargetLanguageItemBorder
 */
@lombok.Data
public final class ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePresetTargetLanguageItemBorder  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
