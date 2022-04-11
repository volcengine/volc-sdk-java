package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.FollowCardLogRequest;
import com.volcengine.model.stream.log.FollowLogRequest;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class FollowCardLogDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        FollowCardLogRequest req = new FollowCardLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        List<FollowCardLogRequest.Body> bodyList = new ArrayList<>();

        FollowCardLogRequest.Body body = new FollowCardLogRequest.Body();
        body.setFollowType("from_group");
        body.setProfileUserId("104792520555");
        body.setToUserId("104792520555");
        body.setCategoryName("fhh_app_default_content");
        body.setSource("list_follow_card_related");
        body.setActionType("show");
        body.setOrder(2);
        bodyList.add(body);

        req.setBody(bodyList);
        try {
            LogResponse response = logService.followCardLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
