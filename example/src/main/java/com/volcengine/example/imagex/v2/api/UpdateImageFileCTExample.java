package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageFileCTExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageFileCTQuery query = new UpdateImageFileCTQuery();
        UpdateImageFileCTBody body = new UpdateImageFileCTBody();
        
        try {
            UpdateImageFileCTRes resp = service.updateImageFileCT(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
