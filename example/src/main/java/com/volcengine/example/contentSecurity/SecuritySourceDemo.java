package com.volcengine.example.contentSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SecuritySourceRequest;
import com.volcengine.model.response.SecuritySourceResponse;
import com.volcengine.service.contentSecurity.SecuritySourceException;
import com.volcengine.service.contentSecurity.SecuritySourceService;
import com.volcengine.service.contentSecurity.impl.SecuritySourceServiceImpl;

import java.util.stream.Stream;

public class SecuritySourceDemo {

    public static void main(String[] args) {

        SecuritySourceService securitySourceService = SecuritySourceServiceImpl.getInstance();

        securitySourceService.setAccessKey("");
        securitySourceService.setSecretKey("");

        SecuritySourceRequest securitySourceRequest = new SecuritySourceRequest();
        securitySourceRequest.setAppId(500424);
        securitySourceRequest.setService("security_source");
        /**
         * parameters example:
         * {\"prompt\":\"北京天气怎么样？\",\"search_type\":1,\"session_id\":\"012\",\"text_risk_request_id\":\"202311131015044453AD703DC4393800B8\",\"session_id\":\"xxxx\",\"operate_time\":1700019336,\"account_id\":\"1700019336\"}
         */
        securitySourceRequest.setParameters("{\"prompt\":\"北京天气怎么样？\",\"search_type\":1,\"session_id\":\"012\",\"text_risk_request_id\":\"202311131015044453AD703DC4393800B8\",\"session_id\":\"xxxx\",\"operate_time\":1700019336,\"account_id\":\"1700019336\"}");
        testGetSecuritySourceStream(securitySourceService, securitySourceRequest);
        testGetSecuritySource(securitySourceService, securitySourceRequest);
    }

    private static void testGetSecuritySource(SecuritySourceService service, SecuritySourceRequest req) {
        try {
            SecuritySourceResponse securitySourceResponse = service.getSecuritySource(req);
            System.out.println(JSON.toJSONString(securitySourceResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testGetSecuritySourceStream(SecuritySourceService service, SecuritySourceRequest req) {
        Stream<SecuritySourceResponse> resps = null;

        try {
            resps = service.getSecuritySourceStream(req);
        } catch (SecuritySourceException e) {
            e.printStackTrace();
            // throw exception
        }

        assert resps != null;

        try {
            resps.forEach(resp -> {
                System.out.println(JSON.toJSONString(resp));
            });
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof SecuritySourceException) {
                System.out.println("code: " + ((SecuritySourceException) cause).getCode());
                System.out.println("msg: " + ((SecuritySourceException) cause).getMsg());
            }
            System.out.println("caught: " + e);
        }
    }

}
