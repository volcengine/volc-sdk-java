package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImagePSDetectionExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImagePSDetectionQuery query = new GetImagePSDetectionQuery();
        GetImagePSDetectionBody body = new GetImagePSDetectionBody();
        
        try {
            GetImagePSDetectionRes resp = service.getImagePSDetection(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
