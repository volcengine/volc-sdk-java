package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleExtra
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleExtra  {

    /**
     * <p>混音配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AMix")
    private CreateSpeechTaskBodyRuleExtraAMix aMix;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
