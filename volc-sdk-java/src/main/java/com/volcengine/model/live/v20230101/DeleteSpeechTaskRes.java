package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSpeechTaskRes
 */
@lombok.Data
public final class DeleteSpeechTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteSpeechTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteSpeechTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
