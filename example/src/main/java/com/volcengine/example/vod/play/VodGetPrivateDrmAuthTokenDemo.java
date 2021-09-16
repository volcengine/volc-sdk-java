package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest;

public class VodGetPrivateDrmAuthTokenDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");
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
