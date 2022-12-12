package com.volcengine.example.iam.accessKey;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateAccessKeyRequest;
import com.volcengine.model.response.iam.CreateAccessKeyResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreateAccessKeyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            CreateAccessKeyRequest request = new CreateAccessKeyRequest();
            request.setUserName("user_sdk_test");


            CreateAccessKeyResponse response = iamService.createAccessKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
