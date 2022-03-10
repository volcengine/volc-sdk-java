package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.DescribeKeysRequest;
import com.volcengine.model.response.kms.DescribeKeysResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class DescribeKeysDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            DescribeKeysRequest req = new DescribeKeysRequest();
            // Required fields
            req.setKeyringName("your_keyring_name");
            // Not required fields
            //req.setCurrentPage();
            //req.setPageSize();
            DescribeKeysResponse resp = kmsService.describeKeys(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
