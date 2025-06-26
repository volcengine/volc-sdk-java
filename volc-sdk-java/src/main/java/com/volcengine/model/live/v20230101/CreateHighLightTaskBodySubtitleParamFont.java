package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySubtitleParamFont
 */
@lombok.Data
public final class CreateHighLightTaskBodySubtitleParamFont  {

    /**
     * <p>字幕的字体类型，支持多种字体选择，默认值为 `songticu`（宋体粗）。支持的字体如下所示。</p>
     *
     * <p>- `songticu`：宋体粗；</p>
     *
     * <p>- `songtixi`：宋体细；</p>
     *
     * <p>- `arial`：Arial；</p>
     *
     * <p>- `heitifan`：黑体繁；</p>
     *
     * <p>- `inter`：Inter；</p>
     *
     * <p>- `kaiti`：楷体；</p>
     *
     * <p>- `montserrat`：Montserrat；</p>
     *
     * <p>- `notosans`：Noto Sans；</p>
     *
     * <p>- `notosans_ar`：Noto Sans 阿拉伯文；</p>
     *
     * <p>- `notosans_ja`：Noto Sans 日文；</p>
     *
     * <p>- `notosans_ko`：Noto Sans 韩文；</p>
     *
     * <p>- `notosans_th`：Noto Sans 泰文；</p>
     *
     * <p>- `opposans`：Opposans；</p>
     *
     * <p>- `roboto`：Roboto；</p>
     *
     * <p>- `simhei`：黑体；</p>
     *
     * <p>- `siyuanheiti`：思源黑体；</p>
     *
     * <p>- `siyuansongti`：思源宋体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private String font;

    /**
     * <p>字幕的字号，单位为像素，默认为 `55`，取值范围为 [40,60]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FontSize")
    private Integer fontSize;

    /**
     * <p>定义字幕的字体颜色，支持以下几种方法进行定义。默认为白色。</p>
     *
     * <p>- 以 `0x` 或 `#` 开头，后面跟着十六进制颜色 RGB 值，再跟着 `@+` 十六进制/百分比来表示的透明度值。例如，设置 RGB 值为 `FF0000`，透明度为 `5%` 的颜色时，可传入 `0xFF0000@0x80`、`0xFF0000@0.5`、`#FF0000@0x80` 或 `#FF0000@0.5`。</p>
     *
     * <p>- 使用前端框架 FFmpeg 规定的颜色关键字。例如，`AliceBlue` 表示 `0xF0F8FF`、`AntiqueWhite` 表示 `0xFAEBD7`、`Black` 表示 `0x000000` 等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FontColor")
    private String fontColor;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
