// Code generated by protoc-gen-volcengine-sdk
// source: getPrivateDrmPlayAuth
// DO NOT EDIT!

package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodGetPrivateDrmPlayAuthDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest.newBuilder();
			reqBuilder.setDrmType("your DrmType");
			reqBuilder.setVid("your Vid");
			reqBuilder.setPlayAuthIds("your PlayAuthIds");
			reqBuilder.setUnionInfo("your UnionInfo");
			
            com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse resp = vodService.getPrivateDrmPlayAuth(reqBuilder.build());
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