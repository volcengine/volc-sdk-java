package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksResResultTasksItemRunItem
 */
@lombok.Data
public final class GetImageMigrateTasksResResultTasksItemRunItem  {

    /**
     * <p>迁移任务开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartAt")
    private String startAt;

    /**
     * <p>迁移任务结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DoneAt")
    private String doneAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
