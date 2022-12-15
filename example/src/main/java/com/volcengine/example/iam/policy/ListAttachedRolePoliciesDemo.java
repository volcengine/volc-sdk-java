package com.volcengine.example.iam.policy;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListAttachedRolePoliciesRequest;
import com.volcengine.model.response.iam.ListAttachedRolePoliciesResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListAttachedRolePoliciesDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListAttachedRolePoliciesRequest request = new ListAttachedRolePoliciesRequest();
            request.setRoleName("role_name");

            ListAttachedRolePoliciesResponse response = iamService.listAttachedRolePolicies(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
