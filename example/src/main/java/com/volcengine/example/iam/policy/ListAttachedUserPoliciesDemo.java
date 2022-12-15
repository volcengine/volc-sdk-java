package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListAttachedUserPoliciesRequest;
import com.volcengine.model.response.iam.ListAttachedUserPoliciesResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListAttachedUserPoliciesDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListAttachedUserPoliciesRequest request =  new ListAttachedUserPoliciesRequest();
            request.setUserName("user1");

            ListAttachedUserPoliciesResponse response = iamService.listAttachedUserPolicies(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
