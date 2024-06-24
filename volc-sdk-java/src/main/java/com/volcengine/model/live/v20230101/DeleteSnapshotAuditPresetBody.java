package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSnapshotAuditPresetBody
 */
@lombok.Data
public final class DeleteSnapshotAuditPresetBody  {

    /**
     * <p>域名空间，您可以调用 [ListVhostSnapshotAuditPreset](https://www.volcengine.com/docs/6469/1126870) 接口，获取待删除截图配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用 [ListVhostSnapshotAuditPreset](https://www.volcengine.com/docs/6469/1126870) 接口，获取待删除截图配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图审核配置名称，您可以调用 [ListVhostSnapshotAuditPreset](https://www.volcengine.com/docs/6469/1126870) 接口，获取待删除截图配置的 PresetName 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
