package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListPoliciesRequest;
import com.volcengine.model.response.iam.ListPoliciesResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListPoliciesDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListPoliciesRequest request = ListPoliciesRequest.builder().
                    scope("Custom").query("policy_name").status("active").limit(1).offset(0).build();

            ListPoliciesResponse response = iamService.listPolicies(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
