package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXSensibleTopUnknownURLExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSensibleTopUnknownURLBody body = new DescribeImageXSensibleTopUnknownURLBody();

        try {
            DescribeImageXSensibleTopUnknownURLRes resp = service.describeImageXSensibleTopUnknownURL(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
