package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageTranscodeQueuesExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageTranscodeQueuesQuery query = new GetImageTranscodeQueuesQuery();

        try {
            GetImageTranscodeQueuesRes resp = service.getImageTranscodeQueues(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
