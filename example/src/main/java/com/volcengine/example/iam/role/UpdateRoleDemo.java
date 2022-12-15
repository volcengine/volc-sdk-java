package com.volcengine.example.iam.role;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.RoleUpdateRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdateRoleDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            RoleUpdateRequest request = new RoleUpdateRequest();
            request.setRoleName("role_name");
            request.setDisplayName("display_name_new");
            request.setDescription("description_new");
            request.setMaxSessionDuration(4800);
            request.setTrustPolicyDocument("{\"Statement\":[{\"Effect\":\"Deny\",\"Action\":[\"sts:AssumeRole\"],\"Principal\":{\"Service\":[\"iam\"]}}]}");

            CommonResponse response = iamService.updateRole(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
