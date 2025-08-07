package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DeleteImageAIProcessDetailExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageAIProcessDetailBody body = new DeleteImageAIProcessDetailBody();

        try {
            DeleteImageAIProcessDetailRes resp = service.deleteImageAIProcessDetail(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
