package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageRetryAuditTaskBody
 */
@lombok.Data
public final class CreateImageRetryAuditTaskBody  {

    /**
     * <p>任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1160409) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>失败图片 ID，您可通过调用[获取审核任务结果](https://www.volcengine.com/docs/508/1160410)查看待更新状态的图片条目 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Entry")
    private String entry;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
