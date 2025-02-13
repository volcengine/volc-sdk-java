package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullRecordTaskResResultTaskDetail
 */
@lombok.Data
public final class GetPullRecordTaskResResultTaskDetail  {

    /**
     * <p>任务ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>任务结束时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>创建录制任务时传入的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>创建录制任务时传入的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>创建录制任务时传入的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>录制任务的状态，取值及含义如下所示。</p>
     *
     * <p>- `停用`：录制任务已被停止；</p>
     *
     * <p>- `未开始`：录制任务未到录制开始时间；</p>
     *
     * <p>- `生效中`：录制任务正在录制；</p>
     *
     * <p>- `已结束`：录制已结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
