package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetPrivateImageTypeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetPrivateImageTypeQuery query = new GetPrivateImageTypeQuery();
        GetPrivateImageTypeBody body = new GetPrivateImageTypeBody();
        
        try {
            GetPrivateImageTypeRes resp = service.getPrivateImageType(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
