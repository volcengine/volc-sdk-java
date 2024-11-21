package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DescribeImageXHeifEncodeSuccessCountByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXHeifEncodeSuccessCountByTimeBody body = new DescribeImageXHeifEncodeSuccessCountByTimeBody();

        try {
            DescribeImageXHeifEncodeSuccessCountByTimeRes resp = service.describeImageXHeifEncodeSuccessCountByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
