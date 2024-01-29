package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetAuditEntrysCountExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetAuditEntrysCountQuery query = new GetAuditEntrysCountQuery();

        try {
            GetAuditEntrysCountRes resp = service.getAuditEntrysCount(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
