package com.volcengine.example.iam.role;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.RoleListRequest;
import com.volcengine.model.response.iam.RoleListResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListRolesDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            RoleListRequest request= new RoleListRequest();
            request.setRoleName("role_name,role_name_2");
            request.setLimit(3);

            RoleListResponse response = iamService.listRoles(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
