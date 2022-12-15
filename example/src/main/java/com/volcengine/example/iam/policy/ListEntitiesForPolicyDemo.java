package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListEntitiesForPolicyRequest;
import com.volcengine.model.response.iam.ListEntitiesForPolicyResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListEntitiesForPolicyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListEntitiesForPolicyRequest request = ListEntitiesForPolicyRequest.builder().
                    policyName("policy_name").
                    policyType("Custom").
                    entityFilter("User").
                    offset(0).
                    limit(10).
                    build();

            ListEntitiesForPolicyResponse response = iamService.listEntitiesForPolicy(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
