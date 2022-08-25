package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteSnapshotAuditPresetRequest {
    @JSONField(name = "Vhost")
    String Vhost;
    @JSONField(name = "App")
    String App;
    @JSONField(name = "PresetName")
    String PresetName;
}
