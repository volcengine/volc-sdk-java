package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateHttpsExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateHttpsQuery query = new UpdateHttpsQuery();
        UpdateHttpsBody body = new UpdateHttpsBody();
        
        try {
            UpdateHttpsRes resp = service.updateHttps(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
