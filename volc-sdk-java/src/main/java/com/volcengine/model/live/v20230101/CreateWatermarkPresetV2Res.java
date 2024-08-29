package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateWatermarkPresetV2Res
 */
@lombok.Data
public final class CreateWatermarkPresetV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateWatermarkPresetV2ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateWatermarkPresetV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
