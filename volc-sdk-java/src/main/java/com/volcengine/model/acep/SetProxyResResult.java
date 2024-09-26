package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * SetProxyResResult
 */
@lombok.Data
public final class SetProxyResResult  {

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    /**
     * <p>子任务列表。参看 [SetProxyJob](#setproxyjob) 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JobList")
    private List<com.volcengine.model.acep.v20231030.ResultSetProxyJob> jobList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
