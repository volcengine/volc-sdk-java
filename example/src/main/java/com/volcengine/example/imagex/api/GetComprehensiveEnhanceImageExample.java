package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetComprehensiveEnhanceImageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetComprehensiveEnhanceImageBody body = new GetComprehensiveEnhanceImageBody();

        try {
            GetComprehensiveEnhanceImageRes resp = service.getComprehensiveEnhanceImage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
