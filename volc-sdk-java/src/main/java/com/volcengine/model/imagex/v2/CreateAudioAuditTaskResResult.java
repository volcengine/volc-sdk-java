package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateAudioAuditTaskResResult
 */
@lombok.Data
public final class CreateAudioAuditTaskResResult  {

    /**
     * <p>异步任务的唯一标识符，用于后续查询任务状态或结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
