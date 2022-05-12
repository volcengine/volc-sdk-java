package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListCdnTopAccessUrlRequest;
import com.volcengine.service.vod.model.response.VodListCdnTopAccessUrlResponse;

public class VodListCdnTopAccessUrlDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListCdnTopAccessUrlRequest.Builder input = VodListCdnTopAccessUrlRequest.newBuilder();
            input.setDomains("your domain");
            input.setStartTimestamp(0);
            input.setEndTimestamp(0);
            input.setSortType("your sort type");
            VodListCdnTopAccessUrlResponse resp = vodService.listCdnTopAccessUrl(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
