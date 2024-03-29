// Code generated by protoc-gen-volcengine-sdk
// source: createDomain
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodCreateDomainDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodCreateDomainV2Request.Builder reqBuilder = com.volcengine.service.vod.model.request.VodCreateDomainV2Request.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setDomainType("your DomainType");
			reqBuilder.setDomain("your Domain");
			reqBuilder.setSourceStationType(0);
			reqBuilder.setSourceStationAddressType(0);
			reqBuilder.setOrigins("your Origins");
			reqBuilder.setArea("your Area");
			reqBuilder.setBucketName("your BucketName");
			
            com.volcengine.service.vod.model.response.VodCreateDomainV2Response resp = vodService.createDomain(reqBuilder.build());
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