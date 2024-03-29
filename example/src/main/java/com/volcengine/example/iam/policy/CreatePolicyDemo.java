package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreatePolicyRequest;
import com.volcengine.model.response.iam.CreatePolicyResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreatePolicyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            CreatePolicyRequest request = new CreatePolicyRequest();
            request.setPolicyName("policy_name");
            request.setPolicyDocument("{\"Statement\":[{\"Effect\":\"Allow\",\"Action\":[\"*\"],\"Resource\":[\"*\"]}]}");
            request.setDescription("description");

            CreatePolicyResponse response = iamService.createPolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
