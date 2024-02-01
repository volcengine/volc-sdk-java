package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSnapshotPresetV2ResResult
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResult  {

    /**
     * <p>截图配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostSnapshotPresetV2ResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
