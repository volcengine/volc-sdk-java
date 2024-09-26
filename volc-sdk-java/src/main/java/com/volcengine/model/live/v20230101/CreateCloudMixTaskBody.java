package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCloudMixTaskBody
 */
@lombok.Data
public final class CreateCloudMixTaskBody  {

    /**
     * <p>混流任务名称，与正在进行中的任务名称不能重复。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>混流任务详细配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MixedRules")
    private CreateCloudMixTaskBodyMixedRules mixedRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
