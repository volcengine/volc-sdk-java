// Code generated by protoc-gen-volcengine-sdk
// source: getDirectEditProgress
// DO NOT EDIT!

package com.volcengine.example.vod.edit;

import com.google.protobuf.util.JsonFormat;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCancelDirectEditTaskRequest;

import com.volcengine.service.vod.model.response.VodCancelDirectEditTaskResponse;
import com.volcengine.service.vod.model.response.VodGetDirectEditProgressResponse;

public class VodCancelDirectEditTaskDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        VodCancelDirectEditTaskRequest vodCancelDirectEditTaskRequest = VodCancelDirectEditTaskRequest.newBuilder()
                .setReqId("your reqId")
                .build();

        try {
            VodCancelDirectEditTaskResponse vodCancelDirectEditTaskResponse = vodService.cancelDirectEditTask(vodCancelDirectEditTaskRequest);
            if (vodCancelDirectEditTaskResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCancelDirectEditTaskResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(JsonFormat.printer().includingDefaultValueFields().print(vodCancelDirectEditTaskResponse));// 如有汉字，请采用UTF8编码方式
            System.out.println(vodCancelDirectEditTaskResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
