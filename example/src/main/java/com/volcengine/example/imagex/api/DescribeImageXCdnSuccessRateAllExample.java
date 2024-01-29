package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnSuccessRateAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnSuccessRateAllBody body = new DescribeImageXCdnSuccessRateAllBody();

        try {
            DescribeImageXCdnSuccessRateAllRes resp = service.describeImageXCdnSuccessRateAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
