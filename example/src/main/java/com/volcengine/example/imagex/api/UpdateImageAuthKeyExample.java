package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageAuthKeyExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageAuthKeyQuery query = new UpdateImageAuthKeyQuery();
        UpdateImageAuthKeyBody body = new UpdateImageAuthKeyBody();
        
        try {
            UpdateImageAuthKeyRes resp = service.updateImageAuthKey(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
