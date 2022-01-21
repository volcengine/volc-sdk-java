package com.volcengine.example.vod.upload;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.VodUrlUploadURLSet;
import com.volcengine.service.vod.model.request.VodUrlUploadRequest;
import com.volcengine.service.vod.model.response.VodUrlUploadResponse;

public class VodUploadMediaByUrlDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "your space name";
        String url = "url";

        VodUrlUploadURLSet vodUrlUploadURLSet = VodUrlUploadURLSet.newBuilder()
                .setSourceUrl(url)
                .setFileName("test.mp4")
                .build();

        VodUrlUploadRequest vodUrlUploadRequest = VodUrlUploadRequest.newBuilder()
                .setSpaceName(space)
                .addURLSets(vodUrlUploadURLSet)
                .build();

        try {
            VodUrlUploadResponse vodUrlUploadResponse = vodService.uploadMediaByUrl(vodUrlUploadRequest);
            if (vodUrlUploadResponse.getResponseMetadata().hasError()) {
                System.out.println(vodUrlUploadResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodUrlUploadResponse.toString());
            System.out.println(vodUrlUploadResponse.getResult().getData(0).getJobId());
            System.out.println(vodUrlUploadResponse.getResult().getData(0).getSourceUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
