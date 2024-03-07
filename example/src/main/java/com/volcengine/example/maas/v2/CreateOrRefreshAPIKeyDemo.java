package com.volcengine.example.maas.v2;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.maas.api.v2.CreateOrRefreshAPIKeyReq;
import com.volcengine.model.maas.api.v2.CreateOrRefreshAPIKeyResp;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateOrRefreshAPIKeyDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("open.volcengineapi.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        CreateOrRefreshAPIKeyReq req = new CreateOrRefreshAPIKeyReq();

        String endpointId = "${YOUR_ENDPOINT_ID}";
        List<String> endpointIdList = new ArrayList<>();
        endpointIdList.add(endpointId);
        req.setTtl(86400);
        req.setEndpointIdList(endpointIdList);

        testCreateOrRefreshAPIKey(maasService, req);
    }

    private static void testCreateOrRefreshAPIKey(MaasService maasService, CreateOrRefreshAPIKeyReq req) {
        try {
            CreateOrRefreshAPIKeyResp resp = maasService.createOrRefreshAPIKey(req);
            System.out.println(JSON.toJSONString(resp));

            System.out.println(resp.getResult().getApiKey());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
