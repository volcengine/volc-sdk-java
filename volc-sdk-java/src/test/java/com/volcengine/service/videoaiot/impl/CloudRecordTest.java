package com.volcengine.service.videoaiot.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.video_aiot.request.ListDeviceRecordsRequest;
import com.volcengine.model.video_aiot.request.ListStreamRecordsRequestV3;
import com.volcengine.model.video_aiot.request.PlayCloudRecordRequest;
import com.volcengine.model.video_aiot.response.ListDeviceRecordsResponse;
import com.volcengine.model.video_aiot.response.ListStreamRecordsResponseV3;
import com.volcengine.model.video_aiot.response.PlayCloudResponse;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.volcengine.service.videoaiot.impl.BaseTest.setTest;
import static com.volcengine.service.videoaiot.impl.BaseTest.videoAIoTService;

public class CloudRecordTest {


    @Test
    public void testListStreamRecords() throws Exception {
        setTest();
        ListStreamRecordsRequestV3 listStreamRecordsRequestV3 = new ListStreamRecordsRequestV3();
        listStreamRecordsRequestV3.setStreamID("1e1ac1b1-571f-4aaf-9330-7cbcee4ed078");
        listStreamRecordsRequestV3.setReqType("record_metadata");
        listStreamRecordsRequestV3.setResolution("");
        listStreamRecordsRequestV3.setStartTime(1701878400);
        listStreamRecordsRequestV3.setEndTime(1701964800);
        listStreamRecordsRequestV3.setWithSub(true);
        ListStreamRecordsResponseV3 listStreamRecordsResponseV3 = videoAIoTService.listStreamRecords(listStreamRecordsRequestV3);
        System.out.println(JSON.toJSONString(listStreamRecordsResponseV3));
    }


    @Test
    public void testListDeviceRecords() throws Exception {
        setTest();
        ListDeviceRecordsRequest listStreamRecordsRequestV3 = new ListDeviceRecordsRequest();
        listStreamRecordsRequestV3.setStreamID("1e1ac1b1-571f-4aaf-9330-7cbcee4ed078");
        listStreamRecordsRequestV3.setReqType("record_metadata");
        listStreamRecordsRequestV3.setResolution("");
        listStreamRecordsRequestV3.setStartTs(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date(System.currentTimeMillis()-3600*1000)));
        listStreamRecordsRequestV3.setEndTs(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));
        listStreamRecordsRequestV3.setWithSub(true);
        ListDeviceRecordsResponse listStreamRecordsResponseV3 = videoAIoTService.listDeviceRecords(listStreamRecordsRequestV3);
        System.out.println(JSON.toJSONString(listStreamRecordsResponseV3));
    }

    @Test
    public void testPlayCloudRecords() throws Exception {
        //bad89d4d-1fd5-4498-a49e-5b0faf835022", "", 1704941499, 1704941599
        setTest();
        PlayCloudRecordRequest cloudRecordPlayRequest = new PlayCloudRecordRequest();
        cloudRecordPlayRequest.setStreamID("75d9d794-82c9-4d29-8700-2bd448552e73");
        cloudRecordPlayRequest.setResolution("");
        cloudRecordPlayRequest.setStartTime(1718870400);
        cloudRecordPlayRequest.setEndTime(1718874060);
        cloudRecordPlayRequest.setTokenValid(86400);
        cloudRecordPlayRequest.setWithSub(false);
        PlayCloudResponse playCloudResponse = videoAIoTService.playCloudRecord(cloudRecordPlayRequest);
        System.out.println(JSON.toJSONString(playCloudResponse));
    }
}
