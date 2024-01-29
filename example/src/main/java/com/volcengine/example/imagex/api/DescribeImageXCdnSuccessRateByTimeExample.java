package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnSuccessRateByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnSuccessRateByTimeBody body = new DescribeImageXCdnSuccessRateByTimeBody();

        try {
            DescribeImageXCdnSuccessRateByTimeRes resp = service.describeImageXCdnSuccessRateByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
