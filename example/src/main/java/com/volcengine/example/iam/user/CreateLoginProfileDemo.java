package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateLoginProfileRequest;
import com.volcengine.model.response.iam.CreateLoginProfileResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreateLoginProfileDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            CreateLoginProfileRequest request = CreateLoginProfileRequest.builder().
                    userName("user_name").
                    loginAllowed(true).
                    password("Password11").
                    passwordResetRequired(true).
                    build();

            CreateLoginProfileResponse response = iamService.createLoginProfile(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
