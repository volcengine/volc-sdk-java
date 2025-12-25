package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetV2ResResult
 */
@lombok.Data
public final class CreateWatermarkPresetV2ResResult  {

    /**
     * <p>水印模板的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>水印模板的名称标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
