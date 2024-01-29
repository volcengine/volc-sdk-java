package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnErrorCodeAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnErrorCodeAllBody body = new DescribeImageXCdnErrorCodeAllBody();

        try {
            DescribeImageXCdnErrorCodeAllRes resp = service.describeImageXCdnErrorCodeAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
