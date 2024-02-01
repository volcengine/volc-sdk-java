package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DescribeImageXUploadSuccessRateByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXUploadSuccessRateByTimeBody body = new DescribeImageXUploadSuccessRateByTimeBody();

        try {
            DescribeImageXUploadSuccessRateByTimeRes resp = service.describeImageXUploadSuccessRateByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
