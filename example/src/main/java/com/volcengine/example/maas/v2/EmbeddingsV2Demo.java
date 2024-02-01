package com.volcengine.example.maas.v2;

import com.volcengine.model.maas.api.v2.*;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class EmbeddingsV2Demo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        EmbeddingsReq tReq = new EmbeddingsReq()
                .withInput(new ArrayList<>(Arrays.asList(
                        "海很深",
                        "海很深"
                )));

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testEmbeddings(maasService, endpointId, tReq);
    }

    private static void testEmbeddings(MaasService maasService, String endpointId, EmbeddingsReq req) {
        try {
            EmbeddingsResp resp = maasService.embeddings(endpointId, req);
            System.out.println(resp.getObject());
            System.out.println(resp.getData()); //object: object type 恒为embedding，embedding: embedding向量，index: 列表中序号
    } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }
}