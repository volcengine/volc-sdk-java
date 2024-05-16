package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.GetFollowingListRequest;
import com.volcengine.model.stream.GetFollowingListResponse;
import com.volcengine.model.stream.consumer.FollowListRequest;
import com.volcengine.model.stream.consumer.FollowListResponse;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FollowListDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request
        FollowListRequest req = new FollowListRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        req.setCursor(0);
        req.setCount(10);
        try {
            FollowListResponse response = streamConsumerService.followList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
