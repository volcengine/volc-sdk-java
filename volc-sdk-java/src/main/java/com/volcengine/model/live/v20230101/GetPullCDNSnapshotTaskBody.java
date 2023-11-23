package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullCDNSnapshotTaskBody
 */
@lombok.Data
public final class GetPullCDNSnapshotTaskBody  {

    /**
     * <p>直播截图任务 ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
