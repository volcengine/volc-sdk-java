package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXMirrorRequestHttpCodeByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestHttpCodeByTimeBody body = new DescribeImageXMirrorRequestHttpCodeByTimeBody();

        try {
            DescribeImageXMirrorRequestHttpCodeByTimeRes resp = service.describeImageXMirrorRequestHttpCodeByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
