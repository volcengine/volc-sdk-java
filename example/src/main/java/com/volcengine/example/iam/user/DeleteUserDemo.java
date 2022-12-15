package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.DeleteUserRequest;
import com.volcengine.model.response.iam.DeleteUserResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class DeleteUserDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            DeleteUserRequest request = new DeleteUserRequest();
            request.setUserName("user_sdk");

            DeleteUserResponse response = iamService.deleteUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
