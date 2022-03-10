package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.EncryptRequest;
import com.volcengine.model.response.kms.EncryptResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

import java.nio.charset.StandardCharsets;

public class EncryptDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            EncryptRequest req = new EncryptRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            req.setKeyName("your_key_name");
            req.setPlaintext("plaintext".getBytes(StandardCharsets.UTF_8));
            // Not required fields
            //req.setEncryptionContext();
            EncryptResponse resp = kmsService.encrypt(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
