package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAITasksQuery
 */
@lombok.Data
public final class GetImageAITasksQuery  {

    /**
     * <p>服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>队列 ID，通过 CreateImageAITask 接口返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    /**
     * <p>任务 ID，通过 CreateImageAITask 接口返回，缺省时查询指定队列下全部的任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>上一次查询返回的位置标记，作为本次查询的起点信息，默认值为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    /**
     * <p>单次查询列出的任务的个数，取值范围为 (0,1000]，默认值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>指定查询的任务状态，缺省时将查询全部状态的任务。取值如下所示：</p>
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
     * <p>查询的起始 Unix 时间戳，`StartTime` 与 `EndTime` 时间间隔最大不超过 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>查询的结束 Unix 时间戳，`StartTime` 与 `EndTime` 时间间隔最大不超过 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>搜索url、uri</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
