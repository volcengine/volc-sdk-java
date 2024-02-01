package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMigrateTaskResResult
 */
@lombok.Data
public final class CreateImageMigrateTaskResResult  {

    /**
     * <p>创建成功的迁移任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
