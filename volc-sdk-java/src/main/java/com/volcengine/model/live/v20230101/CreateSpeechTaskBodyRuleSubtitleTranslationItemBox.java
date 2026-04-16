package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSubtitleTranslationItemBox
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitleTranslationItemBox  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Float w;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
