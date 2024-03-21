package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetResResultCustomizePresetListItemTranscodePreset
 */
@lombok.Data
public final class ListVhostTransCodePresetResResultCustomizePresetListItemTranscodePreset  {

    /**
     * <p>音频编码格式。包括以下 3 种类型。</p>
     *
     *
     *
     * <p>- aac：使用 aac 编码格式；</p>
     *
     * <p>- copy：不进行转码，所有音频编码参数不生效；</p>
     *
     * <p>- opus：使用 opus 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>宽高自适应模式开关。</p>
     *
     *
     *
     * <p>- 0：关闭宽高自适应，按照 `Width` 和 `Height` 的取值进行拉伸；</p>
     *
     * <p>- 1：开启宽高自适应，按照 `ShortSide` 或 `LongSide` 等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "As")
    private String as;

    /**
     * <p>音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Integer audioBitrate;

    /**
     * <p>是否开启转码不超过源流分辨率。开启后，当源流分辨率低于转码配置分辨率时(即源流宽低于转码配置宽且源流高低于转码配置高时)，将按源流视频分辨率进行转码，默认开启。</p>
     *
     * <p>- 0：关闭</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransResolution")
    private Integer autoTransResolution;

    /**
     * <p>是否开启不超过源流码率。开启后，当源流码率低于转码配置码率时，将按照源流视频码率进行转码，默认开启。</p>
     *
     * <p>- 0：关闭</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVb")
    private Integer autoTransVb;

    /**
     * <p>是否开启不超过源流帧率。开启后，当源流帧率低于转码配置帧率时，将按照源流视频帧率进行转码，默认开启。</p>
     *
     * <p>- 0：关闭</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVr")
    private Integer autoTransVr;

    /**
     * <p>2 个参考帧之间的最大 B 帧数。`BFrames` 取 0 时，表示去 B 帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>视频帧率，单位为 fps，帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频高度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 都取 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongSide")
    private Integer longSide;

    /**
     * <p>转码配置名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>是否极智超清转码。</p>
     *
     *
     *
     * <p>- true：极智超清；</p>
     *
     * <p>- false：标准转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>短边长度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 都取 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortSide")
    private Integer shortSide;

    /**
     * <p>转码停止时长，支持触发方式为拉流转码时设置，表示断开拉流后转码停止的时长，单位为 s，取值范围为 [0,300]，-1 表示不停止转码，默认值为 60。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopInterval")
    private Integer stopInterval;

    /**
     * <p>转码流后缀名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>视频编码格式。</p>
     *
     *
     *
     * <p>- h264：使用 H.264 编码格式；</p>
     *
     * <p>- h265：使用 H.265 编码格式；</p>
     *
     * <p>- h266：使用 H.266 编码格式；</p>
     *
     * <p>- copy：不进行转码，所有视频编码参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>视频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>视频宽度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>转码触发方式，默认为拉流转码，支持以下取值。</p>
     *
     * <p>- Push：推流转码，直播推流后会自动启动转码任务，生成转码流；</p>
     *
     * <p>- Pull：拉流转码，直播推流后，需要主动播放转码流才会启动转码任务，生成转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TransType")
    private String transType;

    /**
     * <p>动态范围，画质增强类型生效</p>
     *
     *
     *
     * <p>- SDR：输出为SDR</p>
     *
     * <p>- HDR：输出为HDR</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DynamicRange")
    private String dynamicRange;

    /**
     * <p>是否开启智能插帧，只对画质增强类型生效</p>
     *
     *
     *
     * <p>- 0：不开启</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FISwitch")
    private String fISwitch;

    /**
     * <p>转码模板参数的类型</p>
     *
     *
     *
     * <p>- va：表示使用画质增强</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamType")
    private String paramType;

    /**
     * <p>使用场景，画质增强时生效</p>
     *
     * <p>football：足球场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
