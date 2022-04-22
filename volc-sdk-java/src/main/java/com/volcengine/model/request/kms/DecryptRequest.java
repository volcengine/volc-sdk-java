package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class DecryptRequest {
    @JSONField(name = "EncryptionContext")
    Map<String, String> encryptionContext;
    @JSONField(name = "CiphertextBlob")
    byte[] ciphertextBlob;
}
