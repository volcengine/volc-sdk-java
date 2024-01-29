package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXHitRateRequestDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXHitRateRequestDataQuery query = new DescribeImageXHitRateRequestDataQuery();

        try {
            DescribeImageXHitRateRequestDataRes resp = service.describeImageXHitRateRequestData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
