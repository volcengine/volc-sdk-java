package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullRecordTaskBody
 */
@lombok.Data
public final class GetPullRecordTaskBody  {

    /**
     * <p>直播录制任务的 ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
