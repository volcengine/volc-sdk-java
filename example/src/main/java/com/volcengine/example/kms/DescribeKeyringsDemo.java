package com.volcengine.example.kms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.kms.DescribeKeyringsRequest;
import com.volcengine.model.response.kms.DescribeKeyringsResponse;
import com.volcengine.service.kms.IKmsService;
import com.volcengine.service.kms.impl.KmsServiceImpl;

public class DescribeKeyringsDemo {
    public static void main(String[] args) {
        IKmsService kmsService = KmsServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        kmsService.setAccessKey("your_access_key");
        kmsService.setSecretKey("your_secret_key");
        // list users
        try {
            DescribeKeyringsRequest req = new DescribeKeyringsRequest();
            // Not required fields
            //req.setCurrentPage();
            //req.setPageSize();
            DescribeKeyringsResponse resp = kmsService.describeKeyrings(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
