package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateCarouselTaskBodyRule
 */
@lombok.Data
public final class CreateCarouselTaskBodyRule  {

    /**
     * <p>轮播的循环次数，用于控制直播循环播放的次数。支持的取值及含义如下：</p>
     *
     *
     *
     * <p>- `-1`：无限循环；</p>
     *
     * <p>- `0`：不循环；</p>
     *
     * <p>- 其他正整数：指定轮播的具体循环次数。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>直播循环的行为同时受到 `Loop` 和 `StopTime` 字段的影响：</p>
     *
     * <p>- 当 `Loop` 次数达到设定值时，轮播将自动停止，无论 `StopTime` 是否到达。</p>
     *
     * <p>- 当 `StopTime` 到达时，轮播也会终止，即使 `Loop` 仍未完成。</p>
     *
     * <p>- 如果未设置 `StopTime`，系统默认最大轮播时长为 3 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Loop")
    private Integer loop;

    /**
     * <p>该字段用于指定轮播素材的拼接模式，决定多个点播素材在播放时的衔接方式，支持的取值如下所示：</p>
     *
     * <p>- `0`：普通模式。会检查前后素材的音视频参数（如分辨率、码率、编码格式等）。如果参数匹配，素材可以无缝衔接；如果参数不同，切换时可能会出现短暂的断流情况。</p>
     *
     * <p>- `1` ：转码模式。系统会对所有点播素材进行格式化处理，使其符合相同的音视频参数，确保素材切换时始终保持流畅无缝衔接。用户可以手动配置目标参数，如果未配置，默认使用第一个素材的参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mode")
    private Integer mode;

    /**
     * <p>轮播任务的推流参数，包括视频、音频、推流地址及回调信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private CreateCarouselTaskBodyRuleOutput output;

    /**
     * <p>轮播任务的开始时间，使用 Unix 时间戳表示，精度为 `ms`。参数要求如下：</p>
     *
     *
     *
     * <p>- 当取值为 `0` 时，表示立即开始推流；</p>
     *
     * <p>- 如果设置具体时间，则必须为晚于当前时间的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayTime")
    private Integer playTime;

    /**
     * <p>轮播素材列表，用于指定在轮播过程中播放的素材资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private List<CreateCarouselTaskBodyRuleSourceItem> source;

    /**
     * <p>轮播任务的停止时间，Unix 时间戳，精度为 `ms`。设置此字段后，系统会根据该时间点自动关闭任务。 最大时间范围为 `3天`，默认值为 `3天`。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>轮播任务的结束时间 `StopTime` 必须晚于开始时间 `PlayTime`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopTime")
    private Integer stopTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
