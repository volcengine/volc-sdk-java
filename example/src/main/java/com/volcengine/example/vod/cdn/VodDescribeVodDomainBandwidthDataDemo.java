package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest;
import com.volcengine.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse;

public class VodDescribeVodDomainBandwidthDataDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodDescribeVodDomainBandwidthDataRequest.Builder input = com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.newBuilder();
            input.setDomainList("your domain list");
            input.setStartTime("start time");
            input.setEndTime("end time");
            input.setAggregation(0);
            input.setBandwidthType("");
            VodDescribeVodDomainBandwidthDataResponse resp = vodService.describeVodDomainBandwidthData(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
