package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
