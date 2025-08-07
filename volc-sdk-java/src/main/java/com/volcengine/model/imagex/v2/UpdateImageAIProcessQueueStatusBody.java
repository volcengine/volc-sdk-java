package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAIProcessQueueStatusBody
 */
@lombok.Data
public final class UpdateImageAIProcessQueueStatusBody  {

    /**
     * <p>任务队列 ID。您可通过调用 [GetImageAIProcessQueues](https://www.volcengine.com/docs/508/1755529) 获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>任务队列状态。取值如下：</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Running`：执行中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
