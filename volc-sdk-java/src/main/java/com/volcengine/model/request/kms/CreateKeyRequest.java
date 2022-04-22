package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateKeyRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyName")
    String keyName;
    @JSONField(name = "KeySpec")
    String keySpec;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "KeyUsage")
    String keyUsage;
    @JSONField(name = "ProtectionLevel")
    String protectionLevel;
}
