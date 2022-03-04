package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Transcode相关的Demo
 */
public class LiveTranscodeDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //
        createTranscodePresetDemo(liveService);
        //
        updateTranscodePresetDemo(liveService);
        //
        deleteTranscodePresetDemo(liveService);
    }

    private static void createTranscodePresetDemo(LiveService liveService) {
        CreateTranscodePresetRequest request = new CreateTranscodePresetRequest();
        try {
            CreateTranscodePresetResponse response = liveService.createTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateTranscodePresetDemo(LiveService liveService) {
        UpdateTranscodePresetRequest request = new UpdateTranscodePresetRequest();
        try {
            UpdateTranscodePresetResponse response = liveService.updateTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteTranscodePresetDemo(LiveService liveService) {
        DeleteTranscodePresetRequest request = new DeleteTranscodePresetRequest();
        try {
            DeleteTranscodePresetResponse response = liveService.deleteTranscodePreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
