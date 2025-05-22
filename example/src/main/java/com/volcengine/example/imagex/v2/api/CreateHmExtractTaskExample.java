package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class CreateHmExtractTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateHmExtractTaskQuery query = new CreateHmExtractTaskQuery();
        CreateHmExtractTaskBody body = new CreateHmExtractTaskBody();
        
        try {
            CreateHmExtractTaskRes resp = service.createHmExtractTask(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
