package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageDomainIPAuthExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageDomainIPAuthQuery query = new UpdateImageDomainIPAuthQuery();
        UpdateImageDomainIPAuthBody body = new UpdateImageDomainIPAuthBody();
        
        try {
            UpdateImageDomainIPAuthRes resp = service.updateImageDomainIPAuth(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
