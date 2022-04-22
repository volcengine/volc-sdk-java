package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.DecryptRequest;
import com.volcengine.model.request.kms.EncryptRequest;
import com.volcengine.model.response.kms.DecryptResponse;
import com.volcengine.model.response.kms.EncryptResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

import java.nio.charset.StandardCharsets;

public class DecryptDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            DecryptRequest req = new DecryptRequest();
            // Required fields
            req.setCiphertextBlob("ciphertextBolb".getBytes(StandardCharsets.UTF_8));
            // Not required fields
            //req.setEncryptionContext();
            DecryptResponse resp = kmsService.decrypt(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
