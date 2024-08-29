// Code generated by protoc-gen-volcengine-sdk
// source: getFileInfos
// DO NOT EDIT!

package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodGetFileInfosDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetFileInfosRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodGetFileInfosRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setEncodedFileNames("your EncodedFileNames");
			reqBuilder.setBucketName("your BucketName");
			
            com.volcengine.service.vod.model.response.VodGetFileInfosResponse resp = vodService.getFileInfos(reqBuilder.build());
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