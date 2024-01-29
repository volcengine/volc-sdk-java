package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXMirrorRequestBandwidthExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestBandwidthBody body = new DescribeImageXMirrorRequestBandwidthBody();

        try {
            DescribeImageXMirrorRequestBandwidthRes resp = service.describeImageXMirrorRequestBandwidth(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
