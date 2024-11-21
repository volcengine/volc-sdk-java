package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageDomainUaAccessExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageDomainUaAccessQuery query = new UpdateImageDomainUaAccessQuery();
        UpdateImageDomainUaAccessBody body = new UpdateImageDomainUaAccessBody();
        
        try {
            UpdateImageDomainUaAccessRes resp = service.updateImageDomainUaAccess(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
