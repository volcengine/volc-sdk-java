package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSubtitleTranscodePresetBodyTargetLanguageItemBorder
 */
@lombok.Data
public final class CreateSubtitleTranscodePresetBodyTargetLanguageItemBorder  {

    /**
     * <p>填0的时候后端根据字体大小进行计算，字体大小/32*1.25</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Float width;

    /**
     * <p>阴影颜色</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
