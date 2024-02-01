package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageTranscodeQueueBody
 */
@lombok.Data
public final class DeleteImageTranscodeQueueBody  {

    /**
     * <p>待删除的队列 ID，您可通过调用[GetImageTranscodeQueues](https://www.volcengine.com/docs/508/1107341)获取该账号下全部任务队列 ID。</p>
     *
     * <p>账号内置默认任务队列不允许被删除。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
