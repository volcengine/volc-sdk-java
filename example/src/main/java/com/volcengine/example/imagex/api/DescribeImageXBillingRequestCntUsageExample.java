package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXBillingRequestCntUsageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXBillingRequestCntUsageQuery query = new DescribeImageXBillingRequestCntUsageQuery();

        try {
            DescribeImageXBillingRequestCntUsageRes resp = service.describeImageXBillingRequestCntUsage(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
