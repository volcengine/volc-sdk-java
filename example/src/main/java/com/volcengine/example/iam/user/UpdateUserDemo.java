package com.volcengine.example.iam.user;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.UpdateUserRequest;
import com.volcengine.model.response.iam.UpdateUserResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdateUserDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            UpdateUserRequest request = UpdateUserRequest.builder().
                    userName("user_sdk").
                    newDisplayName("new_user_display").
                    newEmail("new_email@cc.com").
                    newMobilePhone("+86-1300000001").
                    newDescription("For sdk demo new").
                    build();

            UpdateUserResponse response = iamService.updateUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
