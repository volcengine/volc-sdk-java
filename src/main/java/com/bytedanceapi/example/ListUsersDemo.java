package com.bytedanceapi.example;

import com.alibaba.fastjson.JSON;
import com.bytedanceapi.model.request.ListUsersRequest;
import com.bytedanceapi.model.response.ListUsersResponse;
import com.bytedanceapi.service.iam.IIamService;
import com.bytedanceapi.service.iam.impl.IamServiceImpl;

public class ListUsersDemo {

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
