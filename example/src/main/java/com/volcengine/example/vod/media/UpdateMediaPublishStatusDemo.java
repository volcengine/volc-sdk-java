package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUpdateMediaPublishStatusRequest;
import com.volcengine.service.vod.model.response.VodUpdateMediaPublishStatusResponse;

public class UpdateMediaPublishStatusDemo {
    public static void main(String[] args) {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");


        String vid1 = "vid1";
        String vid2 = "vid2";
        String statusPublished = "Published";
        String statusUnpublished = "Unpublished";

        try {
            // publish
            VodUpdateMediaPublishStatusRequest.Builder req = VodUpdateMediaPublishStatusRequest.newBuilder();
            req.setVid(vid1);
            req.setStatus(statusPublished);

            VodUpdateMediaPublishStatusResponse resp = vodService.updateMediaPublishStatus(req.build());
            System.out.println(resp);

            Thread.sleep(1000);

            // unpublish
            VodUpdateMediaPublishStatusRequest.Builder req1 = VodUpdateMediaPublishStatusRequest.newBuilder();
            req1.setVid(vid2);
            req1.setStatus(statusUnpublished);

            VodUpdateMediaPublishStatusResponse resp1 = vodService.updateMediaPublishStatus(req1.build());
            System.out.println(resp1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}