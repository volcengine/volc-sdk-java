// Code generated by protoc-gen-volcengine-sdk
// source: deleteTranscodes
// DO NOT EDIT!

package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodDeleteTranscodesDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest.newBuilder();
			reqBuilder.setVid("your Vid");
			reqBuilder.setFileIds("your FileIds");
			reqBuilder.setCallbackArgs("your CallbackArgs");
			
            com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse resp = vodService.deleteTranscodes(reqBuilder.build());
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