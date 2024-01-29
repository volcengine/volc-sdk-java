package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DeleteTemplatesFromBinExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteTemplatesFromBinQuery query = new DeleteTemplatesFromBinQuery();
        DeleteTemplatesFromBinBody body = new DeleteTemplatesFromBinBody();
        
        try {
            DeleteTemplatesFromBinRes resp = service.deleteTemplatesFromBin(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
