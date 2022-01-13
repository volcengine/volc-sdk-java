package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.RecommendRelatedUserRequest;
import com.volcengine.model.stream.RecommendRelatedUserResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class RecommendRelatedUserDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        RecommendRelatedUserRequest req = new RecommendRelatedUserRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setOuid("7008339270066766349");
        req.setFollowUserId("104792520555");
        try {
            RecommendRelatedUserResponse response = streamService.recommendRelatedUser(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
