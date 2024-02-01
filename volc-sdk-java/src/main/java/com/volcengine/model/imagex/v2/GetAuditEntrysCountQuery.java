package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAuditEntrysCountQuery
 */
@lombok.Data
public final class GetAuditEntrysCountQuery  {

    /**
     * <p>任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1160409) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
