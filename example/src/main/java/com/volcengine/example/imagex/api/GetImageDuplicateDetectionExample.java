package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageDuplicateDetectionExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageDuplicateDetectionQuery query = new GetImageDuplicateDetectionQuery();
        GetImageDuplicateDetectionBody body = new GetImageDuplicateDetectionBody();
        
        try {
            GetImageDuplicateDetectionRes resp = service.getImageDuplicateDetection(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
