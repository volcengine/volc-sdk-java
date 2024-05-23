package com.volcengine.service.videoaiot.impl;


import com.volcengine.helper.Const;
import com.volcengine.service.videoaiot.VideoAIoTConfig;
import com.volcengine.service.videoaiot.VideoAIoTService;

public class BaseTest {
    public static final VideoAIoTService videoAIoTService = VideoAIoTServiceImpl.getInstance();

    public static void setTest() {
        String host = System.getenv("host");
        if (host != null) {
            VideoAIoTConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1).setHost(host);
        }
        videoAIoTService.setAccessKey(System.getenv("ak"));
        videoAIoTService.setSecretKey(System.getenv("sk"));
    }


}
