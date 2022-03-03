package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeRecordPresetDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeRecordPresetDetailOutput result;

    @Data
    private static class DescribeRecordPresetDetailOutput {
        @JSONField(name = "PresetDetailList")
        RecordPreset[] PresetDetailList;
    }

    @Data
    private static class RecordPreset {
        @JSONField(name = "Preset")
        String Preset;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "Format")
        String[] Format;
        @JSONField(name = "Duration")
        Integer Duration;
        @JSONField(name = "SliceDuration")
        Integer SliceDuration;
        @JSONField(name = "Bucket")
        String Bucket;
        @JSONField(name = "ReserveDuration")
        Integer ReserveDuration;
        @JSONField(name = "AccessKey")
        String AccessKey;
        @JSONField(name = "ReserveDays")
        Long ReserveDays;
        @JSONField(name = "CallbackDetail")
        CallbackDetail CallbackDetail;
        @JSONField(name = "PullDomain")
        String PullDomain;
        @JSONField(name = "VodNamespace")
        String VodNamespace;
        @JSONField(name = "WorkflowID")
        String WorkflowID;
    }
}
