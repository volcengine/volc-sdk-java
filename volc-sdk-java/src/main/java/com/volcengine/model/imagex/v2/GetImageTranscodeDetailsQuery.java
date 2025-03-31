package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsQuery
 */
@lombok.Data
public final class GetImageTranscodeDetailsQuery  {

    /**
     * <p>队列 ID，您可通过调用[GetImageTranscodeQueues](https://www.volcengine.com/docs/508/1107341)获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    /**
     * <p>任务 ID，缺省情况下查询指定队列下所有任务详情。您可通过调用 [GetImageTranscodeTasks](https://www.volcengine.com/docs/508/1356555)获取指定队列的全部任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>队列所在地区。默认当前地区为 **cn**。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>任务提交的起始 Unix 时间戳</p>
     *
     * <p>`StartTime`与`EndTime`时间间隔最大不超过 7 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>任务提交的截止 Unix 时间戳</p>
     *
     * <p>`StartTime`与`EndTime`时间间隔最大不超过 7 天。</p>
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
     * <p>返回图片 url 或 uri 中包含该值的任务。默认为空，不传则返回所有任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页条数，取值范围为(0, 100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
