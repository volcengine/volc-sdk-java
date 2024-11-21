package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageDomainVolcOriginExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageDomainVolcOriginQuery query = new UpdateImageDomainVolcOriginQuery();
        UpdateImageDomainVolcOriginBody body = new UpdateImageDomainVolcOriginBody();
        
        try {
            UpdateImageDomainVolcOriginRes resp = service.updateImageDomainVolcOrigin(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
