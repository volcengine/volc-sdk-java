package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.ForbidStreamRequest;
import com.volcengine.model.live.request.ResumeStreamRequest;
import com.volcengine.model.live.response.ForbidStreamResponse;
import com.volcengine.model.live.response.ResumeStreamResponse;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Stream相关的demo
 */
public class LiveStreamDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //禁播直播流
        forbidStreamDemo(liveService);
        //恢复禁播直播流
        resumeStreamDemo(liveService);

    }

    /**
     * 禁播直播流
     *
     * @param liveService
     */
    private static void forbidStreamDemo(LiveService liveService) {
        ForbidStreamRequest request = new ForbidStreamRequest();
        request.setDomain("domain");
        request.setApp("app");
        request.setStream("stream");
        request.setEndTime("2022-03-8 11:49:58");
        try {
            ForbidStreamResponse response = liveService.forbidStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 恢复禁播直播流
     *
     * @param liveService
     */
    private static void resumeStreamDemo(LiveService liveService) {
        ResumeStreamRequest request = new ResumeStreamRequest();
        request.setDomain("domain");
        request.setApp("app");
        request.setStream("stream");
        try {
            ResumeStreamResponse response = liveService.resumeStream(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
