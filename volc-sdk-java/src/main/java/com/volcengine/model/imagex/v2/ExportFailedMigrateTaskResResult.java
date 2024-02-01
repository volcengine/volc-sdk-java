package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ExportFailedMigrateTaskResResult
 */
@lombok.Data
public final class ExportFailedMigrateTaskResResult  {

    /**
     * <p>迁移失败文件列表。仅当任务状态为`Partial`时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Entries")
    private List<ExportFailedMigrateTaskResResultEntriesItem> entries;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
