package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.GetArticlesRequest;
import com.volcengine.model.stream.GetArticlesResponse;
import com.volcengine.model.stream.consumer.MultiArticlesRequest;
import com.volcengine.model.stream.consumer.MultiArticlesResponse;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

// MultiArticlesDemo 该版本已逐渐废弃，请使用V2版本
public class MultiArticlesDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request
        MultiArticlesRequest req = new MultiArticlesRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        List<String> groupIdList = new ArrayList<>();
        groupIdList.add("7156212955586298402");
        req.setGroupIds(groupIdList);

        try {
            MultiArticlesResponse response = streamConsumerService.multiArticles(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
