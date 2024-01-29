package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageOCRV2Example {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageOCRV2Query query = new GetImageOCRV2Query();
        GetImageOCRV2Body body = new GetImageOCRV2Body();
        
        try {
            GetImageOCRV2Res resp = service.getImageOCRV2(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
