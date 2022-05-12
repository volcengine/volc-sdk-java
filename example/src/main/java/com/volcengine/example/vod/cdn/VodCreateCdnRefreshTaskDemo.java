package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCreateCdnRefreshTaskRequest;
import com.volcengine.service.vod.model.response.VodCreateCdnRefreshTaskResponse;

public class VodCreateCdnRefreshTaskDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodCreateCdnRefreshTaskRequest.Builder input = com.volcengine.service.vod.model.request.VodCreateCdnRefreshTaskRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setType("your type");
            input.setUrls("your urls");
            VodCreateCdnRefreshTaskResponse resp = vodService.createCdnRefreshTask(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
