package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
