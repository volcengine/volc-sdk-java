package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetRes
 */
@lombok.Data
public final class CreateWatermarkPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateWatermarkPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateWatermarkPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
