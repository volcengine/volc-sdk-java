package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateKeyringRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "NewKeyringName")
    String newKeyringName;
    @JSONField(name = "Description")
    String description;
}
