package com.volcengine.example.maas.v2;

import com.volcengine.model.maas.api.v2.ChatReq;
import com.volcengine.model.maas.api.v2.ChatResp;
import com.volcengine.model.maas.api.v2.Message;
import com.volcengine.model.maas.api.v2.Parameters;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.v2.impl.MaasServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ChatWithApikeyV2Demo {
    public static void main(String[] args) {
        MaasService maasService = new MaasServiceImpl("maas-api.ml-platform-cn-beijing.volces.com", "cn-beijing");

        String apikey = "${YOUR_APIKEY}";
        maasService.setApikey(apikey);

        ChatReq req = new ChatReq()
                .withParameters(new Parameters()
                        .withMaxNewTokens(2000)
                        .withTemperature(0.8f)
                )
                .withMessages(new ArrayList<>(Arrays.asList(
                        new Message().withRole(Message.ChatRole.USER).withContent("天为什么这么蓝？"),
                        new Message().withRole(Message.ChatRole.ASSISTANT).withContent("因为有你"),
                        new Message().withRole(Message.ChatRole.USER).withContent("什么是中国")
                )));

        String endpointId = "${YOUR_ENDPOINT_ID}";
        testChat(maasService, endpointId, req);
        testStreamChat(maasService, endpointId, req);
    }

    private static void testChat(MaasService maasService, String endpointId, ChatReq req) {
        try {
            ChatResp resp = maasService.chat(endpointId, req);
            System.out.println(resp.getChoices().get(0).getMessage().getContent());
            System.out.println(resp.getUsage());
        } catch (MaasException e) {
            System.out.println("req_id: " + e.getRequestId());
            System.out.println("code: " + e.getCode());
            System.out.println("code_n: " + e.getCodeN());
            System.out.println("message: " + e.getMsg());
            e.printStackTrace();
        }
    }

    private static void testStreamChat(MaasService maasService, String endpointId, ChatReq req) {
        Stream<ChatResp> resps = null;
        try {
            resps = maasService.streamChat(endpointId, req);
        } catch (MaasException e) {
            e.printStackTrace();
        }


        assert resps != null;

        // it is possible that error occurs during response processing
        try {
            resps.forEach(resp -> {
                System.out.println(resp.getChoices().get(0).getMessage().getContent());

                // last message, will return full response including usage, role, finish_reason, etc.
                if (resp.getUsage() != null && resp.getUsage().getTotalTokens() > 0) {
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
