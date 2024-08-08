package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * PullFileResResult
 */
@lombok.Data
public final class PullFileResResult  {

    /**
     * <p>返回的任务 ID，可用于通过 `GetTaskInfo` 接口查看任务执行状态及结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务名称，此处为 `PullFile`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
