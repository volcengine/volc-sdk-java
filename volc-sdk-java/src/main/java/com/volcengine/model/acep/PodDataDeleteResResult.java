package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * PodDataDeleteResResult
 */
@lombok.Data
public final class PodDataDeleteResResult  {

    /**
     * <p>实例数据迁移任务 ID，用于通过 `GetTaskInfo` 接口查看任务执行状态及结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型，默认为对应接口 Action 名称，此处为 `PodDataDelete`。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
