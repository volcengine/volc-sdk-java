package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAIProcessQueueResResult
 */
@lombok.Data
public final class CreateImageAIProcessQueueResResult  {

    /**
     * <p>任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
