package com.volcengine.example.vod.edit;

import com.google.protobuf.ByteString;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest;
import com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse;

import java.nio.charset.StandardCharsets;

public class VodSubmitDirectEditTaskAsyncDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        VodSubmitDirectEditTaskAsyncRequest vodSubmitDirectEditTaskAsyncRequest = VodSubmitDirectEditTaskAsyncRequest.newBuilder()
                .setUploader("your space")
                .setApplication("VideoTrackToB")
                .setEditParam(ByteString.copyFromUtf8("your params"))
                .build();

        try {
            VodSubmitDirectEditTaskAsyncResponse vodSubmitDirectEditTaskAsyncResponse = vodService.submitDirectEditTaskAsync(vodSubmitDirectEditTaskAsyncRequest);
            if (vodSubmitDirectEditTaskAsyncResponse.getResponseMetadata().hasError()) {
                System.out.println(vodSubmitDirectEditTaskAsyncResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodSubmitDirectEditTaskAsyncResponse.toString()); // 编码采用UTF8
            System.out.println(vodSubmitDirectEditTaskAsyncResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
