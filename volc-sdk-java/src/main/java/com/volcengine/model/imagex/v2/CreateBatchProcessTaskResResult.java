package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateBatchProcessTaskResResult
 */
@lombok.Data
public final class CreateBatchProcessTaskResResult  {

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
