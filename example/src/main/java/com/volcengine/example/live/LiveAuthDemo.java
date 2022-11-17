//package com.volcengine.example.live;
//
//import com.alibaba.fastjson.JSON;
//import com.volcengine.model.live.request.*;
//import com.volcengine.model.live.response.*;
//import com.volcengine.service.live.LiveService;
//import com.volcengine.service.live.impl.LiveServiceImpl;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 与Auth相关的demo
// */
//public class LiveAuthDemo {
//    public static void main(String[] args) {
//        LiveService liveService = LiveServiceImpl.getInstance();
//        liveService.setAccessKey("your accessKey");
//        liveService.setSecretKey("your secretKey");
//        //
//        updateAuthKeyDemo(liveService);
//        //
//        describeAuthDemo(liveService);
//
//    }
//
//    private static void updateAuthKeyDemo(LiveService liveService) {
//        UpdateAuthKeyRequest request = new UpdateAuthKeyRequest();
//        request.setDomain("your domain");
//        request.setSceneType("push");
//        Map<String, String> items = new HashMap<>();
//        items.put("EncryptionAlgorithm", "md5");
//        items.put("SecretKey", "your SecretKey");
//        request.setAuthDetailList(new Object[]{items});
//        try {
//            UpdateAuthKeyResponse response = liveService.updateAuthKey(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    private static void describeAuthDemo(LiveService liveService) {
//        DescribeAuthRequest request = new DescribeAuthRequest();
//        request.setDomain("your domain");
//        try {
//            DescribeAuthResponse response = liveService.describeAuth(request);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
