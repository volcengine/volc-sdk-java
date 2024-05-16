package com.volcengine.example.stream;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.stream.GetListRequest;
import com.volcengine.model.stream.GetListResponse;
import com.volcengine.service.stream.StreamService;
import com.volcengine.service.stream.impl.StreamServiceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

// GetListDemo 该版本已逐渐废弃，请使用V2版本
public class GetListDemo {
    public static void main(String[] args) {
        //初始化一个service
        StreamService streamService = StreamServiceImpl.getInstance();

        //设置ak，sk 此为请求的凭证
        streamService.setAccessKey("ak");
        streamService.setSecretKey("sk");

        //初始化一个request
        GetListRequest req = new GetListRequest();
        req.setTimestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        req.setAccessToken("accessToken");
        req.setCategory("category");
        req.setPartner("partner");
        req.setOffPersonalRec(1);
        try {
            GetListResponse response = streamService.getList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
