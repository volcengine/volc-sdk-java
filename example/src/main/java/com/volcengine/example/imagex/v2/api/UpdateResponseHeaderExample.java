package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
