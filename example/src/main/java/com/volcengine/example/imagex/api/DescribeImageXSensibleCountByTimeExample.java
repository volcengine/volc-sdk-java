package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXSensibleCountByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSensibleCountByTimeBody body = new DescribeImageXSensibleCountByTimeBody();

        try {
            DescribeImageXSensibleCountByTimeRes resp = service.describeImageXSensibleCountByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
