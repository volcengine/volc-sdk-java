package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class CreateImageTemplateExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageTemplateQuery query = new CreateImageTemplateQuery();
        CreateImageTemplateBody body = new CreateImageTemplateBody();
        
        try {
            CreateImageTemplateRes resp = service.createImageTemplate(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
