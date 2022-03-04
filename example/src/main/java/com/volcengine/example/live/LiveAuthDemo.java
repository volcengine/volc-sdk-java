package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Auth相关的demo
 */
public class LiveAuthDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //
        updateAuthKeyDemo(liveService);
        //
        enableAuthDemo(liveService);
        //
        disableAuthDemo(liveService);
        //
        describeAuthDemo(liveService);

    }

    private static void updateAuthKeyDemo(LiveService liveService) {
        UpdateAuthKeyRequest request = new UpdateAuthKeyRequest();
        try {
            UpdateAuthKeyResponse response = liveService.updateAuthKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void enableAuthDemo(LiveService liveService) {
        EnableAuthRequest request = new EnableAuthRequest();
        try {
            EnableAuthResponse response = liveService.enableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void disableAuthDemo(LiveService liveService) {
        DisableAuthRequest request = new DisableAuthRequest();
        try {
            DisableAuthResponse response = liveService.disableAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void describeAuthDemo(LiveService liveService) {
        DescribeAuthRequest request = new DescribeAuthRequest();
        try {
            DescribeAuthResponse response = liveService.describeAuth(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
