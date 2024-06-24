package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateTimeShiftPresetV3Body
 */
@lombok.Data
public final class UpdateTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>开启时移的流名称，默认为空表示更新 App 级别的时移配置，不为空时表示更新 Stream 级别的时移配置。您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待更新时移配置的 `Stream` 取值并进行更新。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>最大时移时长，即允许用户回看的最长时间，单位为秒，支持的取值如下所示。</p>
     *
     *
     *
     * <p>- `86400`：1 天；</p>
     *
     * <p>- `259200`：3 天；</p>
     *
     * <p>- `604800`：7 天；</p>
     *
     * <p>- `1296000`：15 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
