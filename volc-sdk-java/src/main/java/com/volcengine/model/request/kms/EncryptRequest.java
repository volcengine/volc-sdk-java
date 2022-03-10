package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class EncryptRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyName")
    String keyName;
    @JSONField(name = "EncryptionContext")
    Map<String, String> encryptionContext;
    @JSONField(name = "Plaintext")
    byte[] plaintext;
}
