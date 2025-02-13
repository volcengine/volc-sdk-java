package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCommonTransPresetDetailResResultNarrowBandHDPresetDetailItem
 */
@lombok.Data
public final class ListCommonTransPresetDetailResResultNarrowBandHDPresetDetailItem  {

    /**
     * <p>音频编码格式，支持的取值及含义如下。</p>
     *
     * <p>- `aac`：使用 AAC 编码格式；</p>
     *
     * <p>- `opus`：使用 Opus 编码格式；</p>
     *
     * <p>- `copy`：不进行转码，所有音频编码参数不生效。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>视频分辨率自适应模式开关。支持的取值及含义如下。</p>
     *
     * <p>- `0`：关闭视频分辨率自适应；</p>
     *
     * <p>- `1`：开启视频分辨率自适应。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 关闭视频分辨率自适应模式（`As` 取值为 `0`）时，转码配置的视频分辨率取视频宽度（`Width`）和视频高度（`Height`）的值对转码视频进行拉伸；</p>
     *
     * <p>- 开启视频分辨率自适应模式（`As` 取值为 `1`）时，转码配置的视频分辨率按照短边长度（`ShortSide`）、长边长度（`LongSide`）、视频宽度（`Width`）、视频高度（`Height`）的优先级取值，另一边等比缩放。</p>
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
     * <p>转码输出视频中 2 个参考帧之间的最大 B 帧数量，默认值为 `3`，取值为 `0` 时表示去除 B 帧。</p>
     *
     *
     *
     * <p>最大 B 帧数量的取值范围根据视频编码格式（Vcodec）的不同有所差异，取值范围如下所示。</p>
     *
     * <p>- 视频编码格式为 H.264 （`Vcodec` 取值为 `h264`）时取值范围为 [0,7]；</p>
     *
     * <p>- 视频编码格式为 H.265 或 H.266 （`Vcodec` 取值为 `h265` 或 `h266`）时取值范围为 [0,3]、7、15。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>帧率，单位为 fps。帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频高度，单位为 px。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，转码分辨率将取 `Width` 和 `Height` 的值对转码视频进行拉伸；</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，`Width` 和 `Height` 任一取值为 `0` 时，转码视频将保持源流尺寸；</p>
     *
     * <p>- 编码格式为 H.266 时，不支持设置 `Width` 和 `Height`，请使用自适应配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度，单位为 px。</p>
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
     * <p>转码类型是否为极智超清转码，默认值为 `false`，取值及含义如下。</p>
     *
     * <p>- `true`：极智超清转码；</p>
     *
     * <p>- `false`：标准转码。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>视频编码格式为 H.266 （`Vcodec` 取值为 `h266`）时，转码类型不支持极智超清转码。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>短边长度，单位为 px。</p>
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
     * <p>转码后缀，支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）和短横线（-）组成，长度为 1 到 10 个字符。</p>
     *
     *
     *
     * <p>转码后缀通常以流名称后缀的形式来使用，常见的标识有 `_sd`、`_hd`、`_uhd`，例如，当转码配置的标识为 `_hd` 时，拉取转码流时转码流的流名名称为 `源流的流名称_hd`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>视频编码格式。</p>
     *
     * <p>- `h264`：使用 H.264 编码格式；</p>
     *
     * <p>- `h265`：使用 H.265 编码格式；</p>
     *
     * <p>- `copy`：不进行转码，所有视频编码参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>视频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>视频宽度，单位为 px。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，转码分辨率将取 `Width` 和 `Height` 的值对转码视频进行拉伸；</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，`Width` 和 `Height` 任一取值为 `0` 时，转码视频将保持源流尺寸；</p>
     *
     * <p>- 编码格式为 H.266 时，不支持设置 `Width` 和 `Height`，请使用自适应配置。</p>
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
