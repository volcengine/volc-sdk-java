package com.volcengine.example.notify.resource;

import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;
import com.volcengine.service.notify.model.request.UploadVoiceResourceRequest;

public class GenerateResourceUploadUrlDemo {

    public static void main(String[] args) {
        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");


        try {
            UploadVoiceResourceRequest uploadVoiceResourceRequest = new UploadVoiceResourceRequest();
            uploadVoiceResourceRequest.setFileName("mytest.mp3");
            notifyService.generateVoiceResourceUploadUrl(uploadVoiceResourceRequest);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
