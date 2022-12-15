package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.GetUserRequest;
import com.volcengine.model.response.iam.GetUserResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class GetUserDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            GetUserRequest request = GetUserRequest.builder().
                    userName("user_sdk").
                    withThirdPartyIdentity(true). //do not set any value include false if you don't need third party identity info
                    build();

            GetUserResponse response = iamService.getUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
