package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.RecommendCategoryUserRequest;
import com.volcengine.model.stream.RecommendCategoryUserResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class RecommendCategoryUserDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        RecommendCategoryUserRequest req = new RecommendCategoryUserRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setOuid("7008339270066766349");
        req.setChannelId(0);
        req.setOffset(0);
        req.setCount(5);
        try {
            RecommendCategoryUserResponse response = streamService.recommendCategoryUser(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
