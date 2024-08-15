package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSubtitleTranscodePresetResResult
 */
@lombok.Data
public final class ListVhostSubtitleTranscodePresetResResult  {

    /**
     * <p>字幕配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostSubtitleTranscodePresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
