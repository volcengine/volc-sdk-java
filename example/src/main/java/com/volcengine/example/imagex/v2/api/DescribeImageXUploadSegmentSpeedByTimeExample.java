package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
