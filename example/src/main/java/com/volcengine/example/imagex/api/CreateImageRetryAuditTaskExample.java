package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class CreateImageRetryAuditTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageRetryAuditTaskBody body = new CreateImageRetryAuditTaskBody();

        try {
            CreateImageRetryAuditTaskRes resp = service.createImageRetryAuditTask(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
