package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.video_aiot.request.GetStreamDataRequest;
import com.volcengine.model.video_aiot.response.GetStreamDataResponse;
import org.junit.Test;

import static com.volcengine.service.videoaiot.impl.BaseTest.setTest;
import static com.volcengine.service.videoaiot.impl.BaseTest.videoAIoTService;

public class StreamTest {
    @Test
    public void testGetStreamData() {
        setTest();
        // 流维度的数据查询
        GetStreamDataRequest streamRequest = new GetStreamDataRequest();
        streamRequest.setStreamID("2df95fef-65b1-4569-8866-7fdfcfe2190b");
        streamRequest.setResolution("6");
        streamRequest.setStartTime("1708853861");
        streamRequest.setEndTime("1708940261");
        try {
            GetStreamDataResponse dataResponse = videoAIoTService.getStreamData(streamRequest);
            System.out.println(JSON.toJSONString(dataResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
