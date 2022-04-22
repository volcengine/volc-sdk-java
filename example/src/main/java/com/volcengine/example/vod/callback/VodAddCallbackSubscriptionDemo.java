package com.volcengine.example.vod.callback;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodAddCallbackSubscriptionRequest;
import com.volcengine.service.vod.model.response.VodAddCallbackSubscriptionResponse;

public class VodAddCallbackSubscriptionDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodAddCallbackSubscriptionRequest.Builder input = com.volcengine.service.vod.model.request.VodAddCallbackSubscriptionRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setUrl("your call back url");
            VodAddCallbackSubscriptionResponse resp = vodService.addCallbackSubscription(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
