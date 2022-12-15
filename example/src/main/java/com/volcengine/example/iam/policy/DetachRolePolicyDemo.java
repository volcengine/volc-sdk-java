package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.DetachRolePolicyRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class DetachRolePolicyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            DetachRolePolicyRequest request = new DetachRolePolicyRequest();
            request.setPolicyName("policy_name");
            request.setRoleName("role_name");
            request.setPolicyType("Custom");

            CommonResponse response = iamService.detachRolePolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
