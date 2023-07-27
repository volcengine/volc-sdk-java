package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.UploadVoiceResourceRequest;

public class GenerateResourceUploadUrlDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");
    }
    public static void main(String[] args) {
        try {
            UploadVoiceResourceRequest uploadVoiceResourceRequest = new UploadVoiceResourceRequest();
            uploadVoiceResourceRequest.setFileName("mytest.mp3");
            vmsService.generateVoiceResourceUploadUrl(uploadVoiceResourceRequest);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
