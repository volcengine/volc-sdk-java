package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * TranscodingJobStatusResResultDataItem
 */
@lombok.Data
public final class TranscodingJobStatusResResultDataItem  {

    /**
     * <p>本次转码任务的开始时间，Unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>本次转码任务的状态，取值及含义如下所示。</p>
     *
     * <p>- `init`：转码任务初始化中；</p>
     *
     * <p>- `fetched`：转码任务调度中；</p>
     *
     * <p>- `pending`：转码任务即将开始；</p>
     *
     * <p>- `doing`：转码任务进行中；</p>
     *
     * <p>- `prestop`：转码任务即将结束；</p>
     *
     * <p>- `done`：转码任务已结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
