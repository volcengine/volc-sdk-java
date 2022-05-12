package com.volcengine.auth.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListUsersRequest;
import com.volcengine.model.response.iam.ListUsersResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;
import junit.framework.TestCase;

import java.util.*;

public class SignerV4ImplTest extends TestCase {

    public void testSignHeader(){
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("your-ak");
        iamService.setSecretKey("your-sk");
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

    public void testSignUrl(){
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("your-ak");
        service.setSecretKey("your-sk");

        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", "imagex service id");
        // set expires time of the upload token, defalut is 15min(900s)
        params.put("X-Amz-Expires", "60");

        try {
            String token = service.getUploadToken(params);
            System.out.println(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
