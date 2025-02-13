package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetResResultCommonPresetListItem
 */
@lombok.Data
public final class ListVhostTransCodePresetResResultCommonPresetListItem  {

    /**
     * <p>直播流地址的 AppName 字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转码配置具体信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodePreset")
    private ListVhostTransCodePresetResResultCommonPresetListItemTranscodePreset transcodePreset;

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
