package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXServerQPSUsageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXServerQPSUsageQuery query = new DescribeImageXServerQPSUsageQuery();

        try {
            DescribeImageXServerQPSUsageRes resp = service.describeImageXServerQPSUsage(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
