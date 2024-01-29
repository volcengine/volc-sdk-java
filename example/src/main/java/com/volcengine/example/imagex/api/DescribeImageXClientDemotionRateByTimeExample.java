package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientDemotionRateByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientDemotionRateByTimeBody body = new DescribeImageXClientDemotionRateByTimeBody();

        try {
            DescribeImageXClientDemotionRateByTimeRes resp = service.describeImageXClientDemotionRateByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
