package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskBodyMixedRulesOutputAudio
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesOutputAudio  {

    /**
     * <p>混流输出流的音频码率，单位为 bps，取值范围为 [128000,320000]，常见取值及含义如下所示。</p>
     *
     * <p>- `128000`：128 kbps；</p>
     *
     * <p>- `144000`：144 kbps；</p>
     *
     * <p>- `256000`：256 kbps；</p>
     *
     * <p>- `320000`：320 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BitRate")
    private Integer bitRate;

    /**
     * <p>混流输出流的音频声道设置，取值及含义如下所示。</p>
     *
     * <p>- `mono`：单声道；</p>
     *
     * <p>- `stereo`：立体声。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChannelLayout")
    private String channelLayout;

    /**
     * <p>混流输出流的音频采样率，单位为 HZ，常见取值及含义如下所示。</p>
     *
     * <p>-	`32000`：32 kHZ；</p>
     *
     * <p>-	`44100`：44.1 kHZ；</p>
     *
     * <p>-	`48000`：48 kHZ。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SampleRate")
    private Integer sampleRate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
