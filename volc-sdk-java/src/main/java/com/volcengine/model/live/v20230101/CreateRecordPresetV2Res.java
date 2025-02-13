package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2Res
 */
@lombok.Data
public final class CreateRecordPresetV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateRecordPresetV2ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateRecordPresetV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
