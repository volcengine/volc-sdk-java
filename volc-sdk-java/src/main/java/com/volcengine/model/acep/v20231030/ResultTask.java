package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultTask
 */
@lombok.Data
public final class ResultTask  {

    /**
     * <p>返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务结束时间（UTC）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>任务开始时间（UTC）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>任务类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>任务执行进度。</p>
     *
     *
     *
     * <p>- 100：执行完成；</p>
     *
     * <p>- <0：执行失败：</p>
     *
     * <p>	- -1：通用失败；</p>
     *
     * <p>	- 其他：待定。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskResult")
    private Integer taskResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
