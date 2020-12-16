package com.volcengine.example.media;

import com.volcengine.model.vod.request.VodUpdateMediaPublishStatusRequest;
import com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class UpdateMediaPublishStatusDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

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