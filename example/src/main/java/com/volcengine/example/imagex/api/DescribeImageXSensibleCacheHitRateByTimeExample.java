package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXSensibleCacheHitRateByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSensibleCacheHitRateByTimeBody body = new DescribeImageXSensibleCacheHitRateByTimeBody();

        try {
            DescribeImageXSensibleCacheHitRateByTimeRes resp = service.describeImageXSensibleCacheHitRateByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
