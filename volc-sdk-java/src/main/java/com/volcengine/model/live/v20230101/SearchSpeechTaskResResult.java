package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * SearchSpeechTaskResResult
 */
@lombok.Data
public final class SearchSpeechTaskResResult  {

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
     * <p>任务数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private SearchSpeechTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
