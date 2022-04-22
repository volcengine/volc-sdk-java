package com.volcengine.example.kms;
import com.volcengine.model.request.kms.CreateKeyringRequest;
import com.volcengine.model.response.kms.CreateKeyringResponse;
import com.volcengine.service.kms.IKmsService;
import com.alibaba.fastjson.JSON;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class CreateKeyringDemo {

    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            CreateKeyringRequest req = new CreateKeyringRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            // Not required fields
            //req.setDescription();
            //req.setKeyringType();
            CreateKeyringResponse resp = kmsService.createKeyring(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
