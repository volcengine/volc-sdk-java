package com.volcengine.example.rtc;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ListRoomsRequest;
import com.volcengine.model.response.ListRoomsResponse;
import com.volcengine.service.rtc.RtcService;
import com.volcengine.service.rtc.impl.RtcServiceImpl;

public class ListRoomsDemo {
    public static void main(String[] args) {
        RtcService rtcService = RtcServiceImpl.getInstance();

        rtcService.setAccessKey("AKLTZGNlZDA5NmIwNGZkNGNkZWJlYzc4MjI5YjVmZWI5ODI");
        rtcService.setSecretKey("TnpZNU16VmhaRGxsTnpFeU5EZzNNemhsTnpVeU0yRTJaR05sTURrMk16SQ==");

        try {
            ListRoomsRequest listRoomsRequest = new ListRoomsRequest();

            listRoomsRequest.setAppId("6110e5394f69bb00ca885806");
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
