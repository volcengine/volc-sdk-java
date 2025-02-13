package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetResResult
 */
@lombok.Data
public final class CreateTranscodePresetResResult  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
