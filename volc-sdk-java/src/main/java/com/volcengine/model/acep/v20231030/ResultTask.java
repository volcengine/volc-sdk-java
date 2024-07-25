package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultTask
 */
@lombok.Data
public final class ResultTask  {

    /**
     * <p>返回的任务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>完成时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>任务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>任务执行进度，0~100，100为执行完成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskResult")
    private Integer taskResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
