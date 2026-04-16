package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateSpeechTaskBodyRule
 */
@lombok.Data
public final class CreateSpeechTaskBodyRule  {

    /**
     * <p>任务类型。取值如下：</p>
     *
     * <p>- `si`：声影同传模式。适用于对同步性和沉浸感要求较高的会议直播等场景。</p>
     *
     * <p>- `mix`：仅字幕。</p>
     *
     * <p>- `realtime`：实时同传模式。适用于对延迟敏感的赛事直播等场景。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pipe")
    private String pipe;

    /**
     * <p>播出延迟时长，用于保证同传声音和字幕的翻译处理完成。取值范围为 `[0,60]`，单位为秒。</p>
     *
     * <p>不同任务类型（`Pipe`）下，建议取值如下：</p>
     *
     * <p>- `si`：</p>
     *
     * <p>	- `LipSync` 取值为 `true` 时，建议取值 `20`。</p>
     *
     * <p>	- `LipSync` 取值为 `false` 时，建议取值 `12`。</p>
     *
     * <p>- `mix`：`8`。</p>
     *
     * <p>- `realtime`：`2` 或 `3`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Delay")
    private Integer delay;

    /**
     * <p>源流配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private CreateSpeechTaskBodyRuleSource source;

    /**
     * <p>任务结束时间，必须晚于任务开始时间（`StartTime`），且两者之间的时间跨度不得超过 7 天。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。</p>
     *
     * <p>如果未传该参数，任务会在开始时间的 7 天后结束。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当任务结束或拉流失败时，停止向转推地址推流。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>任务开始时间。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。</p>
     *
     * <p>如果未传该参数，任务会立即启动。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>转推配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private CreateSpeechTaskBodyRuleOutput output;

    /**
     * <p>声影同传模式配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅在 `Pipe` 取值为 `si` 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SI")
    private CreateSpeechTaskBodyRuleSI sI;

    /**
     * <p>实时同传模式配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅在 `Pipe` 取值为 `realtime` 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealTime")
    private CreateSpeechTaskBodyRuleRealTime realTime;

    /**
     * <p>额外配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private CreateSpeechTaskBodyRuleExtra extra;

    /**
     * <p>字幕配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Subtitle")
    private CreateSpeechTaskBodyRuleSubtitle subtitle;

    /**
     * <p>关键词库。格式为 `"Key":"Value"`，每个 `"Key":"Value"` 之间用英文逗号（,）隔开。其中，`"Key"` 为原文，`"Value"` 为译文。配置关键词库后，同传任务会严格按照词库进行翻译。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GlossaryMap")
    private Map<String, Object> glossaryMap;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
