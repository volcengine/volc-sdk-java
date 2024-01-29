package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageFileKeyExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageFileKeyQuery query = new UpdateImageFileKeyQuery();
        UpdateImageFileKeyBody body = new UpdateImageFileKeyBody();
        
        try {
            UpdateImageFileKeyRes resp = service.updateImageFileKey(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
