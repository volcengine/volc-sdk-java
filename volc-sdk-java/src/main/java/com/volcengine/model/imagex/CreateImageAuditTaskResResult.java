package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAuditTaskResResult
 */
@lombok.Data
public final class CreateImageAuditTaskResResult  {

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
