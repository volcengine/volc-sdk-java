package com.volcengine.example.sts;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.AssumeRoleRequest;
import com.volcengine.model.response.AssumeRoleResponse;
import com.volcengine.service.sts.ISTSService;
import com.volcengine.service.sts.impl.STSServiceImpl;

public class AssumeRoleDemo {

    public static void main(String[] args) throws Exception {
        ISTSService stsService = STSServiceImpl.getInstance();

        stsService.setAccessKey("your ak");
        stsService.setSecretKey("your sk");

        AssumeRoleRequest request = new AssumeRoleRequest();
        request.setRoleSessionName("just_for_test");
        request.setDurationSeconds(900);
        request.setRoleTrn("trn:iam::yourAccountID:role/yourRoleName");

        AssumeRoleResponse resp = stsService.assumeRole(request);
        System.out.println(JSON.toJSONString(resp));

    }

}
