package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSubtitleTranscodePresetBody
 */
@lombok.Data
public final class DeleteSubtitleTranscodePresetBody  {

    /**
     * <p>应用名称，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待删除字幕配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>域名空间，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待删除字幕配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>截图配置的名称，您可以调用 [ListVhostSubtitleTranscodePreset](https://www.volcengine.com/docs/6469/1288712) 接口，获取待删除字幕配置的 PresetName 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
