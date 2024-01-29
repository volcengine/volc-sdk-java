package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientFileSizeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientFileSizeBody body = new DescribeImageXClientFileSizeBody();

        try {
            DescribeImageXClientFileSizeRes resp = service.describeImageXClientFileSize(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
