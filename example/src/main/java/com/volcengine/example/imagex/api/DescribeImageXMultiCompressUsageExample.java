package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXMultiCompressUsageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMultiCompressUsageQuery query = new DescribeImageXMultiCompressUsageQuery();

        try {
            DescribeImageXMultiCompressUsageRes resp = service.describeImageXMultiCompressUsage(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
