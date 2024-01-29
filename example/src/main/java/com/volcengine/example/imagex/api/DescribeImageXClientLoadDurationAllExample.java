package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientLoadDurationAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientLoadDurationAllBody body = new DescribeImageXClientLoadDurationAllBody();

        try {
            DescribeImageXClientLoadDurationAllRes resp = service.describeImageXClientLoadDurationAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
