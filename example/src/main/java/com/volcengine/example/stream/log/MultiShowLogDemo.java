package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.model.stream.log.MultiShowLogRequest;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class MultiShowLogDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        MultiShowLogRequest req = new MultiShowLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("4016360944571705153676044295679a");
        req.setPartner("server_sdk_demo_default_content");
        List<MultiShowLogRequest.Body> bodyList = new ArrayList<>();

        MultiShowLogRequest.Body body = new MultiShowLogRequest.Body();
        body.setGroupId("7008339270066766349");
        body.setCategory("fhh_app_default_content");
        body.setEventTime(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        body.setFromGid("6938426748178530823");
        body.setDt("iphone6s");
        body.setOs("iOS");
        body.setOsVersion("1.0.0");
        body.setClientVersion("7.3.25");
        body.setDeviceBrand("Apple");
        bodyList.add(body);

        MultiShowLogRequest.Body body1 = new MultiShowLogRequest.Body();
        body1.setGroupId("7008339270066766349");
        body1.setCategory("fhh_app_default_content");
        body1.setEventTime(1626861782);
        body1.setFromGid("6938426748178530823");
        body1.setDt("iphone6s");
        body1.setOs("iOS");
        body1.setOsVersion("1.0.0");
        body1.setClientVersion("7.3.25");
        body1.setDeviceBrand("Apple");
        bodyList.add(body1);

        req.setBody(bodyList);
        try {
            LogResponse response = logService.multiShowLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
