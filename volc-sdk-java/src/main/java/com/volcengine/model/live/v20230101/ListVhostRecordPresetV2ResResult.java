package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRecordPresetV2ResResult
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResult  {

    /**
     * <p>录制配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostRecordPresetV2ResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
