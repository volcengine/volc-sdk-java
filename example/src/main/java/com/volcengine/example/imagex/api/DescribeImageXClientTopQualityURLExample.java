package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientTopQualityURLExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientTopQualityURLBody body = new DescribeImageXClientTopQualityURLBody();

        try {
            DescribeImageXClientTopQualityURLRes resp = service.describeImageXClientTopQualityURL(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
