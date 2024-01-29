package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class RerunImageMigrateTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        RerunImageMigrateTaskQuery query = new RerunImageMigrateTaskQuery();

        try {
            RerunImageMigrateTaskRes resp = service.rerunImageMigrateTask(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
