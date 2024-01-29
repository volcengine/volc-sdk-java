package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
