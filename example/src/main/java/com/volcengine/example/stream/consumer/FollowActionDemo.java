package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.FollowRequest;
import com.volcengine.model.stream.FollowResponse;
import com.volcengine.model.stream.consumer.FollowActionRequest;
import com.volcengine.model.stream.consumer.FollowActionResponse;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FollowActionDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request
        FollowActionRequest req = new FollowActionRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        req.setToUserId("toUserId");
        try {
            FollowActionResponse response = streamConsumerService.followAction(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
