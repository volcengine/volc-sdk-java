package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientDecodeSuccessRateByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientDecodeSuccessRateByTimeBody body = new DescribeImageXClientDecodeSuccessRateByTimeBody();

        try {
            DescribeImageXClientDecodeSuccessRateByTimeRes resp = service.describeImageXClientDecodeSuccessRateByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
