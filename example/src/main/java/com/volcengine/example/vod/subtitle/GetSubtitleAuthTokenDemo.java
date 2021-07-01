package com.volcengine.example.vod.subtitle;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest;
import com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse;

public class GetSubtitleAuthTokenDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";

        try {
            VodGetSubtitleInfoListRequest.Builder req = VodGetSubtitleInfoListRequest.newBuilder();
            req.setVid(vid);
            Long expireTime = new Long(60);

            String token = vodService.getSubtitleAuthToken(req.build(), expireTime);
            System.out.println(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

