package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSubtitleTranscodePresetBodySIConfig
 */
@lombok.Data
public final class UpdateSubtitleTranscodePresetBodySIConfig  {

    /**
     * <p>是否开启声影同传模式。取值如下：</p>
     *
     * <p>- `true`：开启声影同传模式。支持输出字幕文本、复刻音色并同步口型，提供沉浸式体验。</p>
     *
     * <p>- `false`：关闭声影同传模式，开启纯字幕模式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>是否开启数字人口型功能。取值如下：</p>
     *
     * <p>- `true`：开启。开启后，人物口型将与翻译后的语音同步，提升直播的沉浸感。</p>
     *
     * <p>- `false`：关闭。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 仅在 `Pipe` 取值为空或 `si` 时生效。</p>
     *
     * <p>- 取值为 `true` 时，默认开启同传声音功能。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DigitalHumanMouthShape")
    private Boolean digitalHumanMouthShape;

    /**
     * <p>声影同传类型。取值如下：</p>
     *
     * <p>- `si`：支持开启同传声音和数字人口型功能。适用于对沉浸感要求较高的会议直播等场景。</p>
     *
     * <p>- `mix`：仅字幕。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pipe")
    private String pipe;

    /**
     * <p>是否开启同传声音功能。取值如下：</p>
     *
     * <p>- 大于 `0`：开启。开启后，将提供带有音色复刻效果的翻译语音。</p>
     *
     * <p>- 等于 `0`：关闭。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅在 `Pipe` 取值为空或 `si` 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpeakerRecognition")
    private Integer speakerRecognition;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
