package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCDNTopRequestDataExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCDNTopRequestDataQuery query = new DescribeImageXCDNTopRequestDataQuery();

        try {
            DescribeImageXCDNTopRequestDataRes resp = service.describeImageXCDNTopRequestData(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
