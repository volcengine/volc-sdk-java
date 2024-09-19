package com.volcengine.example.vod.edit;

import com.google.protobuf.ByteString;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest;
import com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse;

import java.nio.charset.StandardCharsets;

public class VodSubmitDirectEditTaskAsyncDemo {

    public static void main(String[] args) {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");


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
