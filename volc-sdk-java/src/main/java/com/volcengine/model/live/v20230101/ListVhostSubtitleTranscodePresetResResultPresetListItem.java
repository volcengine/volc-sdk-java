package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSubtitleTranscodePresetResResultPresetListItem
 */
@lombok.Data
public final class ListVhostSubtitleTranscodePresetResResultPresetListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转码后缀标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffixes")
    private List<String> suffixes;

    /**
     * <p>字幕配置详细参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodePreset")
    private ListVhostSubtitleTranscodePresetResResultPresetListItemTranscodePreset transcodePreset;

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
