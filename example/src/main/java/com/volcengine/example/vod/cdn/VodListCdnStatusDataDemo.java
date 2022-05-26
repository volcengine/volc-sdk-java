package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListCdnStatusDataRequest;
import com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse;

public class VodListCdnStatusDataDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListCdnStatusDataRequest.Builder input = VodListCdnStatusDataRequest.newBuilder();
            input.setDomains("your domains");
            input.setStartTimestamp(0);
            input.setEndTimestamp(0);
            input.setDataType("your dataType");
            input.setInterval("your interval");
            input.setMetric("your metric");
            VodCdnStatisticsCommonResponse resp = vodService.listCdnStatusData(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
