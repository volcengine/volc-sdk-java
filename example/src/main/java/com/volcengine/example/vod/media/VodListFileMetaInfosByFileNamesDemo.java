// Code generated by protoc-gen-volcengine-sdk
// source: listFileMetaInfosByFileNames
// DO NOT EDIT!

package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodListFileMetaInfosByFileNamesDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodListFileMetaInfosByFileNamesRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setFileNameEncodeds("your FileNameEncodeds");
			reqBuilder.setBucketName("your BucketName");
			
            com.volcengine.service.vod.model.response.VodListFileMetaInfosByFileNamesResponse resp = vodService.listFileMetaInfosByFileNames(reqBuilder.build());
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