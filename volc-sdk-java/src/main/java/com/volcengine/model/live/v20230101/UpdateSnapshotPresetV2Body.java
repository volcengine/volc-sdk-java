package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSnapshotPresetV2Body
 */
@lombok.Data
public final class UpdateSnapshotPresetV2Body  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>截图配置的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图配置生效状态，默认为生效。</p>
     *
     *
     *
     * <p>- 1：生效；</p>
     *
     * <p>- 0：不生效。</p>
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
