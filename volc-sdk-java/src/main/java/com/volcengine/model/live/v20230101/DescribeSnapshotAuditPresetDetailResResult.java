package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeSnapshotAuditPresetDetailResResult
 */
@lombok.Data
public final class DescribeSnapshotAuditPresetDetailResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetailList")
    private List<DescribeSnapshotAuditPresetDetailResResultPresetDetailListItem> presetDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
