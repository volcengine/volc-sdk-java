package com.volcengine.example.maas;

import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.Api;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.MaasService;
import com.volcengine.service.maas.impl.MaasServiceImpl;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClassificationDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        Api.ClassificationReq cReq = Api.ClassificationReq.newBuilder()
                .setModel(Api.Model.newBuilder().setName("${YOUR_MODEL_NAME}"))
                .setQuery("天空为什么这么蓝？")
                .addAllLabels(Arrays.asList("陈述句", "疑问句", "肯定句"))
                .build();
        testClassification(maasService, cReq);
    }
    private static void testClassification(MaasService maasService, Api.ClassificationReq req) {
        try {
            Api.ClassificationResp resp = maasService.classification(req);
            System.out.println(resp.getLabel());
            System.out.println(resp.getLabelLogprobosMap());
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
