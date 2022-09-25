package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.live.CallbackDetail;
import lombok.Data;

@Data
public class UpdateSnapshotAuditPresetRequest {
    @JSONField(name = "Vhost")
    String Vhost;
    @JSONField(name = "Domain")
    String Domain;
    @JSONField(name = "App")
    String App;
    @JSONField(name = "Interval")
    Double Interval;
    @JSONField(name = "Bucket")
    String Bucket;
    @JSONField(name = "ServiceID")
    String ServiceID;
    @JSONField(name = "StorageDir")
    String StorageDir;
    @JSONField(name = "Description")
    String Description;
    @JSONField(name = "StorageStrategy")
    Long StorageStrategy;
    @JSONField(name = "Label")
    String[] Label;
    @JSONField(name = "CallbackDetailList")
    CallbackDetail[] CallbackDetailList;
    @JSONField(name = "PresetName")
    String PresetName;
}
