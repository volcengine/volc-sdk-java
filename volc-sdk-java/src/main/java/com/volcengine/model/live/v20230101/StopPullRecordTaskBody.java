package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * StopPullRecordTaskBody
 */
@lombok.Data
public final class StopPullRecordTaskBody  {

    /**
     * <p>任务 ID，录制任务的唯一标识。您可以调用 [ListPullRecordTask](https://www.volcengine.com/docs/6469/1111480) 接口查看直播录制任务的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
