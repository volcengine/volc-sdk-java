package com.volcengine.example.maas.v2;

import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.util.Arrays;

public class ClassificationV2Demo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        ClassificationReq cReq = new ClassificationReq()
                .withQuery("天空为什么这么蓝？")
                .withLabels(Arrays.asList("陈述句", "疑问句", "肯定句"));

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testClassification(maasService, endpointId, cReq);
    }
    private static void testClassification(MaasService maasService, String endpointId, ClassificationReq req) {
        try {
            ClassificationResp resp = maasService.classification(endpointId, req);
            System.out.println(resp.getLabel());
            System.out.println(resp.getLabelLogprobos());
            System.out.println(resp.getUsage());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }
}
