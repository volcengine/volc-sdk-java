// Code generated by protoc-gen-volcengine-sdk
// source: describeVodSpaceWorkflowDetailData
// DO NOT EDIT!

package com.volcengine.example.vod.measure;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodDescribeVodSpaceWorkflowDetailDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.DescribeVodSpaceWorkflowDetailDataRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.DescribeVodSpaceWorkflowDetailDataRequest.newBuilder();
			reqBuilder.setRegion("your Region");
			reqBuilder.setSpace("your Space");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setPageSize(0);
			reqBuilder.setPageNum(0);
			
            com.volcengine.service.vod.model.response.DescribeVodSpaceWorkflowDetailDataResponse resp = vodService.describeVodSpaceWorkflowDetailData(reqBuilder.build());
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