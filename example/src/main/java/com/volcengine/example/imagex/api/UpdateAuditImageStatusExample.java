package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateAuditImageStatusExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateAuditImageStatusBody body = new UpdateAuditImageStatusBody();

        try {
            UpdateAuditImageStatusRes resp = service.updateAuditImageStatus(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
