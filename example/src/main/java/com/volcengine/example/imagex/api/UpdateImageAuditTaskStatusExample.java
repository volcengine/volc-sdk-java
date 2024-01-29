package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageAuditTaskStatusExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageAuditTaskStatusBody body = new UpdateImageAuditTaskStatusBody();

        try {
            UpdateImageAuditTaskStatusRes resp = service.updateImageAuditTaskStatus(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
