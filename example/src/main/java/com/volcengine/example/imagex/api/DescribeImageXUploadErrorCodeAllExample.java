package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
