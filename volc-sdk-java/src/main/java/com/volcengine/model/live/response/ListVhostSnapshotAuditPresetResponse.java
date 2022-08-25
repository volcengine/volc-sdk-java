package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListVhostSnapshotAuditPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListVhostSnapshotAuditPresetResponse.ListVhostSnapshotAuditPresetRespOutput Result;

    @Data
    public static class ListVhostSnapshotAuditPresetRespOutput {
        @JSONField(name = "PresetList")
        ListVhostSnapshotAuditPresetResponse.AuditPresetsVhostAPP[] PresetList;
    }

    @Data
    public static class AuditPresetsVhostAPP {

        @JSONField(name = "Vhost")
        String Vhost;
        @JSONField(name = "App")
        String App;
        @JSONField(name = "AuditPreset")
        ListVhostSnapshotAuditPresetResponse.AuditPreset AuditPreset;
    }

    @Data
    public static class AuditPreset {
        @JSONField(name = "PresetName")
        String PresetName;
        @JSONField(name = "Description")
        String Description;
        @JSONField(name = "Interval")
        double Interval;
        @JSONField(name = "Bucket")
        String Bucket;
        @JSONField(name = "ServiceID")
        String ServiceID;
        @JSONField(name = "StorageDir")
        String StorageDir;
        @JSONField(name = "StorageStrategy")
        Long StorageStrategy;
        @JSONField(name = "Label")
        String[] Label;
        @JSONField(name = "CallbackDetailList")
        CallbackDetail[] CallbackDetailList;
        @JSONField(name = "UpdateTime")
        String UpdateTime;
    }
}
