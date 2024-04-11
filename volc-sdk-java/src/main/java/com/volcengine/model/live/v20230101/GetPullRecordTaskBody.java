package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullRecordTaskBody
 */
@lombok.Data
public final class GetPullRecordTaskBody  {

    /**
     * <p>任务 ID，录制任务的唯一标识。您可以调用 [ListPullRecordTask](https://www.volcengine.com/docs/6469/1111480) 获取任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
