package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
