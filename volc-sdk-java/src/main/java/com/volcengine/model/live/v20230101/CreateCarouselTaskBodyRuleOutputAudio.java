package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskBodyRuleOutputAudio
 */
@lombok.Data
public final class CreateCarouselTaskBodyRuleOutputAudio  {

    /**
     * <p>音频码率的设置范围，支持的取值为 `[128000, 640000]`，单位为 `bps`。如果指定了 `Audio` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BitRate")
    private Integer bitRate;

    /**
     * <p>音频的声道布局，如果指定了 `Audio` 对象，则该字段为必填项。支持以下取值：</p>
     *
     *
     *
     * <p>- `mono`：单声道。</p>
     *
     * <p>- `stereo`：双声道。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChannelLayout")
    private String channelLayout;

    /**
     * <p>音频的采样率参数，如果指定了 `Audio` 对象，则该字段为必填项。支持的采样率值包括：</p>
     *
     *
     *
     * <p>- `22000`</p>
     *
     * <p>- `32000`</p>
     *
     * <p>- `44100`</p>
     *
     * <p>- `48000`</p>
     *
     *
     *
     * <p>请选择适合您的业务需求的采样率进行配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SampleRate")
    private Integer sampleRate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
