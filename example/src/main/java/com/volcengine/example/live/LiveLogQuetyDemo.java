package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.DescribeLiveDomainLogRequest;
import com.volcengine.model.live.response.DescribeLiveDomainLogResponse;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveLogQuetyDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        describeLiveDomainLogDemo(liveService);

    }

    public static void describeLiveDomainLogDemo(LiveService liveService) {

        String jsonStr = "{\n" +
                "    \"Domain\":\"example.com\",\n" +
                "    \"StartTime\": \"2022-04-19T00:00:00Z\",\n" +
                "    \"EndTime\": \"2022-04-19T00:01:59Z\",\n" +
                "}";
        DescribeLiveDomainLogRequest request = JSON.parseObject(jsonStr, DescribeLiveDomainLogRequest.class);
        try {
            DescribeLiveDomainLogResponse response = liveService.describeLiveDomainLog(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
