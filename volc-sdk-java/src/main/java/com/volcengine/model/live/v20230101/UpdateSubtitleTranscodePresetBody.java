package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateSubtitleTranscodePresetBody
 */
@lombok.Data
public final class UpdateSubtitleTranscodePresetBody  {

    /**
     * <p>域名空间，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待更新字幕配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待更新字幕配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图配置的名称，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待更新字幕配置的 PresetName 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>字幕配置的描述信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>关联转码配置后缀，一个字幕配置支持关联多个转码配置后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffixes")
    private List<String> suffixes;

    /**
     * <p>预设配置，使用预设配置是系统将自动对字体大小、字幕行数、每行最大字符数和边距参数（MarginVertical 和 MarginHorizontal）进行智能化适配。默认为空，表示不使用预设配置，支持的预设配置如下所示。</p>
     *
     * <p>- `small` ：小字幕。</p>
     *
     * <p>- `medium`：中字幕。</p>
     *
     * <p>- `large`：大字幕。</p>
     *
     * <p>:::tip</p>
     *
     * <p>使用预设配置时，字幕行数、每行最大字符数、左右边距和底部边距参数不生效，系统将使用预设配置自动进行计算。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayPreset")
    private String displayPreset;

    /**
     * <p>字幕展示的行数，同时适用于原文字幕和译文字幕，支持的取值及含义如下所示。</p>
     *
     * <p>- `0`：（默认值）根据字幕字数自动进行分行展示；</p>
     *
     * <p>- `1`：每种字幕展示一行；</p>
     *
     * <p>- `2`：每种字幕展示两行。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 使用预设配置时，字幕行数为自动分行展示。</p>
     *
     * <p>- 超出行内字数限制时表示字幕将超过显示范围，此时字幕内容将被截断。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxRowNumber")
    private Integer maxRowNumber;

    /**
     * <p>设置在 16:9 分辨率场景下，每行字幕展示的最大字符数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 使用预设配置时，字幕每行最大字符数设置不生效。</p>
     *
     * <p>- 不使用预设配置时，字幕每行最大字符数必填。</p>
     *
     * <p>- 每个文字、字母、符号或数字均为一个字符。</p>
     *
     * <p>- 当屏幕分辨率改变时，屏幕上显示的每行文字数量会相应调整，以适应新的分辨率，确保文字的显示效果和阅读体验。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxCharNumber")
    private Integer maxCharNumber;

    /**
     * <p>字幕位置设置，通过设置字幕距离画面左右边距和底部边距来指定字幕位置。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 使用预设配置时，字幕位置设置不生效。</p>
     *
     * <p>- 不使用预设配置时，字幕位置设置必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Position")
    private UpdateSubtitleTranscodePresetBodyPosition position;

    /**
     * <p>原文字幕展示参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceLanguage")
    private UpdateSubtitleTranscodePresetBodySourceLanguage sourceLanguage;

    /**
     * <p>译文字幕展示参数配置列表，当前最多支持配置一种译文。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TargetLanguage")
    private List<UpdateSubtitleTranscodePresetBodyTargetLanguageItem> targetLanguage;

    /**
     * <p>原文字幕识别时使用的热词词库，总长度不超过为 10000 个字符，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HotWordList")
    private List<String> hotWordList;

    /**
     * <p>原文翻译成译文时使用的热词词库，总长度不超过 10000 个字符，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GlossaryWordList")
    private List<String> glossaryWordList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
