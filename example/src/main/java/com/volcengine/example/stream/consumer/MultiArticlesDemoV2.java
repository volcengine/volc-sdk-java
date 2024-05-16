package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.consumer.MultiArticlesRequest;
import com.volcengine.model.stream.consumer.MultiArticlesResponse;
import com.volcengine.model.stream.consumer.MultiArticlesResponseV2;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class MultiArticlesDemoV2 {
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
        groupIdList.add("7278981857889731072,6758714736730178060,7156861953141375500");
        req.setGroupIds(groupIdList);

        try {
            MultiArticlesResponseV2 response = streamConsumerService.multiArticlesV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
