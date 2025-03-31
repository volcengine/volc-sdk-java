package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAITaskResResult
 */
@lombok.Data
public final class CreateImageAITaskResResult  {

    /**
     * <p>任务 ID。查询接口需要使用，请注意保存。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>队列 ID。查询接口需要使用，请注意保存。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
