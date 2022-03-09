package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.live.RecordTob;
import lombok.Data;

@Data
public class CreateRecordPresetRequest {
    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "Status")
    Long status;
    @JSONField(name = "Bucket")
    String bucket;
    @JSONField(name = "AccessKey")
    String accessKey;
    @JSONField(name = "Format")
    String[] format;
    @JSONField(name = "Duration")
    Long duration;
    @JSONField(name = "SliceDuration")
    Long sliceDuration;
    @JSONField(name = "ReserveDays")
    Long reserveDays;
    @JSONField(name = "ReserveDuration")
    Long reserveDuration;
    @JSONField(name = "StorageDir")
    String storageDir;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] callbackDetailList;
    @JSONField(name = "RecordTob")
    RecordTob[] recordTob;
    @JSONField(name = "PullDomain")
    String pullDomain;
    @JSONField(name = "VodNamespace")
    String vodNamespace;
    @JSONField(name = "WorkflowID")
    String workflowID;
    @JSONField(name = "ACL")
    String ACL;

//    @Data
//    public static class CallbackDetail {
//        @JSONField(name = "CallbackType")
//        String callbackType;
//        @JSONField(name = "URL")
//        String URL;
//    }

//    @Data
//    public static class RecordTob {
//        @JSONField(name = "Format")
//        String format;
//        @JSONField(name = "Duration")
//        String duration;
//        @JSONField(name = "Splice")
//        Long splice;
//        @JSONField(name = "RecordObject")
//        Long recordObject;
//    }
}
