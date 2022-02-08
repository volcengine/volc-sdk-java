package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCreateVideoClassificationRequest;
import com.volcengine.service.vod.model.request.VodListVideoClassificationsRequest;
import com.volcengine.service.vod.model.response.VodCreateVideoClassificationResponse;
import com.volcengine.service.vod.model.response.VodListVideoClassificationsResponse;

public class ListVideoClassificationsDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String space = "your space";
        long classificationId = 0;

        try {
            VodListVideoClassificationsRequest.Builder req = VodListVideoClassificationsRequest.newBuilder();
            req.setSpaceName(space);
            req.setClassificationId(classificationId);
            VodListVideoClassificationsResponse resp = vodService.listVideoClassifications(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
