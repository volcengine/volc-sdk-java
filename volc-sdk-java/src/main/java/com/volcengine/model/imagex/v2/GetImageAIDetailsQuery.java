package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAIDetailsQuery
 */
@lombok.Data
public final class GetImageAIDetailsQuery  {

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
     * <p>查询的起始 Unix 时间戳，`StartTime` 与 `EndTime` 时间间隔最大不超过 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>查询的结束 Unix 时间戳，`StartTime` 与 `EndTime` 时间间隔最大不超过 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>执行状态，填入多个时使用英文逗号分隔。取值如下所示：</p>
     *
     *
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Running`：执行中</p>
     *
     * <p>- `Success`：执行成功</p>
     *
     * <p>- `Fail`：执行失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>返回图片 URL 或 URI 中包含该值的任务。默认为空，不传则返回所有任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页条数，取值范围为 (0, 100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>服务 ID。若 `DataType` 取值 `uri`，则提交的图片 URI 列表需在该服务内。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
