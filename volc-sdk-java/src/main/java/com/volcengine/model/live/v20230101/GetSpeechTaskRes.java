package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetSpeechTaskRes
 */
@lombok.Data
public final class GetSpeechTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetSpeechTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetSpeechTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
