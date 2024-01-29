package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskBody
 */
@lombok.Data
public final class CreateImageMigrateTaskBody  {

    /**
     * <p>任务信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Task")
    private CreateImageMigrateTaskBodyTask task;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
