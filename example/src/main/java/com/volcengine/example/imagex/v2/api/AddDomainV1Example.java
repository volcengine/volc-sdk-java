package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class AddDomainV1Example {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        AddDomainV1Query query = new AddDomainV1Query();
        AddDomainV1Body body = new AddDomainV1Body();
        
        try {
            AddDomainV1Res resp = service.addDomainV1(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
