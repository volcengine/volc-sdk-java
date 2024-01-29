package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXSensibleTopRamURLExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSensibleTopRamURLBody body = new DescribeImageXSensibleTopRamURLBody();

        try {
            DescribeImageXSensibleTopRamURLRes resp = service.describeImageXSensibleTopRamURL(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
