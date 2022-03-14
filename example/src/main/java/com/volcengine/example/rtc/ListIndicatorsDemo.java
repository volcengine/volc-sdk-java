package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListIndicatorsRequest;
import com.volcengine.model.response.ListIndicatorsResponse;
import com.volcengine.service.rtc.RtcService;
import com.volcengine.service.rtc.impl.RtcServiceImpl;

public class ListIndicatorsDemo {
    public static void main(String[] args) {
        //注意：1.0.33版本之前的getInstance方法不是单例模式，内部存在监控http client的守护线程，多次重复调用可能会产生内存泄露
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            ListIndicatorsRequest listIndicatorsRequest = new ListIndicatorsRequest();
             
            listIndicatorsRequest.setAppId("123");
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
