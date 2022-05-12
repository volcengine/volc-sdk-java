package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.UpdateKeyRequest;
import com.volcengine.model.response.kms.UpdateKeyResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class UpdateKeyDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            UpdateKeyRequest req = new UpdateKeyRequest();
            // Required fields
            req.setKeyringName("your_old_keyring_name");
            req.setKeyName("your_old_key_name");
            req.setNewKeyName("your_new_key_name");
            // Not required fields
            // req.setDescription();
            UpdateKeyResponse resp = kmsService.updateKey(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
