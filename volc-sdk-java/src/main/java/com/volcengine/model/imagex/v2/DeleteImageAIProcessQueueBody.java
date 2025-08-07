package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageAIProcessQueueBody
 */
@lombok.Data
public final class DeleteImageAIProcessQueueBody  {

    /**
     * <p>任务队列 ID。您可通过调用 [GetImageAIProcessQueues](https://www.volcengine.com/docs/508/1755529) 获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
