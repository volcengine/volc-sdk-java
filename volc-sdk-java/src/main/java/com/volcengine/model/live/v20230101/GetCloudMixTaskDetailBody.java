package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCloudMixTaskDetailBody
 */
@lombok.Data
public final class GetCloudMixTaskDetailBody  {

    /**
     * <p>混流任务 ID，您可以通过 [ListCloudMixTask](https://www.volcengine.com/docs/6469/1271157) 接口获取混流任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
