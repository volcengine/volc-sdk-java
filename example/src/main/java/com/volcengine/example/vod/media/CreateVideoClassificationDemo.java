package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCreateVideoClassificationRequest;
import com.volcengine.service.vod.model.response.VodCreateVideoClassificationResponse;

public class CreateVideoClassificationDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String space = "your space";
        int level = 1;
        long parentId = 0;
        String classification = "you classification";

        try {
            VodCreateVideoClassificationRequest.Builder req = VodCreateVideoClassificationRequest.newBuilder();
            req.setSpaceName(space);
            req.setLevel(level);
            req.setParentId(parentId);
            req.setClassification(classification);
            VodCreateVideoClassificationResponse resp = vodService.createVideoClassification(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
