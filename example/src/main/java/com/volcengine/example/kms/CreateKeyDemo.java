package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.CreateKeyRequest;
import com.volcengine.model.response.kms.CreateKeyResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class CreateKeyDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            CreateKeyRequest req = new CreateKeyRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            req.setKeyName("your_key_name");
            // Not required fields
            //req.setKeyUsage();
            //req.setProtectionLevel();
            //req.setKeySpec();
            //req.setDescription();
            CreateKeyResponse resp = kmsService.createKey(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
