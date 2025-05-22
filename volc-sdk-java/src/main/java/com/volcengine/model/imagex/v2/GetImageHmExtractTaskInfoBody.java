package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageHmExtractTaskInfoBody
 */
@lombok.Data
public final class GetImageHmExtractTaskInfoBody  {

    /**
     * <p>待查询的任务 ID，通过 CreateHmExtractTask 接口返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
