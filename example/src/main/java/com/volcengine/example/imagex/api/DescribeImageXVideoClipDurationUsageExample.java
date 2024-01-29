package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXVideoClipDurationUsageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXVideoClipDurationUsageQuery query = new DescribeImageXVideoClipDurationUsageQuery();

        try {
            DescribeImageXVideoClipDurationUsageRes resp = service.describeImageXVideoClipDurationUsage(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
