package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSnapshotPresetV2Body
 */
@lombok.Data
public final class UpdateSnapshotPresetV2Body  {

    /**
     * <p>域名空间，您可以调用 [ListVhostSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208858) 接口，获取待更新截图配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>截图配置的名称，您可以调用 [ListVhostSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208858) 接口获取，取值与 `Name` 字段取值相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>应用名称，您可以调用 [ListVhostSnapshotPresetV2](https://www.volcengine.com/docs/6469/1208858) 接口，获取待更新截图配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图配置生效状态，默认及含义如下所示。</p>
     *
     *
     *
     * <p>- `1`：生效；</p>
     *
     * <p>- `0`：不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>截图配置的详细参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotPresetConfig")
    private UpdateSnapshotPresetV2BodySnapshotPresetConfig snapshotPresetConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
