package com.volcengine.example.maas;

import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.Api;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.MaasService;
import com.volcengine.service.maas.impl.MaasServiceImpl;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmbeddingsDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        Api.EmbeddingsReq tReq = Api.EmbeddingsReq.newBuilder()
                .setModel(Api.Model.newBuilder().setName("${YOUR_MODEL_NAME}"))
                .addInput("天很蓝")
                .addInput("海很深")
                .build();
        testEmbeddings(maasService, tReq);
    }

    private static void testEmbeddings(MaasService maasService, Api.EmbeddingsReq req) {
        try {
            Api.EmbeddingsResp resp = maasService.embeddings(req);
            System.out.println(resp.getObject());
            System.out.println(resp.getDataList()); //object: object type 恒为embedding，embedding: embedding向量，index: 列表中序号
    } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }
}