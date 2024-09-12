package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageContentTaskResResult
 */
@lombok.Data
public final class CreateImageContentTaskResResult  {

    /**
     * <p>对应的任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>完成结果提示信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Msg")
    private String msg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
