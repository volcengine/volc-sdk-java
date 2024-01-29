package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class ExportFailedMigrateTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ExportFailedMigrateTaskQuery query = new ExportFailedMigrateTaskQuery();

        try {
            ExportFailedMigrateTaskRes resp = service.exportFailedMigrateTask(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
