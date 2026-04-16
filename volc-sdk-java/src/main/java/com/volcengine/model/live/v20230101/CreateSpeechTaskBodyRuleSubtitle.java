package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateSpeechTaskBodyRuleSubtitle
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitle  {

    /**
     * <p>字幕位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Position")
    private CreateSpeechTaskBodyRuleSubtitlePosition position;

    /**
     * <p>原文字幕配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Original")
    private CreateSpeechTaskBodyRuleSubtitleOriginal original;

    /**
     * <p>译文字幕配置。目前仅支持传入一个译文语种。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Translation")
    private List<CreateSpeechTaskBodyRuleSubtitleTranslationItem> translation;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
