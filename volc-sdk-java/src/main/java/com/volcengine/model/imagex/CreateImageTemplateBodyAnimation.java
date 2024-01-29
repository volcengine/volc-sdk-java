package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateBodyAnimation
 */
@lombok.Data
public final class CreateImageTemplateBodyAnimation  {

    /**
     * <p>动图起始时间戳，单位为 ms。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>动图时长，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>抽帧策略，取值如下所示：</p>
     *
     * <p>- `fps`：抽帧频率，1 秒 X 帧。</p>
     *
     * <p>- `spf`：抽帧间隔，X 秒 1 帧。</p>
     *
     * <p>- `key`：抽取关键帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SelectFrameMode")
    private String selectFrameMode;

    /**
     * <p>帧率，1 秒 X 帧。仅当`SelectFrameMode`取值为`fps`时需要配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FramePerSecond")
    private Integer framePerSecond;

    /**
     * <p>秒数，X 秒 1 帧。仅当`SelectFrameMode`取值为`spf`时需要配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondPerFrame")
    private Integer secondPerFrame;

    /**
     * <p>同步等待时长，单位为 s，超时未完成则根据`DemotionType`降级。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitTime")
    private Integer waitTime;

    /**
     * <p>降级类型，取值如下所示：</p>
     *
     * <p>- `image`：抽取一帧降级返回 </p>
     *
     * <p>- `video`：直接返回原视频降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionType")
    private String demotionType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
