package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetSpeechConfigResResult
 */
@lombok.Data
public final class GetSpeechConfigResResult  {

    /**
     * <p>状态码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private Integer code;

    /**
     * <p>状态信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private GetSpeechConfigResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
