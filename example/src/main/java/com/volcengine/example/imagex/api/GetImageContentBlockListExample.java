package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageContentBlockListExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageContentBlockListQuery query = new GetImageContentBlockListQuery();
        GetImageContentBlockListBody body = new GetImageContentBlockListBody();
        
        try {
            GetImageContentBlockListRes resp = service.getImageContentBlockList(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
