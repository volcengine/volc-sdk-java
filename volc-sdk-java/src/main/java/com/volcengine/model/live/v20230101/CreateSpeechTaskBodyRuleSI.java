package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSI
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSI  {

    /**
     * <p>是否开启数字人口型功能。默认值为 `false`。取值如下：</p>
     *
     * <p>- `true`：开启。开启后，人物口型将与翻译后的语音同步，提升直播的沉浸感。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LipSync")
    private Boolean lipSync;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
