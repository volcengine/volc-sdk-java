package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
