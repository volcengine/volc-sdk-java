package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.FollowRequest;
import com.volcengine.model.stream.FollowResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;


import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FollowDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        FollowRequest req = new FollowRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setUserId("104792520555");
        try {
            FollowResponse response = streamService.follow(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
