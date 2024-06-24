package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTranscodePresetBody
 */
@lombok.Data
public final class DeleteTranscodePresetBody  {

    /**
     * <p>应用名称，您可以调用 [ListVhostTransCodePreset](https://www.volcengine.com/docs/6469/1126853) 接口查看待删除转码配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转码配置名称，您可以调用 [ListVhostTransCodePreset](https://www.volcengine.com/docs/6469/1126853) 接口查看待删除转码配置的 `Preset` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>域名空间，您可以调用 [ListVhostTransCodePreset](https://www.volcengine.com/docs/6469/1126853) 接口查看待删除转码配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
