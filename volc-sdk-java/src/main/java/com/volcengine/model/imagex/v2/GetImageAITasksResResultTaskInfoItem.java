package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAITasksResResultTaskInfoItem
 */
@lombok.Data
public final class GetImageAITasksResResultTaskInfoItem  {

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务的执行状态，取值如下所示：</p>
     *
     *
     *
     * <p>- `Running`：任务运行中</p>
     *
     * <p>- `Suspend`：任务中断</p>
     *
     * <p>- `Done`：任务已完成</p>
     *
     * <p>- `Cancel`：任务取消</p>
     *
     * <p>- `Failed`：任务失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>任务中包含的条目数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    /**
     * <p>任务中执行成功的条目数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Success")
    private Long success;

    /**
     * <p>任务中执行失败的条目数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fail")
    private Long fail;

    /**
     * <p>任务中重试的条目数。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当因系统内部原因导致的条目转码失败，系统将自动重试该条目，最大重试次数为 5。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Retry")
    private Long retry;

    /**
     * <p>任务的开始执行时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartAt")
    private String startAt;

    /**
     * <p>任务的结束执行时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndAt")
    private String endAt;

    /**
     * <p>任务的提交时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubmitAt")
    private String submitAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
