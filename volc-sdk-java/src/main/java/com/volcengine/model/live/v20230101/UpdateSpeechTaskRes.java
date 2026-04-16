package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSpeechTaskRes
 */
@lombok.Data
public final class UpdateSpeechTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateSpeechTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateSpeechTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
