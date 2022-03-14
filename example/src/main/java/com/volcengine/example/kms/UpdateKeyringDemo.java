package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.UpdateKeyringRequest;
import com.volcengine.model.response.kms.UpdateKeyringResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class UpdateKeyringDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            UpdateKeyringRequest req = new UpdateKeyringRequest();
            // Required fields
            req.setKeyringName("your_old_keyring_name");
            req.setNewKeyringName("your_new_keyring_name");
            // Not required fields
            // req.setDescription();
            UpdateKeyringResponse resp = kmsService.updateKeyring(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
