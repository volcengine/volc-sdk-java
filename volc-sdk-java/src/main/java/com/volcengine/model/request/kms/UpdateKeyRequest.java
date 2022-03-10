package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateKeyRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyName")
    String keyName;
    @JSONField(name = "NewKeyName")
    String newKeyName;
    @JSONField(name = "Description")
    String description;
}
