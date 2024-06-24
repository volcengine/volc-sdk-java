package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParamTOSParam
 */
@lombok.Data
public final class UpdateSnapshotPresetV2BodySnapshotPresetConfigJpgParamTOSParam  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverwriteObject")
    private String overwriteObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
