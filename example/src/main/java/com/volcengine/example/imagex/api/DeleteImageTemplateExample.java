package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DeleteImageTemplateExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageTemplateQuery query = new DeleteImageTemplateQuery();
        DeleteImageTemplateBody body = new DeleteImageTemplateBody();
        
        try {
            DeleteImageTemplateRes resp = service.deleteImageTemplate(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
