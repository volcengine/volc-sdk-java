package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMigrateTasksResResult
 */
@lombok.Data
public final class GetImageMigrateTasksResResult  {

    /**
     * <p>迁移任务列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tasks")
    private List<GetImageMigrateTasksResResultTasksItem> tasks;

    /**
     * <p>总任务数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
