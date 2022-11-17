//package com.volcengine.example.live;
//
//import com.alibaba.fastjson.JSON;
//import com.volcengine.model.live.request.*;
//import com.volcengine.model.live.response.*;
//import com.volcengine.service.live.LiveService;
//import com.volcengine.service.live.impl.LiveServiceImpl;
//
///**
// * 与Transcode相关的Demo
// */
//public class LiveTranscodeDemo {
//    public static void main(String[] args) {
//        LiveService liveService = LiveServiceImpl.getInstance();
//        liveService.setAccessKey("your accessKey");
//        liveService.setSecretKey("your secretKey");
//        //
//        createTranscodePresetDemo(liveService);
//        //
//        updateTranscodePresetDemo(liveService);
//        //
//        deleteTranscodePresetDemo(liveService);
//        //
//        listVhostTransCodePresetDemo(liveService);
//        //
//        listCommonTransPresetDetailDemo(liveService);
//    }
//
//    private static void createTranscodePresetDemo(LiveService liveService) {
//        CreateTranscodePresetRequest request = new CreateTranscodePresetRequest();
//        request.setVhost("vhost");
//        request.setApp("app");
//        request.setStatus(1L);
//        request.setSuffixName("");
//        request.setPreset("preset");
//        request.setFPS(30L);
//        try {
//            CreateTranscodePresetResponse response = liveService.createTranscodePreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void updateTranscodePresetDemo(LiveService liveService) {
//        UpdateTranscodePresetRequest request = new UpdateTranscodePresetRequest();
//        request.setVhost("vhost");
//        request.setApp("app");
//        request.setStatus(1L);
//        request.setSuffixName("");
//        request.setPreset("preset");
//        request.setFPS(60L);
//        try {
//            UpdateTranscodePresetResponse response = liveService.updateTranscodePreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void deleteTranscodePresetDemo(LiveService liveService) {
//        DeleteTranscodePresetRequest request = new DeleteTranscodePresetRequest();
//        request.setVhost("vhost");
//        request.setApp("app");
//        request.setPreset("preset");
//        try {
//            DeleteTranscodePresetResponse response = liveService.deleteTranscodePreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void listVhostTransCodePresetDemo(LiveService liveService) {
//        ListVhostTransCodePresetRequest request = new ListVhostTransCodePresetRequest();
//        request.setVhost("vhost");
//        try {
//            ListVhostTransCodePresetResponse response = liveService.listVhostTransCodePreset(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void listCommonTransPresetDetailDemo(LiveService liveService) {
//        ListCommonTransPresetDetailRequest request = new ListCommonTransPresetDetailRequest();
//        request.setPresetList(new String[]{"Preset1", "Preset1"});
//        try {
//            ListCommonTransPresetDetailResponse response = liveService.listCommonTransPresetDetail(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
