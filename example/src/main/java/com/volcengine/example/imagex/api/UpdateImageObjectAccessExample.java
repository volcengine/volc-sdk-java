package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageObjectAccessExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageObjectAccessQuery query = new UpdateImageObjectAccessQuery();
        UpdateImageObjectAccessBody body = new UpdateImageObjectAccessBody();
        
        try {
            UpdateImageObjectAccessRes resp = service.updateImageObjectAccess(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
