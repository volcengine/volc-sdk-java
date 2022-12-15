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
            CreateLoginProfileRequest request = new CreateLoginProfileRequest();
            request.setUserName("user_name");
            request.setLoginAllowed(true);
            request.setPassword("Password11");
            request.setPasswordResetRequired(true);

            CreateLoginProfileResponse response = iamService.createLoginProfile(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
