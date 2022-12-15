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
            UpdatePolicyRequest request = new UpdatePolicyRequest();
            request.setPolicyName("policy_name");
            request.setNewPolicyName("policy_name_new");
            request.setNewPolicyDocument("{\"Statement\":[{\"Effect\":\"Deny\",\"Action\":[\"*\"],\"Resource\":[\"*\"]}]}");
            request.setNewDescription("description_new");

            UpdatePolicyResponse response = iamService.updatePolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
