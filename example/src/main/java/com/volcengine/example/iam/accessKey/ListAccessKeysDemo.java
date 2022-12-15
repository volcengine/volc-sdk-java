package com.volcengine.example.iam.accessKey;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListAccessKeysRequest;
import com.volcengine.model.response.iam.ListAccessKeysResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListAccessKeysDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListAccessKeysRequest request = new ListAccessKeysRequest();
            request.setUserName("user_sdk_test");

            ListAccessKeysResponse response = iamService.listAccessKeys(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
