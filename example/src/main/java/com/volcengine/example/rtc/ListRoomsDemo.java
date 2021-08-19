package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListRoomsResponse;
import com.volcengine.service.rtc.RtcService;
import com.volcengine.service.rtc.impl.RtcServiceImpl;

public class ListRoomsDemo {
    public static void main(String[] args) {
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("ak");
        rtcService.setSecretKey("sk");

        try {
            ListRoomsRequest listRoomsRequest = new ListRoomsRequest();

            listRoomsRequest.setAppId("123");
            //listRoomsRequest.setRoomId("xukunhao-0816");
            //listRoomsRequest.setReverse(3);
            //listRoomsRequest.setOffset(3);
            //listRoomsRequest.setLimit(3);
            ListRoomsResponse listRoomsResponse = rtcService.listRooms(listRoomsRequest);
            System.out.println(JSON.toJSONString(listRoomsResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
