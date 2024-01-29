package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageAuditResultExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageAuditResultQuery query = new GetImageAuditResultQuery();

        try {
            GetImageAuditResultRes resp = service.getImageAuditResult(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
