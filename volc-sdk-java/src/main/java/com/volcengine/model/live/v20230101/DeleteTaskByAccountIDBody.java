package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTaskByAccountIDBody
 */
@lombok.Data
public final class DeleteTaskByAccountIDBody  {

    /**
     * <p>任务 ID。调用 `CreateHighLightTask` 接口时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
