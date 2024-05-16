package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.UnfollowRequest;
import com.volcengine.model.stream.UnfollowResponse;
import com.volcengine.model.stream.consumer.UnfollowActionRequest;
import com.volcengine.model.stream.consumer.UnfollowActionResponse;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class UnfollowActionDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request
        UnfollowActionRequest req = new UnfollowActionRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        req.setToUserId("toUserId");
        try {
            UnfollowActionResponse response = streamConsumerService.unfollowAction(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
