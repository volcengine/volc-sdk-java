package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDeleteMediaRequest;
import com.volcengine.service.vod.model.response.VodDeleteMediaResponse;

public class DeleteMediaDemo {
    public static void main(String[] args) {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

        String vids = "vid1,vid2,vid3";
        String callBackArgs = "CallBackArgs";

        try {
            VodDeleteMediaRequest.Builder req = VodDeleteMediaRequest.newBuilder();
            req.setVids(vids);
            req.setCallbackArgs(callBackArgs);

            VodDeleteMediaResponse resp = vodService.deleteMedia(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
