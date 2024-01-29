package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class CreateImageTranscodeCallbackExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageTranscodeCallbackBody body = new CreateImageTranscodeCallbackBody();

        try {
            CreateImageTranscodeCallbackRes resp = service.createImageTranscodeCallback(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
