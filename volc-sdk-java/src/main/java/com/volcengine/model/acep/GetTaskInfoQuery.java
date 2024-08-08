package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetTaskInfoQuery
 */
@lombok.Data
public final class GetTaskInfoQuery  {

    /**
     * <p>业务 ID，查询指定任务的执行结果详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>任务 ID，在任务创建后返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
