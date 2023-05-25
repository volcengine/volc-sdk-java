package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;
import com.volcengine.service.vms.request.UploadVoiceResourceRequest;

public class CommitResourceUploadDemo {

    public static void main(String[] args) {
        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");

        try {
            UploadVoiceResourceRequest uploadVoiceResourceRequest = new UploadVoiceResourceRequest();
            uploadVoiceResourceRequest.setFileName("mytest.mp3");
            notifyService.commitVoiceResourceUpload(uploadVoiceResourceRequest);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
