package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodRetrieveTranscodeResultRequest;
import com.volcengine.service.vod.model.response.VodRetrieveTranscodeResultResponse;

public class VodRetrieveTranscodeResultDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");


        VodRetrieveTranscodeResultRequest vodRetrieveTranscodeResultRequest = VodRetrieveTranscodeResultRequest.newBuilder()
                .setVid("your vid")
                .setResultType("your ResultType")
                .build();

        try {
            VodRetrieveTranscodeResultResponse vodRetrieveTranscodeResultResponse = vodService.retrieveTranscodeResult(vodRetrieveTranscodeResultRequest);
            if (vodRetrieveTranscodeResultResponse.getResponseMetadata().hasError()) {
                System.out.println(vodRetrieveTranscodeResultResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodRetrieveTranscodeResultResponse.toString());
            System.out.println(vodRetrieveTranscodeResultResponse.getResult().getRunId());
            System.out.println(vodRetrieveTranscodeResultResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
