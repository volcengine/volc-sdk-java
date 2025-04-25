package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCarouselTaskResResultDataResultItem
 */
@lombok.Data
public final class ListCarouselTaskResResultDataResultItem  {

    /**
     * <p>任务的创建时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private ListCarouselTaskResResultDataResultItemCreatedAt createdAt;

    /**
     * <p>轮播任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>轮播任务的当前状态。取值和含义如下：</p>
     *
     *
     *
     * <p>- `pending`：任务等待调度中；</p>
     *
     * <p>- `prepare`：任务初始化中；</p>
     *
     * <p>- `running`：任务运行中；</p>
     *
     * <p>- `prestop`：任务停止中；</p>
     *
     * <p>- `done`：任务已经停止。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>任务的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoppedAt")
    private ListCarouselTaskResResultDataResultItemStoppedAt stoppedAt;

    /**
     * <p>轮播任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>任务的更新时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdatedAt")
    private ListCarouselTaskResResultDataResultItemUpdatedAt updatedAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
