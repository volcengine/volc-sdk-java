package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAccessKeyRequest {
    @JSONField(name = "AccessKeyId")
    String accessKeyId;
    @JSONField(name = "Status")
    String status;
}
