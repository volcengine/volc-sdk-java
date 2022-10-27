package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.example.rtc.impl.RtcServiceImpl;
import com.volcengine.example.rtc.model.GetRecordTaskRequest;
import com.volcengine.example.rtc.model.GetRecordTaskResponse;
import com.volcengine.example.rtc.model.StopRecordRequest;
import com.volcengine.example.rtc.model.StopRecordResponse;

public class GetRecordTaskDemo {
    public static void main(String[] args) {
        //注意：1.0.33版本之前的getInstance方法不是单例模式，内部存在监控http client的守护线程，多次重复调用可能会产生内存泄露
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            GetRecordTaskRequest getRecordTaskRequest = new GetRecordTaskRequest();
            getRecordTaskRequest.setAppId("Your_AppId");
            getRecordTaskRequest.setRoomId("Your_RoomId");
            getRecordTaskRequest.setTaskId("Your_TaskId");
            GetRecordTaskResponse getRecordTaskResponse = rtcService.getRecordTask(getRecordTaskRequest);
            System.out.println(JSON.toJSONString(getRecordTaskResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
