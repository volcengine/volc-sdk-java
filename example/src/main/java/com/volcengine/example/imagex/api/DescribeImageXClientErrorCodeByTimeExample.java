package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientErrorCodeByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientErrorCodeByTimeBody body = new DescribeImageXClientErrorCodeByTimeBody();

        try {
            DescribeImageXClientErrorCodeByTimeRes resp = service.describeImageXClientErrorCodeByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
