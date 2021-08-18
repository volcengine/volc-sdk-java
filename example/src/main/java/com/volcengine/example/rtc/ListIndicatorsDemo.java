package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListIndicatorsRequest;
import com.volcengine.model.response.ListIndicatorsResponse;
import com.volcengine.service.rtc.RtcService;
import com.volcengine.service.rtc.impl.RtcServiceImpl;

public class ListIndicatorsDemo {
    public static void main(String[] args) {
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("AKLTZGNlZDA5NmIwNGZkNGNkZWJlYzc4MjI5YjVmZWI5ODI");
        rtcService.setSecretKey("TnpZNU16VmhaRGxsTnpFeU5EZzNNemhsTnpVeU0yRTJaR05sTURrMk16SQ==");

        try {
            ListIndicatorsRequest listIndicatorsRequest = new ListIndicatorsRequest();
             
            listIndicatorsRequest.setAppId("6110e5394f69bb00ca885806");
            listIndicatorsRequest.setStartTime("2021-08-01T00:00:00+08:00");
            listIndicatorsRequest.setEndTime("2021-08-20T00:00:00+08:00");
            listIndicatorsRequest.setIndicator("NetworkTransDelay");
            //listIndicatorsRequest.setOS("android");
            //listIndicatorsRequest.setNetwork("wifi");
            ListIndicatorsResponse listIndicatorsResponse = rtcService.listIndicators(listIndicatorsRequest);
            System.out.println(JSON.toJSONString(listIndicatorsResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
