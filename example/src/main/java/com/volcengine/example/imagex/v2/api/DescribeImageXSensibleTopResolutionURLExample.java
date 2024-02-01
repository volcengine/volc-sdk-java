package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
