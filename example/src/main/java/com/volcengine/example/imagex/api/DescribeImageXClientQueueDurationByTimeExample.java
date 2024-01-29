package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXClientQueueDurationByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXClientQueueDurationByTimeBody body = new DescribeImageXClientQueueDurationByTimeBody();

        try {
            DescribeImageXClientQueueDurationByTimeRes resp = service.describeImageXClientQueueDurationByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
