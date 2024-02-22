package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DescribeIPAccessRuleExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeIPAccessRuleBody body = new DescribeIPAccessRuleBody();

        try {
            DescribeIPAccessRuleRes resp = service.describeIPAccessRule(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
