package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListVhostSnapshotPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListVhostSnapshotPresetRespOutput result;

    @Data
    private static class ListVhostSnapshotPresetRespOutput {
        @JSONField(name = "PresetList")
        SlicePresetsVhostAPP[] PresetList;
    }

    @Data
    private static class SlicePresetsVhostAPP {

        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "App")
        String app;
        @JSONField(name = "SlicePreset")
        SlicePreset slicePreset;
    }

    @Data
    private static class SlicePreset {
        @JSONField(name = "Preset")
        String preset;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "AccountID")
        String accountID;
        @JSONField(name = "Bucket")
        String bucket;
        @JSONField(name = "Status")
        Long status;
        @JSONField(name = "AccessKey")
        String accessKey;
        @JSONField(name = "Interval")
        Long interval;
        @JSONField(name = "Format")
        String[] format;
        @JSONField(name = "Duration")
        Long duration;
        @JSONField(name = "SliceDuration")
        Long sliceDuration;
        @JSONField(name = "ReserveDays")
        Long reserveDays;
        @JSONField(name = "SnapshotFormat")
        String snapshotFormat;
        @JSONField(name = "CallbackDetail")
        CallbackDetail callbackDetail;
    }
}
