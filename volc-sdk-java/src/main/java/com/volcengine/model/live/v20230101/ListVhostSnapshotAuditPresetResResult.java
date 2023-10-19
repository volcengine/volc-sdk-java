package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSnapshotAuditPresetResResult
 */
@lombok.Data
public final class ListVhostSnapshotAuditPresetResResult  {

    /**
     * <p>截图审核模版列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<ListVhostSnapshotAuditPresetResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
