package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullRecordTaskResResult
 */
@lombok.Data
public final class CreatePullRecordTaskResResult  {

    /**
     * <p>任务 ID，录制任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
