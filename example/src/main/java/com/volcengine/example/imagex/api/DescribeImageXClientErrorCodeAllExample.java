package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientErrorCodeAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientErrorCodeAllBody body = new DescribeImageXClientErrorCodeAllBody();

        try {
            DescribeImageXClientErrorCodeAllRes resp = service.describeImageXClientErrorCodeAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
