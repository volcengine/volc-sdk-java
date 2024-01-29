package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXUploadErrorCodeByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXUploadErrorCodeByTimeBody body = new DescribeImageXUploadErrorCodeByTimeBody();

        try {
            DescribeImageXUploadErrorCodeByTimeRes resp = service.describeImageXUploadErrorCodeByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
