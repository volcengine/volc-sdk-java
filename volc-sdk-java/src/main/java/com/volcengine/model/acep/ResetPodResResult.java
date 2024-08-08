package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ResetPodResResult
 */
@lombok.Data
public final class ResetPodResResult  {

    /**
     * <p>实例重置任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型。取值为 `ResetPod`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>子任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Jobs")
    private List<com.volcengine.model.acep.v20231030.ResultJob> jobs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
