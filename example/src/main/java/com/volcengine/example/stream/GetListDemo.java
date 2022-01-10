package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.GetListRequest;
import com.volcengine.model.stream.GetListResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class GetListDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        GetListRequest req = new GetListRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
//        req.setTimestamp(1634117313);
        req.setAccessToken("3116396576811695657888415752ef58");
//        req.setSignature("3116401554681695657863648359c206");
        req.setCategory("server_sdk_demo_default_content_feed_1_3");
        req.setPartner("server_sdk_demo_default_content");

        try {
            GetListResponse response = streamService.getList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
