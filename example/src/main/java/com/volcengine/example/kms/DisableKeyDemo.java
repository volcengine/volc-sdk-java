package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.DisableKeyRequest;
import com.volcengine.model.response.kms.DisableKeyResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class DisableKeyDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            DisableKeyRequest req = new DisableKeyRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            req.setKeyName("your_key_name");
            DisableKeyResponse resp = kmsService.disable(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
