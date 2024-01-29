package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class CreateImageAnalyzeTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageAnalyzeTaskBody body = new CreateImageAnalyzeTaskBody();

        try {
            CreateImageAnalyzeTaskRes resp = service.createImageAnalyzeTask(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
