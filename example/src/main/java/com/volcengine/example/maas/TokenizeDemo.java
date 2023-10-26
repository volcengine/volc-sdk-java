package com.volcengine.example.maas;

import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.Api;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.MaasService;
import com.volcengine.service.maas.impl.MaasServiceImpl;

import java.util.Arrays;
import java.util.stream.Stream;

public class TokenizeDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        Api.TokenizeReq tReq = Api.TokenizeReq.newBuilder()
                .setModel(Api.Model.newBuilder().setName("${YOUR_MODEL_NAME}"))
                .setText("天空为什么这么蓝？")
                .build();
        testTokenization(maasService, tReq);
    }

    private static void testTokenization(MaasService maasService, Api.TokenizeReq req) {
        try {
            Api.TokenizeResp resp = maasService.tokenization(req);
            System.out.println(resp.getTotalTokens());
            System.out.println(resp.getTokensList());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }
}
