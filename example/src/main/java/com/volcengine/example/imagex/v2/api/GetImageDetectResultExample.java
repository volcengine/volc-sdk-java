package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetImageDetectResultExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageDetectResultQuery query = new GetImageDetectResultQuery();
        GetImageDetectResultBody body = new GetImageDetectResultBody();
        
        try {
            GetImageDetectResultRes resp = service.getImageDetectResult(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
