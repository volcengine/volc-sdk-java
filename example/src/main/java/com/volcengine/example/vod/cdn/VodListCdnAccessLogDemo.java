package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest;
import com.volcengine.service.vod.model.response.VodListCdnAccessLogResponse;

public class VodListCdnAccessLogDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListCdnAccessLogRequest.Builder input = com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setDomains("your domain");
            input.setStartTime(0);
            input.setEndTime(0);
            VodListCdnAccessLogResponse resp = vodService.listCdnAccessLog(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
