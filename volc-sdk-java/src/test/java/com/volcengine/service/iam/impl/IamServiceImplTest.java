package com.volcengine.service.iam.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.CreateUserRequest;
import com.volcengine.model.request.iam.DeleteUserRequest;
import com.volcengine.model.request.iam.ListUsersRequest;
import com.volcengine.model.response.iam.CreateUserResponse;
import com.volcengine.model.response.iam.DeleteUserResponse;
import com.volcengine.model.response.iam.ListUsersResponse;
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

    public void testMultiInstance() throws Exception {
        ListUsersRequest request = new ListUsersRequest();
        request.setLimit(100);

        IIamService instance1 = IamServiceImpl.getInstance();
        instance1.setAccessKey("AKLT1");
        instance1.setSecretKey("SKLT1");
        IIamService instance2 = IamServiceImpl.getInstance();
        instance2.setAccessKey("AKLT2");
        instance2.setSecretKey("SKLT2");

        ListUsersResponse listUsersResponse1_1 = instance1.listUsers(request);
        System.out.println(listUsersResponse1_1.toString());
        ListUsersResponse listUsersResponse2_1 = instance2.listUsers(request);
        System.out.println(listUsersResponse2_1.toString());

        ListUsersResponse listUsersResponse1_2 = instance1.listUsers(request);
        System.out.println(listUsersResponse1_2.toString());
        ListUsersResponse listUsersResponse2_2 = instance2.listUsers(request);
        System.out.println(listUsersResponse2_2.toString());

        instance1.destroy();
        instance2.destroy();

    }

}
