// Code generated by protoc-gen-volcengine-sdk
// source: updateMediaPublishStatus
// DO NOT EDIT!

package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodUpdateMediaPublishStatusDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest.newBuilder();
			reqBuilder.setVid("your Vid");
			reqBuilder.setStatus("your Status");
			
            com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse resp = vodService.updateMediaPublishStatus(reqBuilder.build());
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