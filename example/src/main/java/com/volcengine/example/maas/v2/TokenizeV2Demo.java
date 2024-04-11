package com.volcengine.example.maas.v2;

import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

public class TokenizeV2Demo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        TokenizeReq tReq = new TokenizeReq()
                .withText("天空为什么这么蓝？");

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testTokenization(maasService, endpointId, tReq);
    }

    private static void testTokenization(MaasService maasService, String endpointId, TokenizeReq req) {
        try {
            TokenizeResp resp = maasService.tokenization(endpointId, req);
            System.out.println(resp.getTotalTokens());
            System.out.println(resp.getTokens());
            System.out.println(resp.getTokenIds());
            System.out.println(resp.getOffsetMapping());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }
}
