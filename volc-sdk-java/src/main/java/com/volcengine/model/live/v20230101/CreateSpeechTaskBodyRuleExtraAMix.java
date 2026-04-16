package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleExtraAMix
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleExtraAMix  {

    /**
     * <p>原声音量，用于实现同传声音与原声的混合播放。默认值为 `0.2`。取值范围为 `[0, 1.0]`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅在 `Pipe` 取值为 `realtime` 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BGVolume")
    private Float bGVolume;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
