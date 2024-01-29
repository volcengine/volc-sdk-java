package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateAuditImageStatusBody
 */
@lombok.Data
public final class UpdateAuditImageStatusBody  {

    /**
     * <p>任务 ID，您可通过调用 [查询所有审核任务](https://www.volcengine.com/docs/508/1160409) 获取所需的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>审核图片 ID。您可通过调用[获取审核任务结果](https://www.volcengine.com/docs/508/1160410)查看待更新状态的图片条目 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    /**
     * <p>更新后的状态，取值如下所示：</p>
     *
     * <p>- `original`：初始状态</p>
     *
     * <p>- `frozen`：冻结图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
