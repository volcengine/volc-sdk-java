//package com.volcengine.example.live;
//
//import com.alibaba.fastjson.JSON;
//import com.volcengine.model.live.RecordTob;
//import com.volcengine.model.live.request.*;
//import com.volcengine.model.live.response.*;
//import com.volcengine.service.live.LiveService;
//import com.volcengine.service.live.impl.LiveServiceImpl;
//
///**
// * 与Record相关的demo
// */
//public class LiveRecordDemo {
//    public static void main(String[] args) {
//        LiveService liveService = LiveServiceImpl.getInstance();
//        liveService.setAccessKey("your accessKey");
//        liveService.setSecretKey("your secretKey");
//        //
//        createRecordPresetDemo(liveService);
//        //
//        updateRecordPresetDemo(liveService);
//        //
//        deleteRecordPresetDemo(liveService);
//        //
//        listVhostRecordPresetDemo(liveService);
//    }
//
//    private static void createRecordPresetDemo(LiveService liveService) {
//
//        CreateRecordPresetRequest request = new CreateRecordPresetRequest();
//        request.setVhost("vhost");
//        request.setApp("app");
//        request.setBucket("bb");
//        RecordTob recordTob1 = new RecordTob();
//        recordTob1.setDuration(100L);
//        recordTob1.setFormat("");
//        recordTob1.setSplice(100L);
//        recordTob1.setRecordObject("");
//        request.setRecordTob(new RecordTob[]{recordTob1});
//        try {
//            CreateRecordPresetResponse response = liveService.createRecordPreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void updateRecordPresetDemo(LiveService liveService) {
//
//        UpdateRecordPresetRequest request = new UpdateRecordPresetRequest();
//        request.setPreset("preset1");
//        request.setVhost("vhost");
//        request.setApp("app");
//        request.setStatus(1L);
//        request.setBucket("bb");
//        RecordTob recordTob1 = new RecordTob();
//        recordTob1.setDuration(100L);
//        recordTob1.setFormat("hls");
//        recordTob1.setSplice(-1L);
//        recordTob1.setRecordObject("/xx/xx");
//        request.setRecordTob(new RecordTob[]{recordTob1});
//        try {
//            UpdateRecordPresetResponse response = liveService.updateRecordPreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private static void deleteRecordPresetDemo(LiveService liveService) {
//
//        DeleteRecordPresetRequest request = new DeleteRecordPresetRequest();
//        request.setVhost("vhost");
//        request.setPreset("preset");
//        request.setApp("app");
//        try {
//            DeleteRecordPresetResponse response = liveService.deleteRecordPreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void listVhostRecordPresetDemo(LiveService liveService) {
//
//        ListVhostRecordPresetRequest request = new ListVhostRecordPresetRequest();
//        request.setVhost("vhost");
//        try {
//            ListVhostRecordPresetResponse response = liveService.listVhostRecordPreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
