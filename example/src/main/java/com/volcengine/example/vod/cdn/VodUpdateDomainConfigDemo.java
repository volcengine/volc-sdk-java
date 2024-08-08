// Code generated by protoc-gen-volcengine-sdk
// source: updateDomainConfig
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodUpdateDomainConfigDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodUpdateDomainConfigRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodUpdateDomainConfigRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setDomainType("your DomainType");
			reqBuilder.setDomain("your Domain");
			com.volcengine.service.vod.model.business.VodDomainConfig.Builder configBuilder = com.volcengine.service.vod.model.business.VodDomainConfig.newBuilder();
			reqBuilder.setConfig(configBuilder);
			
            com.volcengine.service.vod.model.response.VodUpdateDomainConfigResponse resp = vodService.updateDomainConfig(reqBuilder.build());
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