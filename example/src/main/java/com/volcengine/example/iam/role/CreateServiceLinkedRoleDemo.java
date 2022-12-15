package com.volcengine.example.iam.role;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateServiceLinkedRoleRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class CreateServiceLinkedRoleDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            CreateServiceLinkedRoleRequest request = new CreateServiceLinkedRoleRequest();
            request.setServiceName("service_test");

            CommonResponse response = iamService.createServiceLinkedRole(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
