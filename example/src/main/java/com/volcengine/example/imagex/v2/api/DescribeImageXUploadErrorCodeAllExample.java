package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DescribeImageXUploadErrorCodeAllExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXUploadErrorCodeAllBody body = new DescribeImageXUploadErrorCodeAllBody();

        try {
            DescribeImageXUploadErrorCodeAllRes resp = service.describeImageXUploadErrorCodeAll(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
