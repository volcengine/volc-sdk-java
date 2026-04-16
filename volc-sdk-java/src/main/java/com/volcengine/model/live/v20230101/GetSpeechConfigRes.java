package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetSpeechConfigRes
 */
@lombok.Data
public final class GetSpeechConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetSpeechConfigResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetSpeechConfigResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
