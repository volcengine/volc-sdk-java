package com.volcengine.example.vod.edit;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.ByteString;
import com.google.protobuf.util.JsonFormat;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodAsyncVCreativeTaskRequest;
import com.volcengine.service.vod.model.request.VodRequest;
import com.volcengine.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest;
import com.volcengine.service.vod.model.response.VodAsyncVCreativeTaskResponse;
import com.volcengine.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse;

import java.util.HashMap;

public class VodAsyncVCreativeTaskDemo {

    public static void main(String[] args) {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

        JSONObject paramObj = new JSONObject();
        paramObj.put("input","vid://{your vid}");
        paramObj.put("style","漫画风");
        paramObj.put("resolution","720p");
        VodAsyncVCreativeTaskRequest vodAsyncVCreativeTaskRequest = VodAsyncVCreativeTaskRequest.newBuilder()
                .setUploader("your space")
                .setParamStr(paramObj.toString())
                .setScene("videostyletrans")
                .build();

        try {
            VodAsyncVCreativeTaskResponse vodAsyncVCreativeTaskResponse = vodService.asyncVCreativeTask(vodAsyncVCreativeTaskRequest);
            if (vodAsyncVCreativeTaskResponse.getResponseMetadata().hasError()) {
                System.out.println(vodAsyncVCreativeTaskResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodAsyncVCreativeTaskResponse.toString()); // 编码采用UTF8
            System.out.println(vodAsyncVCreativeTaskResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
