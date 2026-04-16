package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSubtitleOriginal
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSubtitleOriginal  {

    /**
     * <p>字幕语言。取值如下：</p>
     *
     * <p>- `zh`：中文。</p>
     *
     * <p>- `en`：英文。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Language")
    private String language;

    /**
     * <p>字体，默认值为 `arial`。可通过 [GetSpeechConfig](https://www.volcengine.com/docs/6469/1978525) 获取当前账号下可使用的字体列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Font")
    private String font;

    /**
     * <p>字号。默认值为 `40`。取值范围为 [1,100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FontSize")
    private Integer fontSize;

    /**
     * <p>字体颜色。默认白色。</p>
     *
     * <p>使用以下任一方式表示颜色值：</p>
     *
     * <p>- 颜色的英文名称，例如 `red` 表示红色。</p>
     *
     * <p>- 十六进制颜色代码，例如 `#FF0000` 表示红色。</p>
     *
     * <p>- R:G:B:A 颜色值，格式为`红:绿:蓝:透明度`，每个值的取值范围为 `[0,255]`，例如 `255:0:0:128` 表示半透明的红色。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FontColor")
    private String fontColor;

    /**
     * <p>字幕对齐方式。默认值为 `0`。取值如下：</p>
     *
     * <p>- `0`：居中对齐。</p>
     *
     * <p>- `1`：左对齐。</p>
     *
     * <p>- `2`：右对齐。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Alignment")
    private Integer alignment;

    /**
     * <p>原文字幕展示的最大行数，`0` 表示不限制行数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>原文和译文的行数限制单独计算。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxRowNumber")
    private Integer maxRowNumber;

    /**
     * <p>每行字幕的最大字符数。默认值为 `60`。建议取值 `60`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxCharNumber")
    private Integer maxCharNumber;

    /**
     * <p>是否隐藏字幕。默认值为 `false`。取值如下：</p>
     *
     * <p>- `true`：隐藏字幕。</p>
     *
     * <p>- `false`：显示字幕。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Hidden")
    private Boolean hidden;

    /**
     * <p>展示优先级。默认原文字幕在上，译文字幕在下。取值越大，优先级越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShowPriority")
    private Integer showPriority;

    /**
     * <p>字体背景。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Box")
    private CreateSpeechTaskBodyRuleSubtitleOriginalBox box;

    /**
     * <p>字体阴影。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Border")
    private CreateSpeechTaskBodyRuleSubtitleOriginalBorder border;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
