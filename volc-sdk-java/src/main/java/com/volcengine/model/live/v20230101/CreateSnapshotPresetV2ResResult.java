package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetV2ResResult
 */
@lombok.Data
public final class CreateSnapshotPresetV2ResResult  {

    /**
     * <p>截图配置名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
