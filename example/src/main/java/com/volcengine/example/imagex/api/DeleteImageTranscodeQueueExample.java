package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DeleteImageTranscodeQueueExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageTranscodeQueueBody body = new DeleteImageTranscodeQueueBody();

        try {
            DeleteImageTranscodeQueueRes resp = service.deleteImageTranscodeQueue(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
