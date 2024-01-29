package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXEdgeRequestRegionsExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestRegionsQuery query = new DescribeImageXEdgeRequestRegionsQuery();

        try {
            DescribeImageXEdgeRequestRegionsRes resp = service.describeImageXEdgeRequestRegions(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
