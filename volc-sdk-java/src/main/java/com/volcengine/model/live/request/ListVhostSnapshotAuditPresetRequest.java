package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVhostSnapshotAuditPresetRequest {
    @JSONField(name = "Vhost")
    String Vhost;
}
