package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListRoomsResponse;
import com.volcengine.service.rtc.RtcService;
import com.volcengine.service.rtc.impl.RtcServiceImpl;

public class ListRoomsDemo {
    public static void main(String[] args) {
        //注意：1.0.33版本之前的getInstance方法不是单例模式，内部存在监控http client的守护线程，多次重复调用可能会产生内存泄露
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            ListRoomsRequest listRoomsRequest = new ListRoomsRequest();

            listRoomsRequest.setAppId("123");
            //listRoomsRequest.setRoomId("123");
            //listRoomsRequest.setReverse(0);
            //listRoomsRequest.setOffset(0);
            //listRoomsRequest.setLimit(10);
            ListRoomsResponse listRoomsResponse = rtcService.listRooms(listRoomsRequest);
            System.out.println(JSON.toJSONString(listRoomsResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
