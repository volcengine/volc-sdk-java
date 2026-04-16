package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * SearchSpeechTaskRes
 */
@lombok.Data
public final class SearchSpeechTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private SearchSpeechTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private SearchSpeechTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
