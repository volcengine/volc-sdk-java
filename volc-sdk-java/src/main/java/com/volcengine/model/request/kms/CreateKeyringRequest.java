package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateKeyringRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyringType")
    String keyringType;
    @JSONField(name = "Description")
    String description;
}
