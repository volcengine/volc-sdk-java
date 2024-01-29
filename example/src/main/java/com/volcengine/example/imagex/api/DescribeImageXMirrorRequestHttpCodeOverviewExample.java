package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXMirrorRequestHttpCodeOverviewExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestHttpCodeOverviewBody body = new DescribeImageXMirrorRequestHttpCodeOverviewBody();

        try {
            DescribeImageXMirrorRequestHttpCodeOverviewRes resp = service.describeImageXMirrorRequestHttpCodeOverview(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
