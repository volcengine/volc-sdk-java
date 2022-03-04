package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Record相关的demo
 */
public class LiveRecordDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //
        createRecordPresetDemo(liveService);
        //
        updateRecordPresetDemo(liveService);
        //
        describeRecordPresetDemo(liveService);
        //
        describeRecordPresetDetailDemo(liveService);
        //
        deleteRecordPresetDemo(liveService);
        //
        listVhostRecordPresetDemo(liveService);
    }

    private static void createRecordPresetDemo(LiveService liveService) {
        CreateRecordPresetRequest request = new CreateRecordPresetRequest();
        try {
            CreateRecordPresetResponse response = liveService.createRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateRecordPresetDemo(LiveService liveService) {
        UpdateRecordPresetRequest request = new UpdateRecordPresetRequest();
        try {
            UpdateRecordPresetResponse response = liveService.updateRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void describeRecordPresetDemo(LiveService liveService) {
        DescribeRecordPresetRequest request = new DescribeRecordPresetRequest();
        try {
            DescribeRecordPresetResponse response = liveService.describeRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void describeRecordPresetDetailDemo(LiveService liveService) {
        DescribeRecordPresetDetailRequest request = new DescribeRecordPresetDetailRequest();
        try {
            DescribeRecordPresetDetailResponse response = liveService.describeRecordPresetDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteRecordPresetDemo(LiveService liveService) {
        DeleteRecordPresetRequest request = new DeleteRecordPresetRequest();
        try {
            DeleteRecordPresetResponse response = liveService.deleteRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listVhostRecordPresetDemo(LiveService liveService) {

        ListVhostRecordPresetRequest request = new ListVhostRecordPresetRequest();
        try {
            ListVhostRecordPresetResponse response = liveService.listVhostRecordPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
