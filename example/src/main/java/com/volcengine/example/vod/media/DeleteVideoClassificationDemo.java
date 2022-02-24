package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDeleteVideoClassificationRequest;
import com.volcengine.service.vod.model.response.VodDeleteVideoClassificationResponse;

public class DeleteVideoClassificationDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String space = "your space";
        long classificationId = 0;

        try {
            VodDeleteVideoClassificationRequest.Builder req = VodDeleteVideoClassificationRequest.newBuilder();
            req.setSpaceName(space);
            req.setClassificationId(classificationId);
            VodDeleteVideoClassificationResponse resp = vodService.deleteVideoClassification(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
