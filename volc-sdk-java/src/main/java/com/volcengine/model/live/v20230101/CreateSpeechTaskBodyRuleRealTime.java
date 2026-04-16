package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleRealTime
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleRealTime  {

    /**
     * <p>是否开启同传声音功能。默认值为 `false`。取值如下：</p>
     *
     * <p>- `true`：开启。开启后，将提供带有音色复刻效果的翻译语音。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VoiceShow")
    private Boolean voiceShow;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
