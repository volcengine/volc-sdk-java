package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class CreateImageAIProcessCallbackExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageAIProcessCallbackBody body = new CreateImageAIProcessCallbackBody();

        try {
            CreateImageAIProcessCallbackRes resp = service.createImageAIProcessCallback(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
