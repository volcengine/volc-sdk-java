package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest;

public class VodGetPrivateDrmAuthTokenDemo {
    public static void main(String[] args) throws Exception {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");


        String vid = "your vid";
        String unionInfo = "your unionInfo";
        Long expireTime = 3600L; // token expireTime
        try {
            VodGetPrivateDrmPlayAuthRequest.Builder reqBuilder = VodGetPrivateDrmPlayAuthRequest.newBuilder();
            reqBuilder.setVid(vid);
            reqBuilder.setDrmType("your drm type");
            reqBuilder.setPlayAuthIds("your playAuthIds");
            reqBuilder.setUnionInfo(unionInfo);

            String resp = vodService.getPrivateDrmAuthToken(reqBuilder.build(), expireTime);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
