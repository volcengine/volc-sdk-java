package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAuditTaskStatusBody
 */
@lombok.Data
public final class UpdateImageAuditTaskStatusBody  {

    /**
     * <p>待更新的任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1160409) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>更新后的任务状态。取值如下所示：</p>
     *
     * <p>- `Running`：审核中</p>
     *
     * <p>- `Suspend`：审核暂停</p>
     *
     * <p>- `Done`：审核完成</p>
     *
     * <p>- `Cancel`：审核取消</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
