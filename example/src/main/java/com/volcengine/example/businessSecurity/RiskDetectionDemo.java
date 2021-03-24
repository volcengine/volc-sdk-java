package com.volcengine.example.iam;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListUsersRequest;
import com.volcengine.model.response.ListUsersResponse;
import com.volcengine.service.iam.BusinessSecurity;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class RiskDetectionDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("ak");
        iamService.setSecretKey("sk");
        // list users
        try {
            ListUsersRequest listUsersRequest = new ListUsersRequest();
            listUsersRequest.setLimit(3);

            ListUsersResponse listUsersResponse = iamService.listUsers(listUsersRequest);
            System.out.println(JSON.toJSONString(listUsersResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
