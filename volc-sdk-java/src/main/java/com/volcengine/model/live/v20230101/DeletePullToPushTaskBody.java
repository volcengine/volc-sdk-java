package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeletePullToPushTaskBody
 */
@lombok.Data
public final class DeletePullToPushTaskBody  {

    /**
     * <p>任务 ID，任务的唯一标识，您可以通过[获取拉流转推任务列表](https://www.volcengine.com/docs/6469/1126896)接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
