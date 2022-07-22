// Code generated by protoc-gen-volcengine-sdk
// source: getSpaceDetail
// DO NOT EDIT!

package com.volcengine.example.vod.space;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodGetSpaceDetailDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetSpaceDetailRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodGetSpaceDetailRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			
            com.volcengine.service.vod.model.response.VodGetSpaceDetailResponse resp = vodService.getSpaceDetail(reqBuilder.build());
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