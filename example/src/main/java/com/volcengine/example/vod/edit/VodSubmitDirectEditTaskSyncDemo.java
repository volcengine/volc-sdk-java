package com.volcengine.example.vod.edit;

import com.google.protobuf.ByteString;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskSyncRequest;
import com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskSyncResponse;

public class VodSubmitDirectEditTaskSyncDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        VodSubmitDirectEditTaskSyncRequest vodSubmitDirectEditTaskSyncRequest = VodSubmitDirectEditTaskSyncRequest.newBuilder()
                .setUploader("your space")
                .setApplication("SimpleCut")
                .setEditParam(ByteString.copyFromUtf8("your params"))
                .build();

        try {
            VodSubmitDirectEditTaskSyncResponse vodSubmitDirectEditTaskSyncResponse = vodService.submitDirectEditTaskSync(vodSubmitDirectEditTaskSyncRequest);
            if (vodSubmitDirectEditTaskSyncResponse.getResponseMetadata().hasError()) {
                System.out.println(vodSubmitDirectEditTaskSyncResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodSubmitDirectEditTaskSyncResponse.toString()); // 编码采用UTF8
            System.out.println(vodSubmitDirectEditTaskSyncResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
