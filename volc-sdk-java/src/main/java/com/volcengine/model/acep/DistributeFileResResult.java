package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DistributeFileResResult
 */
@lombok.Data
public final class DistributeFileResResult  {

    /**
     * <p>分发文件任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskAction")
    private String taskAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
