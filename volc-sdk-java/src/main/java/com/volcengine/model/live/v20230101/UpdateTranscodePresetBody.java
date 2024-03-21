package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTranscodePresetBody
 */
@lombok.Data
public final class UpdateTranscodePresetBody  {

    /**
     * <p>音频编码格式，支持以下 3 种类型。</p>
     *
     * <p>- aac：使用 AAC 编码格式；</p>
     *
     * <p>- copy：不进行转码，所有音频编码参数不生效；</p>
     *
     * <p>- opus：使用 Opus 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>宽高自适应模式开关，默认值为 0。支持的取值及含义如下。</p>
     *
     * <p>- 0：关闭宽高自适应</p>
     *
     * <p>- 1：开启宽高自适应</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 关闭宽高自适应时，转码配置分辨率取 `Width` 和 `Height` 的值对转码视频进行拉伸；</p>
     *
     * <p>- 开启宽高自适应时，转码配置分辨率按照 `ShortSide` 、 `LongSide` 、`Width` 、`Height` 的优先级取值，另一边等比缩放。</p>
     *
     * <p>- 修改 `As` 为 0 时，请确认 `Width` 和 `Height` 的取值是否超出阈值；</p>
     *
     * <p>- 修改 `As` 为 1 时，请确认 `ShortSide` 和 `LongSide` 的取值是否超出阈值。</p>
     *
     * <p>:::</p>
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
     * <p>2 个参考帧之间的最大 B 帧数，默认值为 3。配置不同的视频编码格式时，最大 B 帧数的取值存在如下差异。</p>
     *
     * <p>- H.264：取值范围为 [0,7]；</p>
     *
     * <p>- H.265：取值范围为 [0,3]、7、15；</p>
     *
     * <p>- H.266：取值范围为 [0,3]、7、15。</p>
     *
     *
     *
     * <p>取值为 0 时，表示去除 B 帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>视频帧率，单位为 fps，默认值为 25，帧率越大，画面越流畅。</p>
     *
     * <p>配置不同视频编码格式时，视频帧率的取值存在如下差异。</p>
     *
     * <p>- H.264：取值范围为 [0,60]；</p>
     *
     * <p>- H.265：取值范围为 [0,60]；</p>
     *
     * <p>- H.266：取值范围为 [0,35]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为秒，默认值为 4，取值范围为 [1,20]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频高度，默认值为 0。配置不同视频编码格式时，视频高度的取值存在如下差异。</p>
     *
     * <p>- H.264：取值范围为 [150,1920]；</p>
     *
     * <p>- H.265：取值范围为 [150,1920]。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 时，参数生效；反之则不生效；</p>
     *
     * <p>- 编码格式为 H.266 时，不支持设置 Width 和 Height，请使用自适应配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度，配置不同的视频编码方式和转码类型时，长边长度的取值范围存在如下差异。</p>
     *
     * <p>- `Roi` 取 false 时：</p>
     *
     * <p>	- H.264：取值范围为 0 和 [150,4096]；</p>
     *
     * <p>	- H.265：取值范围为 0 和 [150,7680]；</p>
     *
     * <p>	- H.266：取值范围为 0 和 [150,1280]。</p>
     *
     * <p>- `Roi` 取 true 时：</p>
     *
     * <p>	- H.264：取值范围为 0 和 [150,1920]；</p>
     *
     * <p>	- H.265：取值范围为 0 和 [150,1920]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 即开启宽高自适应时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 、 `ShortSide` 、`Width` 、`Height` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongSide")
    private Integer longSide;

    /**
     * <p>转码配置的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>是否极智超清转码，取值及含义如下。</p>
     *
     * <p>- true：极智超清转码；</p>
     *
     * <p>- false：标准转码。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 修改 `Roi` 为 true，且 `As` 为 1 时，请确认 `ShortSide` 和 `LongSide` 的取值是否超出阈值。</p>
     *
     * <p>- 视频编码格式为 H.266 时，转码类型不支持极智超清转码。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>短边长度，配置不同的视频编码方式和转码类型时，短边长度的取值范围存在如下差异。</p>
     *
     * <p>- `ParamType` 取 hvq 时：</p>
     *
     * <p>	- H.264：取值范围为 0 和 [150,1280]；</p>
     *
     * <p>	- H.265：取值范围为 0 和 [150,1280]；</p>
     *
     * <p>- `Roi` 取 false 时：</p>
     *
     * <p>	- H.264：取值范围为 0 和 [150,2160]；</p>
     *
     * <p>	- H.265：取值范围为 0 和 [150,4096]；</p>
     *
     * <p>	- H.266：取值范围为 0 和 [150,720]。</p>
     *
     * <p>- `Roi` 取 true 时：</p>
     *
     * <p>	- H.264：取值范围为 0 和 [150,1920]；</p>
     *
     * <p>	- H.265：取值范围为 0 和 [150,1920]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 即开启宽高自适应时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 、 `ShortSide` 、`Width` 、`Height` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortSide")
    private Integer shortSide;

    /**
     * <p>转码停止时长，支持触发方式为拉流转码时设置，表示断开拉流后转码停止的时长，单位为秒，取值范围为 -1 和 [0,300]，-1 表示不停止转码，默认值为 60。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopInterval")
    private Integer stopInterval;

    /**
     * <p>转码流后缀名。支持 10 个字符以内的大小写字母、下划线与中划线，常见后缀包括：_sd、_hd、_uhd。</p>
     *
     * <p>例如，配置的转码流后缀名为_hd，则拉转码流时转码的流名为 stream-123456789_hd。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>视频编码格式，支持的取值及含义如下所示。</p>
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
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>视频码率，单位为 bps，默认值为 1000000；取 0 时，表示使用源流码率。</p>
     *
     * <p>配置不同的视频编码格式时，视频码率的取值范围存在如下差异。</p>
     *
     * <p>- H.264：取值范围为 [0,30000000]；</p>
     *
     * <p>- H.265：取值范围为 [0,30000000]；</p>
     *
     * <p>- H.266：取值范围为 [0,6000000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>视频宽度，默认值为 0。配置不同视频编码格式时，视频宽度的取值存在如下差异。</p>
     *
     * <p>- H.264：取值范围为 [150,1920]；</p>
     *
     * <p>- H.265：取值范围为 [150,1920]。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 即关闭宽高自适应时，转码分辨率将取 Width 和 Height 的值对转码视频进行拉伸；</p>
     *
     * <p>- Width 和 Height 任一配置为 0 时，转码视频将保持源流尺寸；</p>
     *
     * <p>- 编码格式为 H.266 时，不支持设置 Width 和 Height，请使用自适应配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>转码触发方式，默认值为 Pull，支持的取值及含义如下。</p>
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
     * <p>- SDR：输出为SDR</p>
     *
     * <p>- HDR：输出为HDR</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DynamicRange")
    private String dynamicRange;

    /**
     * <p>是否开启智能插帧，只对画质增强类型生效</p>
     *
     * <p>- 0：不开启</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FISwitch")
    private Integer fISwitch;

    /**
     * <p>转码模板参数的类型</p>
     *
     * <p>- hvq：表示使用画质增强</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamType")
    private String paramType;

    /**
     * <p>使用场景，画质增强时生效</p>
     *
     *
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
