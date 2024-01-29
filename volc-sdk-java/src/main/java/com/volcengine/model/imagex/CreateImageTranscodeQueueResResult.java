package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeQueueResResult
 */
@lombok.Data
public final class CreateImageTranscodeQueueResResult  {

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
