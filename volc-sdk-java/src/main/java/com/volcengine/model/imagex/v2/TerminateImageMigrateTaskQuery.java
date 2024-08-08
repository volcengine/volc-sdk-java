package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * TerminateImageMigrateTaskQuery
 */
@lombok.Data
public final class TerminateImageMigrateTaskQuery  {

    /**
     * <p>任务地区（即任务目标服务的地区），默认空，返回国内任务。</p>
     *
     *
     *
     * <p>- `cn`：国内</p>
     *
     * <p>- `sg`：新加坡</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>任务 ID，请参考 [GetImageMigrateTasks](https://www.volcengine.com/docs/508/1108670) 获取返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
