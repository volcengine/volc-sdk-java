package com.volcengine.example.upload;

import com.volcengine.model.vod.request.VodApplyUploadInfoRequest;
import com.volcengine.model.vod.response.VodApplyUploadInfoResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class VodApplyUploadInfoDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "james-test";

        VodApplyUploadInfoRequest vodApplyUploadInfoRequest = VodApplyUploadInfoRequest.newBuilder()
                .setSpaceName(space)
                .build();

        try {
            VodApplyUploadInfoResponse vodApplyUploadInfoResponse = vodService.applyUploadInfo(vodApplyUploadInfoRequest);
            if (vodApplyUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodApplyUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodApplyUploadInfoResponse.toString());
            System.out.println(vodApplyUploadInfoResponse.getResult().getData().getUploadAddress().getSessionKey());
            System.out.println(vodApplyUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
