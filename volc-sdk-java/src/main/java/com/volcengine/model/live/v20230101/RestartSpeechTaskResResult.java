package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartSpeechTaskResResult
 */
@lombok.Data
public final class RestartSpeechTaskResResult  {

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
