package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ExportFailedMigrateTaskQuery
 */
@lombok.Data
public final class ExportFailedMigrateTaskQuery  {

    /**
     * <p>任务地区（即任务目标服务的地区），默认空，返回国内任务。</p>
     *
     *
     *
     * <p>- `cn`：国内</p>
     *
     * <p>- `va`：美东</p>
     *
     * <p>- `sg`：新加坡</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>任务 ID，请参考[CreateImageMigrateTask](https://www.volcengine.com/docs/508/1009929)获取返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
