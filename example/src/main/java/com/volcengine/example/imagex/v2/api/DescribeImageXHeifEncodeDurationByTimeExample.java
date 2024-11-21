package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DescribeImageXHeifEncodeDurationByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXHeifEncodeDurationByTimeBody body = new DescribeImageXHeifEncodeDurationByTimeBody();

        try {
            DescribeImageXHeifEncodeDurationByTimeRes resp = service.describeImageXHeifEncodeDurationByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
