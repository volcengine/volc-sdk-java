package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUpdateVideoClassificationRequest;
import com.volcengine.service.vod.model.response.VodUpdateVideoClassificationResponse;

public class UpdateVideoClassificationDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String space = "your space";
        long classificationId = 0;
        String classification = "you classification";

        try {
            VodUpdateVideoClassificationRequest.Builder req = VodUpdateVideoClassificationRequest.newBuilder();
            req.setSpaceName(space);
            req.setClassificationId(classificationId);
            req.setClassification(classification);
            VodUpdateVideoClassificationResponse resp = vodService.updateVideoClassification(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
