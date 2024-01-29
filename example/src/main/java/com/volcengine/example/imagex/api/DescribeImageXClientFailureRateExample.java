package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientFailureRateExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientFailureRateBody body = new DescribeImageXClientFailureRateBody();

        try {
            DescribeImageXClientFailureRateRes resp = service.describeImageXClientFailureRate(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
