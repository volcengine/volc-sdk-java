package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateUserRequest;
import com.volcengine.model.response.iam.CreateUserResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreateUserDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            CreateUserRequest request = new CreateUserRequest();
            request.setUserName("user_sdk");
            request.setDisplayName("user_display");
            request.setEmail("email@cc.com");
            request.setMobilePhone("+86-1300000000");
            request.setDescription("For sdk demo");

            CreateUserResponse response = iamService.createUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
