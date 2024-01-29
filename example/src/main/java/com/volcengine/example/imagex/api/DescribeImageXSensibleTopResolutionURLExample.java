package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXSensibleTopResolutionURLExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSensibleTopResolutionURLBody body = new DescribeImageXSensibleTopResolutionURLBody();

        try {
            DescribeImageXSensibleTopResolutionURLRes resp = service.describeImageXSensibleTopResolutionURL(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
