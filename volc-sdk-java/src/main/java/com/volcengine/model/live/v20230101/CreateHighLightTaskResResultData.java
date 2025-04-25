package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskResResultData
 */
@lombok.Data
public final class CreateHighLightTaskResResultData  {

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
