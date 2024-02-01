package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateServiceNameExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateServiceNameQuery query = new UpdateServiceNameQuery();
        UpdateServiceNameBody body = new UpdateServiceNameBody();
        
        try {
            UpdateServiceNameRes resp = service.updateServiceName(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
