package com.volcengine.example.vod.callback;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodSetCallbackEventRequest;
import com.volcengine.service.vod.model.response.VodSetCallbackEventResponse;

public class VodSetCallbackEventDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodSetCallbackEventRequest.Builder input = com.volcengine.service.vod.model.request.VodSetCallbackEventRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setEvents("your event");
            input.setPrivateKey("your private key");
            input.setAuthEnabled("1"); //1: enable; 0:disable
            VodSetCallbackEventResponse resp = vodService.setCallbackEvent(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
