package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXHitRateTrafficDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXHitRateTrafficDataQuery query = new DescribeImageXHitRateTrafficDataQuery();

        try {
            DescribeImageXHitRateTrafficDataRes resp = service.describeImageXHitRateTrafficData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
