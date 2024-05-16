package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.HotBoardBoardRequest;
import com.volcengine.model.stream.HotBoardBoardResponse;
import com.volcengine.model.stream.HotBoardListRequest;
import com.volcengine.model.stream.HotBoardListResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class HotBoardBoardDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");
        //初始化一个request
        HotBoardBoardRequest req = new HotBoardBoardRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setPartner("partner");
        req.setHotBoardGid("7022784394884546573");
        try {
            HotBoardBoardResponse response = streamService.hotBoardBoard(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
