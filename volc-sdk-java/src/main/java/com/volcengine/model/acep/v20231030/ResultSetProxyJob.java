package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultSetProxyJob
 */
@lombok.Data
public final class ResultSetProxyJob  {

    /**
     * <p>子任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobId")
    private String jobId;

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
