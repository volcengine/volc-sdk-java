package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
