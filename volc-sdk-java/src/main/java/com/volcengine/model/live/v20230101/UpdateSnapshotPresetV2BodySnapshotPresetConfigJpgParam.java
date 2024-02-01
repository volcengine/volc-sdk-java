package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParam
 */
@lombok.Data
public final class UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParam  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TOSParam")
    private UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParamTOSParam tOSParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageXParam")
    private UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParamImageXParam imageXParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
