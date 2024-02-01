package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateBodySnapshot
 */
@lombok.Data
public final class CreateImageTemplateBodySnapshot  {

    /**
     * <p>视频截帧类型，取值如下所示：</p>
     *
     * <p>- `default`：智能模式，从视频首帧开始逐帧地检测当前帧是否为黑屏，并最终返回第一个非黑屏的帧。</p>
     *
     * <p>- `offset`：指定时间戳模式，返回指定截帧时间的那一帧。可在 `TimeOffsetMs` 和 `TimeOffsetMsStr` 之间二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>当 `Type` 为 `offset` 时，在`TimeOffsetMs` 和 `TimeOffsetMsStr` 之间二选一。</p>
     *
     * <p>指定截图时间，取值范围为[0,视频时长]，单位为 ms。默认为 0，表示返回首帧。若指定时间 > 视频长度，则返回视频最后一帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeOffsetMs")
    private Long timeOffsetMs;

    /**
     * <p>当 `Type` 为 `offset` 时，在`TimeOffsetMs` 和 `TimeOffsetMsStr` 之间二选一。</p>
     *
     * <p>指定截图时间为使用模板参数动态下发的方式，取值固定为`${snapshot_time}`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeOffsetMsStr")
    private String timeOffsetMsStr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
