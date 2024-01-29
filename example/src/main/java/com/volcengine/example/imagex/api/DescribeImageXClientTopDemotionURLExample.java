package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientTopDemotionURLExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientTopDemotionURLBody body = new DescribeImageXClientTopDemotionURLBody();

        try {
            DescribeImageXClientTopDemotionURLRes resp = service.describeImageXClientTopDemotionURL(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
