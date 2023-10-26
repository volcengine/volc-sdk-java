package com.volcengine.example.stream.consumer;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.GetListRequest;
import com.volcengine.model.stream.consumer.SingleArticleRequest;
import com.volcengine.model.stream.consumer.SingleArticleResponse;
import com.volcengine.model.stream.consumer.SingleArticleResponseV2;
import com.volcengine.service.stream.StreamConsumerService;
import com.volcengine.service.stream.impl.StreamConsumerServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class SingleArticleDemoV2 {
    public static void main(String[] args) {
        //初始化一个service
        StreamConsumerService streamConsumerService = StreamConsumerServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamConsumerService.setAccessKey("ak");
        streamConsumerService.setSecretKey("sk");
        //初始化一个request

        SingleArticleRequest req = new SingleArticleRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setGroupId("7138365312264569377");

        try {
            SingleArticleResponseV2 response = streamConsumerService.singleArticleV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
