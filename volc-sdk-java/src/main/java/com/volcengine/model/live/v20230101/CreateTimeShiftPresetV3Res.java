package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTimeShiftPresetV3Res
 */
@lombok.Data
public final class CreateTimeShiftPresetV3Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateTimeShiftPresetV3ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateTimeShiftPresetV3ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
