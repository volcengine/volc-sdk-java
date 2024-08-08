package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UninstallAppResResult
 */
@lombok.Data
public final class UninstallAppResResult  {

    /**
     * <p>应用安装任务 ID，用于通过 `GetTaskInfo` 接口查看任务执行状态及结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型，此处为 `UninstallApp`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>子任务列表，参考 `Job` 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Jobs")
    private List<com.volcengine.model.acep.v20231030.ResultJob> jobs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
