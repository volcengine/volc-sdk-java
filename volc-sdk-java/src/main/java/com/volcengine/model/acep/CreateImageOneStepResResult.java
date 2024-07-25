package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageOneStepResResult
 */
@lombok.Data
public final class CreateImageOneStepResResult  {

    /**
     * <p>应用安装任务 ID，用于通过 `GetTaskInfo` 接口查看任务执行状态及结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型，此处为 `CreateImageOneStep`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
