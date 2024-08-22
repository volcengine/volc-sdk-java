package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetTaskInfoResResult
 */
@lombok.Data
public final class GetTaskInfoResResult  {

    /**
     * <p>返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>任务执行进度，0~100，100 为执行完成0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskResult")
    private Integer taskResult;

    /**
     * <p>任务信息，为任务执行过程中，或执行完成后产生的信息，如：应用上传后，解析到的应用信息、应用版本信息等。各任务根据需要定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskMessage")
    private String taskMessage;

    /**
     * <p>子任务列表，详情参看 `Job` 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Jobs")
    private List<com.volcengine.model.acep.v20231030.ResultJob> jobs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
