package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.FollowLogRequest;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class FollowLogDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        FollowLogRequest req = new FollowLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        List<FollowLogRequest.Body> bodyList = new ArrayList<>();

        FollowLogRequest.Body body = new FollowLogRequest.Body();
        body.setGroupId("7008339270066766349");
        body.setToUserId("104792520555");
        body.setCategoryName("__ALL__");
        body.setSource("article_detail");
        bodyList.add(body);

        FollowLogRequest.Body body1 = new FollowLogRequest.Body();
        body1.setGroupId("7008339270066766349");
        body1.setToUserId("104792520555");
        body1.setCategoryName("__ALL__");
        body1.setSource("article_detail");
        bodyList.add(body1);

        req.setBody(body);
        try {
            LogResponse response = logService.followLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
