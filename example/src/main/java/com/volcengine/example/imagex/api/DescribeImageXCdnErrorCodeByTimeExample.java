package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnErrorCodeByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnErrorCodeByTimeBody body = new DescribeImageXCdnErrorCodeByTimeBody();

        try {
            DescribeImageXCdnErrorCodeByTimeRes resp = service.describeImageXCdnErrorCodeByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
