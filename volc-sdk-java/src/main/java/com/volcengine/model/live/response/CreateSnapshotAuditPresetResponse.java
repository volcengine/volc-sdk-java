package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateSnapshotAuditPresetResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
