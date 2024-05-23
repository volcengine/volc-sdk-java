package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.video_aiot.request.GetStreamDataRequest;
import com.volcengine.model.video_aiot.response.GetStreamDataResponse;
import com.volcengine.model.video_aiot.response.GetStreamResponse;
import com.volcengine.service.videoaiot.VideoAIoTService;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    public static final VideoAIoTService videoAIoTService = VideoAIoTServiceImpl.getInstance();

    @Test
    public void getStreamStatusByStreamTag() throws Exception {
        VideoAIoTServiceImpl videoAIoTService1 = (VideoAIoTServiceImpl) videoAIoTService;
        List<NameValuePair> query = new ArrayList<>();
        query.add(new BasicNameValuePair("StreamTag", "{domain}:{appname}:{streamname}"));
        RawResponse stream = videoAIoTService1.query("GetStream", query);
        if (stream.getException() != null) {
            throw stream.getException();
        }
        GetStreamResponse resp = JSON.parseObject(stream.getData(), GetStreamResponse.class);
        if (resp.getResponseMetadata().getError() != null) {
            throw new Exception(resp.getResponseMetadata().getError().getMessage());
        }
        System.out.println(resp.getStream().getStatus());
    }
}
