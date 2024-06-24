package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetV2Body
 */
@lombok.Data
public final class CreateSnapshotPresetV2Body  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图配置的生效状态，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `1`：（默认值）生效；</p>
     *
     * <p>- `0`：不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>截图配置的详细参数配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotPresetConfig")
    private CreateSnapshotPresetV2BodySnapshotPresetConfig snapshotPresetConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
