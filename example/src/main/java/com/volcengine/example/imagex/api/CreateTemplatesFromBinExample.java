package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
