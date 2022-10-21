package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.example.rtc.impl.RtcServiceImpl;
import com.volcengine.example.rtc.model.StartRecordRequest;
import com.volcengine.example.rtc.model.StartRecordResponse;

public class StartRecordDemo {
    public static void main(String[] args) {
        //注意：1.0.33版本之前的getInstance方法不是单例模式，内部存在监控http client的守护线程，多次重复调用可能会产生内存泄露
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            StartRecordRequest startRecordRequest = new StartRecordRequest();
            startRecordRequest.setAppId("Your_AppId");
            startRecordRequest.setBusinessId("Your_BusinessId");
            startRecordRequest.setRoomId("Your_RoomId");
            startRecordRequest.setTaskId("Your_TaskId");
            startRecordRequest.setRecordMode(0);
            startRecordRequest.setEncode(startRecordRequest.new Encode(
                    1920,
                    1080,
                    15,
                    4000,
                    0,
                    4,
                    0,
                    0,
                    64,
                    48000,
                    2
            ));
            startRecordRequest.setLayout(startRecordRequest.new Layout(0));
            startRecordRequest.setControl(startRecordRequest.new Control(
                    0,
                    0,
                    180,
                    0
            ));
            startRecordRequest.setFileFormatConfig(startRecordRequest.new FileFormatConfig(new String[]{"MP4"}));
            startRecordRequest.setStorageConfig(startRecordRequest.new StorageConfig(0, startRecordRequest.new TosConfig(
                    "Your_AccountId",
                    0,
                    "Your_Bucket"
            )));

            StartRecordResponse startRecordResponse = rtcService.startRecord(startRecordRequest);
            System.out.println(JSON.toJSONString(startRecordResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
