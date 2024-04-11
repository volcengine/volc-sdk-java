package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRecordPresetV2Body
 */
@lombok.Data
public final class UpdateRecordPresetV2Body  {

    /**
     * <p>域名空间。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口查看待更新录制配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址的 `AppName` 字段取值相同，用来指定待更新的录制配置，默认为空。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口查看待更新录制配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>录制配置的名称。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口查看待更新录制配置的 `Name` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>录制配置的详细参数配置。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>以下录制参数，未传入值时表示与更新前的配置相同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPresetConfig")
    private UpdateRecordPresetV2BodyRecordPresetConfig recordPresetConfig;

    /**
     * <p>流名称，取值与直播流地址的 `StreamName` 字段取值相应，用来指定待更新的录制配置，默认为空。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口查看待更新录制配置的 `Stream` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
