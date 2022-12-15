package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.UpdatePolicyRequest;
import com.volcengine.model.response.iam.UpdatePolicyResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdatePolicyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            UpdatePolicyRequest request = UpdatePolicyRequest.builder().
                    policyName("policy_name").
                    newPolicyName("policy_name_new").
                    newPolicyDocument("{\"Statement\":[{\"Effect\":\"Deny\",\"Action\":[\"*\"],\"Resource\":[\"*\"]}]}").
                    newDescription("description_new").
                    build();

            UpdatePolicyResponse response = iamService.updatePolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
