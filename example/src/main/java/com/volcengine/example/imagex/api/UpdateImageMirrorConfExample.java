package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageMirrorConfExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageMirrorConfQuery query = new UpdateImageMirrorConfQuery();
        UpdateImageMirrorConfBody body = new UpdateImageMirrorConfBody();
        
        try {
            UpdateImageMirrorConfRes resp = service.updateImageMirrorConf(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
