package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeTaskResResult
 */
@lombok.Data
public final class CreateImageTranscodeTaskResResult  {

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
