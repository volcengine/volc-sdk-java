package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageAnalyzeTaskStatusExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageAnalyzeTaskStatusBody body = new UpdateImageAnalyzeTaskStatusBody();

        try {
            UpdateImageAnalyzeTaskStatusRes resp = service.updateImageAnalyzeTaskStatus(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
