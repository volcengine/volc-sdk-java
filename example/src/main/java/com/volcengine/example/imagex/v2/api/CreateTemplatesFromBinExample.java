package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class CreateTemplatesFromBinExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateTemplatesFromBinQuery query = new CreateTemplatesFromBinQuery();
        CreateTemplatesFromBinBody body = new CreateTemplatesFromBinBody();
        
        try {
            CreateTemplatesFromBinRes resp = service.createTemplatesFromBin(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
