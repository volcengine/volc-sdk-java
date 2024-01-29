package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXEdgeRequestTrafficExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestTrafficQuery query = new DescribeImageXEdgeRequestTrafficQuery();

        try {
            DescribeImageXEdgeRequestTrafficRes resp = service.describeImageXEdgeRequestTraffic(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
