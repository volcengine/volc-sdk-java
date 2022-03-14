package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.EnableKeyRequest;
import com.volcengine.model.response.kms.EnableKeyResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;


public class EnableKeyDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            EnableKeyRequest req = new EnableKeyRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            req.setKeyName("your_key_name");
            EnableKeyResponse resp = kmsService.enableKey(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
