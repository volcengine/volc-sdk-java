// Code generated by protoc-gen-volcengine-sdk
// source: describeVodDomainBandwidthData
// DO NOT EDIT!

package com.volcengine.example.vod.measure;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodDescribeVodDomainBandwidthDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.newBuilder();
			reqBuilder.setDomainList("your DomainList");
			reqBuilder.setDomainInSpaceList("your DomainInSpaceList");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setAggregation(0);
			reqBuilder.setBandwidthType("your BandwidthType");
			reqBuilder.setArea("your Area");
			reqBuilder.setRegionList("your RegionList");
			
            com.volcengine.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse resp = vodService.describeVodDomainBandwidthData(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}