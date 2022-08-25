package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.CallbackDetail;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

//审核截图相关demo
public class LiveSnapshotAuditDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");
        //
        createSnapshotAuditPresetDemo(liveService);
        //
        updateSnapshotAuditPresetDemo(liveService);
        //
        deleteSnapshotAuditPresetDemo(liveService);
        //
        listVhostSnapshotAuditPresetDemo(liveService);
    }

    private static void createSnapshotAuditPresetDemo(LiveService liveService) {
        CreateSnapshotAuditPresetRequest request = new CreateSnapshotAuditPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setInterval(2.3);
        request.setBucket("bucket");
        request.setLabel(new String[]{"301"});
        CallbackDetail callbackDetail = new CallbackDetail();
        callbackDetail.setCallbackType("http");
        callbackDetail.setURL("http://xx");
        request.setCallbackDetailList(new CallbackDetail[]{callbackDetail});
        request.setStorageStrategy(1L);
        try {
            CreateSnapshotAuditPresetResponse response = liveService.createSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateSnapshotAuditPresetDemo(LiveService liveService) {
        UpdateSnapshotAuditPresetRequest request = new UpdateSnapshotAuditPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setInterval(4.5);
        request.setBucket("bucket");
        request.setPresetName("presetName");
        try {
            UpdateSnapshotAuditPresetResponse response = liveService.updateSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void deleteSnapshotAuditPresetDemo(LiveService liveService) {
        DeleteSnapshotAuditPresetRequest request = new DeleteSnapshotAuditPresetRequest();
        request.setVhost("vhost");
        request.setApp("app");
        request.setPresetName("presetName");
        try {
            DeleteSnapshotAuditPresetResponse response = liveService.deleteSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listVhostSnapshotAuditPresetDemo(LiveService liveService) {
        ListVhostSnapshotAuditPresetRequest request = new ListVhostSnapshotAuditPresetRequest();
        request.setVhost("vhost");
        try {
            ListVhostSnapshotAuditPresetResponse response = liveService.listVhostSnapshotAuditPreset(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
