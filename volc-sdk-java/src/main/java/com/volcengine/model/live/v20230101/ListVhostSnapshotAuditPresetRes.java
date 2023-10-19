package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotAuditPresetRes
 */
@lombok.Data
public final class ListVhostSnapshotAuditPresetRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVhostSnapshotAuditPresetResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVhostSnapshotAuditPresetResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
