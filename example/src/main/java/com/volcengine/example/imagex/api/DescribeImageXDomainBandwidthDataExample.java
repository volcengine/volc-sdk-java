package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXDomainBandwidthDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXDomainBandwidthDataQuery query = new DescribeImageXDomainBandwidthDataQuery();

        try {
            DescribeImageXDomainBandwidthDataRes resp = service.describeImageXDomainBandwidthData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
