package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXScreenshotUsageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXScreenshotUsageQuery query = new DescribeImageXScreenshotUsageQuery();

        try {
            DescribeImageXScreenshotUsageRes resp = service.describeImageXScreenshotUsage(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
