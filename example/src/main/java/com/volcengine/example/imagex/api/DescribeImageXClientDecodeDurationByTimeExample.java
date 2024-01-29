package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientDecodeDurationByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientDecodeDurationByTimeBody body = new DescribeImageXClientDecodeDurationByTimeBody();

        try {
            DescribeImageXClientDecodeDurationByTimeRes resp = service.describeImageXClientDecodeDurationByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
