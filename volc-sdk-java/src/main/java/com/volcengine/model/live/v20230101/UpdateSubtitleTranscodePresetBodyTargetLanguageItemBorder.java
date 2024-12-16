package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSubtitleTranscodePresetBodyTargetLanguageItemBorder
 */
@lombok.Data
public final class UpdateSubtitleTranscodePresetBodyTargetLanguageItemBorder  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Float width;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
