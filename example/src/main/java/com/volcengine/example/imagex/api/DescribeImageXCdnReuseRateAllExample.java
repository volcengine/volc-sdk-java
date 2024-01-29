package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnReuseRateAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnReuseRateAllBody body = new DescribeImageXCdnReuseRateAllBody();

        try {
            DescribeImageXCdnReuseRateAllRes resp = service.describeImageXCdnReuseRateAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
