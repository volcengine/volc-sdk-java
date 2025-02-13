package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetRes
 */
@lombok.Data
public final class CreateTranscodePresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateTranscodePresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateTranscodePresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
