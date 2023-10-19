package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetBody
 */
@lombok.Data
public final class CreateTranscodePresetBody  {

    /**
     * <p>音频编码格式。默认格式为 acc，支持以下 3 种类型。</p>
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
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>宽高自适应模式开关。默认值为 0。支持的取值包括。</p>
     *
     * <p>- 0：关闭宽高自适应，按照 `Width` 和 `Height` 的取值进行拉伸；</p>
     *
     * <p>- 1：开启宽高自适应，按照 `ShortSide` 或 `LongSide` 等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "As")
    private String as;

    /**
     * <p>音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Integer audioBitrate;

    /**
     * <p>2 个参考帧之间的最大 B 帧数。不同编码格式的取值存在差异。</p>
     *
     * <p>- H.264：取值范围为 [0,7]，默认值为 3；</p>
     *
     * <p>- H.265：取值范围为 [0,1,2,3,7,15]，默认值为 3；</p>
     *
     *
     *
     * <p>`BFrames` 取 0 时，表示去 B 帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>视频帧率，单位为 fps，取值范围为 [0,60]，默认为 25fps。帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为 s，默认值为 0，取值范围为 [0,1000]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频高度。默认值为 0，取值范围为 [0,8192]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 时，参数生效；反之则不生效；</p>
     *
     * <p>- 当 `As` 的取值为 0 时，如果 `Width` 和 `Height` 任意取值为 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度。默认值为 0。</p>
     *
     * <p>- `Roi` 取 false 时，取值范围为 [0,8192]；</p>
     *
     * <p>- `Roi` 取 true 时，取值范围为 [0,1920]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果同时配置 `LongSide` 和 `ShortSide` 的值，则按照 `ShortSide` 进行等比缩放。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongSide")
    private Integer longSide;

    /**
     * <p>是否极智超清转码。默认值为 false。</p>
     *
     * <p>- true：极智超清；</p>
     *
     * <p>- false：标准转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>短边长度。默认值为 0。</p>
     *
     * <p>- `Roi` 取 false 时，取值范围为 [0,4096]；</p>
     *
     * <p>- `Roi` 取 true 时，取值范围为 [0,1080]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果同时配置 `LongSide` 和 `ShortSide` 的值，则按照 `ShortSide` 进行等比缩放。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortSide")
    private Integer shortSide;

    /**
     * <p>转码流后缀名。支持 10 个字符以内的大小写字母、下划线与中划线，常见后缀包括：_sd、_hd、_uhd </p>
     *
     * <p>例如，配置的转码流后缀名为 _hd，则拉转码流时转码的流名为 stream-123456789_hd。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>视频编码格式。</p>
     *
     * <p>- h264：使用 H.264 编码格式；</p>
     *
     * <p>- h265：使用 H.265 编码格式；</p>
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
     * <p>视频码率，单位为 bps，取值范围为 [0,30000000]；默认值为 1000000；取 0 时，表示使用源流码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>视频宽度。默认值为 0，取值范围为 [0,8192]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 时，参数生效；反之则不生效；</p>
     *
     * <p>- 当 `As` 的取值为 0 时，如果 `Width` 和 `Height` 任意取值为 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
