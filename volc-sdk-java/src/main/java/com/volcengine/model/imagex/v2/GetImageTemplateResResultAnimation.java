package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTemplateResResultAnimation
 */
@lombok.Data
public final class GetImageTemplateResResultAnimation  {

    /**
     * <p>动图起始时间戳(ms)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>动图时长(ms)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>抽帧策略： fps：frame per second，1秒X帧 spf：second per frame，X秒1帧 key：抽取关键帧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SelectFrameMode")
    private String selectFrameMode;

    /**
     * <p>帧率，1秒X帧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FramePerSecond")
    private Integer framePerSecond;

    /**
     * <p>X秒1帧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondPerFrame")
    private Integer secondPerFrame;

    /**
     * <p>同步等待时长(s)，超时未完成则根据DemotionType降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitTime")
    private Integer waitTime;

    /**
     * <p>降级类型：  image：抽取一帧降级返回 video：直接返回原视频降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionType")
    private String demotionType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
