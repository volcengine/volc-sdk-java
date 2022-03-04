package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * Snapshot相关的demo
 */
public class LiveSnapshotDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //
        createSnapshotPresetDemo(liveService);
        //
        updateSnapshotPresetDemo(liveService);
        //
        deleteSnapshotPresetDemo(liveService);
        //
        listVhostSnapshotPresetDemo(liveService);
    }

    private static void createSnapshotPresetDemo(LiveService liveService) {
        CreateSnapshotPresetRequest request = new CreateSnapshotPresetRequest();
        try {
            CreateSnapshotPresetResponse response = liveService.createSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateSnapshotPresetDemo(LiveService liveService) {
        UpdateSnapshotPresetRequest request = new UpdateSnapshotPresetRequest();
        try {
            UpdateSnapshotPresetResponse response = liveService.updateSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void deleteSnapshotPresetDemo(LiveService liveService) {
        DeleteSnapshotPresetRequest request = new DeleteSnapshotPresetRequest();
        try {
            DeleteSnapshotPresetResponse response = liveService.deleteSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listVhostSnapshotPresetDemo(LiveService liveService) {
        ListVhostSnapshotPresetRequest request = new ListVhostSnapshotPresetRequest();
        try {
            ListVhostSnapshotPresetResponse response = liveService.listVhostSnapshotPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
