// Code generated by protoc-gen-volcengine-sdk
// source: KillStream
// DO NOT EDIT!

package com.volcengine.service.live.stream_manage;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveKillStreamDemo {

    public static void main(String[] args) throws Exception {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.KillStreamRequest.Builder reqBuilder = com.volcengine.service.live.model.request.KillStreamRequest.newBuilder();
			reqBuilder.setVhost("your Vhost");
			reqBuilder.setApp("your App");
			reqBuilder.setStream("your Stream");
			
            com.volcengine.service.live.model.response.KillStreamResponse resp = liveService.KillStream(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}