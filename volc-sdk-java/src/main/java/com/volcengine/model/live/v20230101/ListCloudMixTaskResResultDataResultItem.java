package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCloudMixTaskResResultDataResultItem
 */
@lombok.Data
public final class ListCloudMixTaskResResultDataResultItem  {

    /**
     * <p>混流任务创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private ListCloudMixTaskResResultDataResultItemCreatedAt createdAt;

    /**
     * <p>混流任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>混流任务状态，取值及含义如下所示。</p>
     *
     * <p>- `pending`：任务调度被阻塞。</p>
     *
     * <p>- `prepare`：正在准备任务资源。</p>
     *
     * <p>- `runing`：任务进行中。</p>
     *
     * <p>- `prestop`：正在清理任务资源。</p>
     *
     * <p>- `done`：任务已结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>混流任务结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoppedAt")
    private ListCloudMixTaskResResultDataResultItemStoppedAt stoppedAt;

    /**
     * <p>混流任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>混流任务更新时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdatedAt")
    private ListCloudMixTaskResResultDataResultItemUpdatedAt updatedAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
