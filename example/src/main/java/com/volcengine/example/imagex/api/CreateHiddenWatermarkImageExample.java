package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class CreateHiddenWatermarkImageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateHiddenWatermarkImageQuery query = new CreateHiddenWatermarkImageQuery();
        CreateHiddenWatermarkImageBody body = new CreateHiddenWatermarkImageBody();
        
        try {
            CreateHiddenWatermarkImageRes resp = service.createHiddenWatermarkImage(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
