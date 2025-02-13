package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2ResResult
 */
@lombok.Data
public final class CreateRecordPresetV2ResResult  {

    /**
     * <p>录制配置 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
