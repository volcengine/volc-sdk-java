package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXUploadSegmentSpeedByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXUploadSegmentSpeedByTimeBody body = new DescribeImageXUploadSegmentSpeedByTimeBody();

        try {
            DescribeImageXUploadSegmentSpeedByTimeRes resp = service.describeImageXUploadSegmentSpeedByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
