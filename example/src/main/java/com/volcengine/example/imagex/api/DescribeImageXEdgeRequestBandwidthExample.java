package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXEdgeRequestBandwidthExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestBandwidthQuery query = new DescribeImageXEdgeRequestBandwidthQuery();

        try {
            DescribeImageXEdgeRequestBandwidthRes resp = service.describeImageXEdgeRequestBandwidth(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
