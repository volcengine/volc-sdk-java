package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXDomainBandwidthNinetyFiveDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXDomainBandwidthNinetyFiveDataQuery query = new DescribeImageXDomainBandwidthNinetyFiveDataQuery();

        try {
            DescribeImageXDomainBandwidthNinetyFiveDataRes resp = service.describeImageXDomainBandwidthNinetyFiveData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
