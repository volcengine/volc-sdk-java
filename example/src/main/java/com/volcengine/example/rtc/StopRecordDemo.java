package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.example.rtc.impl.RtcServiceImpl;
import com.volcengine.example.rtc.model.StartRecordRequest;
import com.volcengine.example.rtc.model.StartRecordResponse;
import com.volcengine.example.rtc.model.StopRecordRequest;
import com.volcengine.example.rtc.model.StopRecordResponse;

public class StopRecordDemo {
    public static void main(String[] args) {
        //注意：1.0.33版本之前的getInstance方法不是单例模式，内部存在监控http client的守护线程，多次重复调用可能会产生内存泄露
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            StopRecordRequest stopRecordRequest = new StopRecordRequest();
            stopRecordRequest.setAppId("Your_AppId");
            stopRecordRequest.setBusinessId("Your_BusinessId");
            stopRecordRequest.setRoomId("Your_RoomId");
            stopRecordRequest.setTaskId("Your_TaskId");
            StopRecordResponse stopRecordResponse = rtcService.stopRecord(stopRecordRequest);
            System.out.println(JSON.toJSONString(stopRecordResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
