package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageStyleResultExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageStyleResultQuery query = new GetImageStyleResultQuery();
        GetImageStyleResultBody body = new GetImageStyleResultBody();
        
        try {
            GetImageStyleResultRes resp = service.getImageStyleResult(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
