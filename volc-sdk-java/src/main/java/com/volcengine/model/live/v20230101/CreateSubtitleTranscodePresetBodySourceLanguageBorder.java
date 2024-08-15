package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSubtitleTranscodePresetBodySourceLanguageBorder
 */
@lombok.Data
public final class CreateSubtitleTranscodePresetBodySourceLanguageBorder  {

    /**
     * <p>描边的宽度，单位为 px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>描边的颜色，支持以下几种方法进行定义。</p>
     *
     * <p>- 支持以 0x 或 # 开头，后面跟着`十六进制颜色 RGB 值`，再跟着 `@+十六进制/百分比`来表示的透明度值，来定义字幕的字体颜色。例如，设置 RGB 值为 FF0000，透明度为 5%的颜色时，您可以传入 `0xFF0000@0x80`、`0xFF0000@0.5`、`#FF0000@0x80` 或 `#FF0000@0.5`。</p>
     *
     * <p>- 支持使用前端框架 FFmpeg 规定的颜色关键字，来定义字幕的字体颜色。例如，`AliceBlue` 表示 0xF0F8FF、`AntiqueWhite` 表示 0xFAEBD7、`Black` 表示 0x000000 等。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查看详细颜色定义方法及更多颜色关键字，请参考 [FFmpeg 的颜色定义语法](https://ffmpeg.org/ffmpeg-utils.html#color-syntax)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
