package com.volcengine.example.maas;

import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.Api;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.MaasService;
import com.volcengine.service.maas.impl.MaasServiceImpl;

import java.util.stream.Stream;

public class ChatDemo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        // fetch ak&sk from environmental variables
        maasService.setAccessKey(System.getenv("VOLC_ACCESSKEY"));
        maasService.setSecretKey(System.getenv("VOLC_SECRETKEY"));

        Api.ChatReq req = Api.ChatReq.newBuilder()
                .setModel(Api.Model.newBuilder().setName("${YOUR_MODEL_NAME}"))
                .setParameters(Api.Parameters.newBuilder()
                        .setMaxNewTokens(2000)
                        .setTemperature(0.8f)
                )
                .addMessages(Api.Message.newBuilder().setRole(Const.MaasChatRoleOfUser).setContent("天为什么这么蓝？"))
                .addMessages(Api.Message.newBuilder().setRole(Const.MaasChatRoleOfAssistant).setContent("因为有你"))
                .addMessages(Api.Message.newBuilder().setRole(Const.MaasChatRoleOfUser).setContent("花儿为什么这么香？"))
                .build();

        testChat(maasService, req);
        testStreamChat(maasService, req);
    }

    private static void testChat(MaasService maasService, Api.ChatReq req) {
        try {
            Api.ChatResp resp = maasService.chat(req);
            System.out.println(resp.getChoice().getMessage().getContent());
            System.out.println(resp.getUsage());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }

    private static void testStreamChat(MaasService maasService, Api.ChatReq req) {
        Stream<Api.ChatResp> resps = null;
        try {
            resps = maasService.streamChat(req);
        } catch (MaasException e) {
            e.printStackTrace();
        }


        assert resps != null;

        // it is possible that error occurs during response processing
        try {
            resps.forEach(resp -> {
                System.out.println(resp.getChoice().getMessage().getContent());

                // last message, will return full response including usage, role, finish_reason, etc.
                if (resp.getUsage().isInitialized()) {
                    System.out.println(resp.getUsage());
                }
            });
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof MaasException) {
                System.out.println("req_id: " + ((MaasException) cause).getRequestId());
                System.out.println("code: " + ((MaasException) cause).getCode());
                System.out.println("code_n: " + ((MaasException) cause).getCodeN());
                System.out.println("message: " + ((MaasException) cause).getMsg());
            }
            System.out.println("caught: " + e);
        }
    }
}
