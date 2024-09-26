package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskBody
 */
@lombok.Data
public final class UpdateCloudMixTaskBody  {

    /**
     * <p>混流任务 ID，您可以通过 [ListCloudMixTask](https://www.volcengine.com/docs/6469/1271157) 接口获取运行中的混流任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>混流任务详细配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MixedRules")
    private UpdateCloudMixTaskBodyMixedRules mixedRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
