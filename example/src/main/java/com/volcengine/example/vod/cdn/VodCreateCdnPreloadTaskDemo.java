package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCreateCdnPreloadTaskRequest;
import com.volcengine.service.vod.model.request.VodCreateCdnRefreshTaskRequest;
import com.volcengine.service.vod.model.response.VodCreateCdnPreloadTaskResponse;
import com.volcengine.service.vod.model.response.VodCreateCdnRefreshTaskResponse;

public class VodCreateCdnPreloadTaskDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodCreateCdnPreloadTaskRequest.Builder input = com.volcengine.service.vod.model.request.VodCreateCdnPreloadTaskRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setUrls("your urls");
            VodCreateCdnPreloadTaskResponse resp = vodService.createCdnPreloadTask(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
