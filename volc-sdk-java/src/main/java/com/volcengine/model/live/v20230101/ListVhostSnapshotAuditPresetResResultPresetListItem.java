package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotAuditPresetResResultPresetListItem
 */
@lombok.Data
public final class ListVhostSnapshotAuditPresetResResultPresetListItem  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图审核配置详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditPreset")
    private ListVhostSnapshotAuditPresetResResultPresetListItemAuditPreset auditPreset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
