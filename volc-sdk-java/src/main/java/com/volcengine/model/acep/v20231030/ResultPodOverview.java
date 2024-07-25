package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodOverview
 */
@lombok.Data
public final class ResultPodOverview  {

    /**
     * <p>实例ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
