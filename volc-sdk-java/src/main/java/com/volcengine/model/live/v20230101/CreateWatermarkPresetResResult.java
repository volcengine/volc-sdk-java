package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetResResult
 */
@lombok.Data
public final class CreateWatermarkPresetResResult  {

    /**
     * <p>水印模版 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
