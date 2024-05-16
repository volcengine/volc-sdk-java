package com.volcengine.example.stream.log;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.log.FavouriteLogRequest;
import com.volcengine.model.stream.log.LogResponse;
import com.volcengine.service.stream.LogService;
import com.volcengine.service.stream.impl.LogServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FavouriteLogDemo {
    public static void main(String[] args) {
        //初始化一个service
        LogService logService = LogServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        logService.setAccessKey("ak");
        logService.setSecretKey("sk");

        //初始化一个request
        FavouriteLogRequest req = new FavouriteLogRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        req.setGroupId("6938426748178530823");
        req.setCategory("__ALL__");
        req.setEventTime("1626861782");
        req.setPosition("list");
        req.setDt("iphone6s");
        req.setOs("iOS");
        req.setOsVersion("12");
        req.setClientVersion("7.3.25");
        req.setDeviceBrand("Apple");
        try {
            LogResponse response = logService.favouriteLog(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
