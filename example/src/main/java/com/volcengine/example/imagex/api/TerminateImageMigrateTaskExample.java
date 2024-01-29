package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class TerminateImageMigrateTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        TerminateImageMigrateTaskQuery query = new TerminateImageMigrateTaskQuery();

        try {
            TerminateImageMigrateTaskRes resp = service.terminateImageMigrateTask(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
