package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.RelatedArticleRequest;
import com.volcengine.model.stream.RelatedArticleResponse;
import com.volcengine.model.stream.RelatedArticleResponseV2;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class RelatedArticleV2Demo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        RelatedArticleRequest req = new RelatedArticleRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        req.setOs("ios");
        req.setClientVersion("3.1.1");
        req.setGroupId("7287890094584037951");
        try {
            RelatedArticleResponseV2 response = streamService.relatedArticleV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
