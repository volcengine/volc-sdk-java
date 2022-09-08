package com.volcengine.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateUserRequest;
import com.volcengine.model.request.iam.DeleteUserRequest;
import com.volcengine.model.response.iam.CreateUserResponse;
import com.volcengine.model.response.iam.DeleteUserResponse;
import com.volcengine.service.iam.IIamService;
import junit.framework.TestCase;
import org.junit.Test;

public class IamServiceImplTest extends TestCase {
    IIamService svc = IamServiceImpl.getInstance();

    {
        svc.setAccessKey("ak");
        svc.setSecretKey("sk");
    }

    @Test
    public void testCreateUser() {
        CreateUserRequest request = new CreateUserRequest();
        request.setUserName("Test001");
        request.setDisplayName("Test");
        request.setMobilePhone("13123232323");
        request.setEmail("163@163.com");
        request.setDescription("test");
        
        try {
            CreateUserResponse response = svc.createUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteUser() {
        DeleteUserRequest request = new DeleteUserRequest();
        request.setUserName("C");

        try {
            DeleteUserResponse response = svc.deleteUser(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
