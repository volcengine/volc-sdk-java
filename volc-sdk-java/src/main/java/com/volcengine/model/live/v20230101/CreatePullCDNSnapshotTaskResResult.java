package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullCDNSnapshotTaskResResult
 */
@lombok.Data
public final class CreatePullCDNSnapshotTaskResResult  {

    /**
     * <p>任务ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
