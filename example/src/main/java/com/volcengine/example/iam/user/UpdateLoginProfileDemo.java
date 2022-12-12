package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.UpdateLoginProfileRequest;
import com.volcengine.model.response.iam.UpdateLoginProfileResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdateLoginProfileDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            UpdateLoginProfileRequest request = UpdateLoginProfileRequest.builder().
                    userName("user_name").
                    loginAllowed(false).
                    password("Password11").
                    passwordResetRequired(true).
                    build();

            UpdateLoginProfileResponse response = iamService.updateLoginProfile(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
