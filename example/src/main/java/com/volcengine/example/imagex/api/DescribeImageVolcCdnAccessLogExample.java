package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageVolcCdnAccessLogExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageVolcCdnAccessLogQuery query = new DescribeImageVolcCdnAccessLogQuery();
        DescribeImageVolcCdnAccessLogBody body = new DescribeImageVolcCdnAccessLogBody();
        
        try {
            DescribeImageVolcCdnAccessLogRes resp = service.describeImageVolcCdnAccessLog(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
