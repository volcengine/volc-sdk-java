package com.volcengine.example.iam.role;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.RoleCreateRequest;
import com.volcengine.model.response.iam.RoleGetResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreateRoleDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            RoleCreateRequest request = new RoleCreateRequest();
            request.setRoleName("role_name");
            request.setDescription("description");
            request.setMaxSessionDuration("3600");
            request.setDisplayName("displayName");
            request.setTrustPolicyDocument("{\"Statement\":[{\"Effect\":\"Allow\",\"Action\":[\"sts:AssumeRole\"],\"Principal\":{\"Service\":[\"iam\"]}}]}");

            RoleGetResponse response = iamService.createRole(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
