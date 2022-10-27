package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.CheckRelationRequest;
import com.volcengine.model.stream.CheckRelationResponse;
import com.volcengine.model.stream.consumer.FollowCheckRequest;
import com.volcengine.model.stream.consumer.FollowCheckResponse;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FollowCheckDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request
        FollowCheckRequest req = new FollowCheckRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setToUserId("toUserId");
        try {
            FollowCheckResponse response = streamConsumerService.followCheck(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
