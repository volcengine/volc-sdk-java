package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateResponseHeaderExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateResponseHeaderQuery query = new UpdateResponseHeaderQuery();
        UpdateResponseHeaderBody body = new UpdateResponseHeaderBody();
        
        try {
            UpdateResponseHeaderRes resp = service.updateResponseHeader(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
