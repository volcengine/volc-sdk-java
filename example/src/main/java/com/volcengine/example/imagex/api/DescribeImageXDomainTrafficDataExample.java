package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXDomainTrafficDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXDomainTrafficDataQuery query = new DescribeImageXDomainTrafficDataQuery();

        try {
            DescribeImageXDomainTrafficDataRes resp = service.describeImageXDomainTrafficData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
