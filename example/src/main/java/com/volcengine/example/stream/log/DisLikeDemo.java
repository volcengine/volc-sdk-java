package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.DislikeLogRequest;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class DisLikeDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        DislikeLogRequest req = new DislikeLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("server_sdk_demo_default_content");
        List<DislikeLogRequest.Body> bodyList = new ArrayList<>();
        DislikeLogRequest.Body body = new DislikeLogRequest.Body();
        body.setGroupId("7008339270066766349");
        body.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        body.setCategory("fhh_app_default_content");
        List<String> filterWords = new ArrayList<>();
        filterWords.add("id1");
        filterWords.add("id2");
        body.setFilterWords(filterWords);
        bodyList.add(body);

        DislikeLogRequest.Body body1 = new DislikeLogRequest.Body();
        body1.setGroupId("7008339270066766349");
        body1.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        body1.setCategory("fhh_app_default_content");
        List<String> filterWords1 = new ArrayList<>();
        filterWords1.add("id1");
        filterWords1.add("id2");
        body1.setFilterWords(filterWords1);
        bodyList.add(body1);
        req.setBody(bodyList);
        try {
            LogResponse response = logService.dislikeLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
