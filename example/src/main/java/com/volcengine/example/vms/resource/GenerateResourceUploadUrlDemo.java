package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.UploadVoiceResourceRequest;

public class GenerateResourceUploadUrlDemo {

    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            UploadVoiceResourceRequest uploadVoiceResourceRequest = new UploadVoiceResourceRequest();
            uploadVoiceResourceRequest.setFileName("mytest.mp3");
            vmsService.generateVoiceResourceUploadUrl(uploadVoiceResourceRequest);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
