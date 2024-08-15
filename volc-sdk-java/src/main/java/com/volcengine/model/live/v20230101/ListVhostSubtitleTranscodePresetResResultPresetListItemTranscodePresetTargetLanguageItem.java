package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePresetTargetLanguageItem
 */
@lombok.Data
public final class ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePresetTargetLanguageItem  {

    /**
     * <p>译文字幕的字体描边配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Border")
    private ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePresetTargetLanguageItemBorder border;

    /**
     * <p>译文字幕的字体，译文字幕字体根据译文字幕语言取值不同而不同，取值及含义如下所示。</p>
     *
     * <p>- 当译文字幕的语言是 `zh` 时，支持以下字体取值。</p>
     *
     * <p>	- `siyuanheiti`：思源黑体；</p>
     *
     * <p>	- `songtixi`：宋体细；</p>
     *
     * <p>	- `songticu`：宋体粗；</p>
     *
     * <p>	- `heitifan`：黑体繁；</p>
     *
     * <p>	- `kaiti`：楷体。</p>
     *
     * <p>- 当译文字幕的语言是 `zh-Hant` 时，支持 `siyuanheiti` （思源黑体）字体。</p>
     *
     * <p>- 当译文字幕的语言是 `en` 时，支持以下字体取值。</p>
     *
     * <p>	- `inter`：Inter；</p>
     *
     * <p>	- `roboto`：Roboto；</p>
     *
     * <p>	- `opposans`：OPPOSans；</p>
     *
     * <p>	- `siyuansongti`：思源宋体；</p>
     *
     * <p>	- `montserrat`：Montserrat。</p>
     *
     * <p>- 当译文字幕的语言是 `ko`、`ja`、`ar`、`de`、`es`、`fr`、`hi`、`pt`、 `ru`、 `vi`、 `th`  时，支持 `notosans`(Noto Sans) 字体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private String font;

    /**
     * <p>译文字幕的字体颜色，支持以下几种方法进行定义。</p>
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
    @com.alibaba.fastjson.annotation.JSONField(name = "FontColor")
    private String fontColor;

    /**
     * <p>译文字幕的语言，取值及含义如下所示。</p>
     *
     * <p>- `zh`：中英混合；</p>
     *
     * <p>- `zh-Hant`：繁体中文；</p>
     *
     * <p>- `en`：英语；</p>
     *
     * <p>- `ko`：韩语；</p>
     *
     * <p>- `ja`：日语；</p>
     *
     * <p>- `ar`：阿拉伯语；</p>
     *
     * <p>- `de`：德语；</p>
     *
     * <p>- `es`：西班牙语；</p>
     *
     * <p>- `fr`：法语；</p>
     *
     * <p>- `hi`：印地语；</p>
     *
     * <p>- `pt`：葡萄牙语；</p>
     *
     * <p>- `ru`：俄语；</p>
     *
     * <p>- `vi`：越南语；</p>
     *
     * <p>- `th`：泰语。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Language")
    private String language;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
