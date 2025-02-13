package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetV2Res
 */
@lombok.Data
public final class CreateSnapshotPresetV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateSnapshotPresetV2ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateSnapshotPresetV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
