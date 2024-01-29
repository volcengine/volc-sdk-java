package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXMirrorRequestTrafficExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestTrafficBody body = new DescribeImageXMirrorRequestTrafficBody();

        try {
            DescribeImageXMirrorRequestTrafficRes resp = service.describeImageXMirrorRequestTraffic(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
